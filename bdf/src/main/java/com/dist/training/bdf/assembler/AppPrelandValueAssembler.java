package com.dist.training.bdf.assembler;

import com.dist.training.bdf.dto.AppPrelandValueDTO;
import com.dist.training.bdf.entity.instance.AppPrelandValueEntity;

public class AppPrelandValueAssembler {
  public static AppPrelandValueDTO toDTO(AppPrelandValueEntity appPrelandValueEntity) {
    AppPrelandValueDTO appPrelandValueDTO = new AppPrelandValueDTO();
    appPrelandValueDTO.setId(appPrelandValueEntity.getId());
    appPrelandValueDTO.setFkPrelanduseId(appPrelandValueEntity.getFkPrelanduseId());
    appPrelandValueDTO.setFkProjectId(appPrelandValueEntity.getFkProjectId());
    appPrelandValueDTO.setKey(appPrelandValueEntity.getKey());
    appPrelandValueDTO.setType(appPrelandValueEntity.getType());
    appPrelandValueDTO.setUseplanfarmaera(appPrelandValueEntity.getUseplanfarmaera());
    appPrelandValueDTO.setValue(appPrelandValueEntity.getValue());
    return appPrelandValueDTO;
  }
}
