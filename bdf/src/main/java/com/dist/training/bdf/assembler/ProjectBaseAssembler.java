package com.dist.training.bdf.assembler;

import com.dist.training.bdf.dto.ProjectBaseDTO;
import com.dist.training.bdf.entity.instance.ProjectBaseEntity;

/**
 * @author lijy
 */
public class ProjectBaseAssembler {
    public static ProjectBaseDTO toDTO(ProjectBaseEntity entity){
        ProjectBaseDTO dto = new ProjectBaseDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setBuildAddress(entity.getBuildAddress());
        dto.setConstructionUnit(entity.getConstructionUnit());
        dto.setProjectNo(entity.getProjectNo());
        dto.setType(entity.getType());
        dto.setLifeState(entity.getLifeState());
        dto.setRegisterTime(entity.getRegisterTime());
        dto.setDelete(entity.isDelete());
        return dto;
    }
}
