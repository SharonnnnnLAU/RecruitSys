package com.dist.training.bdf.service;

import com.dist.bdf.base.data.impl.HibernateBaseDao;
import com.dist.bdf.util.configuration.DynamicSqlConfig;
import com.dist.training.bdf.entity.instance.AppPrelandValueEntity;
import com.dist.training.bdf.entity.instance.ProjectBaseEntity;
import com.dist.training.bdf.entity.instance.UserEntity;
import com.dist.training.bdf.manager.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.ws.rs.QueryParam;
import java.util.*;

/**
 * @author lijy
 */
@Service("projectBaseService")
@Transactional
public class ProjectBaseService {
// 模糊查询 排序多列不同顺序前端用JSON往后传
    @Autowired
    HibernateBaseDao baseDao;

    public ProjectBaseEntity get(int id){
        return (ProjectBaseEntity) baseDao.get(ProjectBaseEntity.class,id);
    }

    public AppPrelandValueEntity getById(int id) {
        return (AppPrelandValueEntity) baseDao.get(AppPrelandValueEntity.class,id);
    }

    @Transactional
  public Integer newItem(AppPrelandValueEntity appPrelandValueEntity) {
      baseDao.saveOrUpdate(appPrelandValueEntity);
      return 1;
  }

  @Transactional
  public void lineDel(AppPrelandValueEntity appPrelandValueEntity) {
      baseDao.delete(appPrelandValueEntity);
  }

  public int getEndRow(int startRow, int pageSize) {
    int totalNum = getCount();
    int endRow;
    if (startRow + pageSize > totalNum)
      endRow = totalNum;
    else
      endRow = startRow + pageSize;
    return endRow;
  }

  public List<Map<String, Object>> getOrdered(String curr, Integer pageSize, String orderKey) {
      int cur = Integer.parseInt(curr);
    int startRow = (cur - 1) * pageSize + 1;
    int endRow = getEndRow(startRow, pageSize);
    DynamicSqlConfig config = DynamicSqlConfig.getConfigInfo("project.xml", "listPage");
    HashMap<String, Object> map = new HashMap<String, Object>();
    map.put("endrow", endRow);
    map.put("startrow", startRow);

    Collection<String> collection = new ArrayList<>();
    String subStr = orderKey.substring(0, orderKey.length()-1);
    String[] split = subStr.split(",");
    for (String str : split) {
      collection.add(str);
    }
    String sql = config.getSqlStr();
    sql += config.getOrderSql(collection);
    sql += config.getEndsqlStr();

    List<Map<String, Object>> list = baseDao.sqlAsMap(config.getDbName(), sql, map);
    return list;
  }

  public List<?> getPage(Integer curr, int pageSize) {
    int startRow = (curr - 1) * pageSize + 1;
    int endRow = getEndRow(startRow, pageSize);
    DynamicSqlConfig config = DynamicSqlConfig.getConfigInfo("project.xml", "listPage");
    HashMap<String, Object> map = new HashMap<>();
    map.put("endrow", endRow);
    map.put("startrow", startRow);

    String sql = config.getSqlStr();
    sql += config.getEndsqlStr();
    List<Map<String, Object>> list = baseDao.sqlAsMap(config.getDbName(), sql, map);
    return list;
    }

  public int getCount() {
    String hql = "from AppPrelandValueEntity";
    List<AppPrelandValueEntity> list = (List<AppPrelandValueEntity>) baseDao.HQL(AppPrelandValueEntity.class, hql);
    int count = list.size();
    return count;
  }

//  public Object search(String key) {
//  }

//  public Result checkLogin(UserEntity user) {
//      Result result = new Result();
//      String uId = user.getUid();
//
//  }
}
