package com.dist.training.bdf.controller;

import com.dist.bdf.base.controller.BaseController;
import com.dist.training.bdf.assembler.AppPrelandValueAssembler;
import com.dist.training.bdf.assembler.ProjectBaseAssembler;
import com.dist.training.bdf.entity.instance.AppPrelandValueEntity;
import com.dist.training.bdf.entity.instance.ProjectBaseEntity;
import com.dist.training.bdf.entity.instance.UserEntity;
import com.dist.training.bdf.manager.Result;
import com.dist.training.bdf.service.ProjectBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lijy
 */
@Controller
@RequestMapping("/projects")
public class ProjectBaseController extends BaseController {

  @Autowired
  ProjectBaseService projectBaseService;

//  @RequestBody
//  @RequestMapping(value = "/search", method = RequestMethod.GET)
//  public String search(@RequestParam String key) {
//    return success(projectBaseService.search(key));
//  }

  @ResponseBody
  @RequestMapping(value = "/{id}", method = RequestMethod.POST)
  public String getProject(@PathVariable(name = "id") int id) {
    ProjectBaseEntity entity = projectBaseService.get(id);
    return success(ProjectBaseAssembler.toDTO(entity));
  }

  @ResponseBody
  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  public String getProjectById(@PathVariable(name = "id") int id) {
    AppPrelandValueEntity entity = projectBaseService.getById(id);
    return success(AppPrelandValueAssembler.toDTO(entity));
  }

  @CrossOrigin
  @RequestMapping(value = "/getPage")
  @ResponseBody
  public String getPage(@RequestParam Integer curr) {
    int pageSize = 10;
    return success(projectBaseService.getPage(curr, pageSize));
  }

  @RequestMapping(value = "/newItem", method = RequestMethod.POST)
  @ResponseBody
  public Result newItem(@RequestBody AppPrelandValueEntity newItem) {
    Result result = new Result();
    Integer res = projectBaseService.newItem(newItem);
    if (res == 0)
      result.setMsg("fail");
    result.setMsg("success");
    return result;
  }

  @CrossOrigin
  @RequestMapping(value = "/lineDel", method = RequestMethod.POST)
  @ResponseBody
  public Result lineDel(@RequestBody AppPrelandValueEntity appPrelandValueEntity) {
    Result result = new Result();
    projectBaseService.lineDel(appPrelandValueEntity);
    result.setMsg("success");
    return result;
  }

  @RequestMapping(value = "/getOrdered")
  @ResponseBody
  public String getOrdered(@Param("orderKey")String orderKey, @Param("curr") String curr) {
    int pageSize = 10;
    return success(projectBaseService.getOrdered(curr, pageSize, orderKey));
  }

  @RequestMapping("/getLength")
  @ResponseBody
  public Result getLength() {
    Result result = new Result();
    Integer num = projectBaseService.getCount();
    result.setCount(num);
    return result;
  }

//  @RequestMapping("/checkLogin")
//  @ResponseBody
//  public Result checkLogin(@RequestBody UserEntity user) {
//    return projectBaseService.checkLogin(user);
//  }
}
