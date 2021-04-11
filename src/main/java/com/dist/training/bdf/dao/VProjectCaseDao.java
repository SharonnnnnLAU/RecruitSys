package com.dist.training.bdf.dao;

import com.dist.training.bdf.entity.instance.VProjectCaseEntity;

public interface VProjectCaseDao {
    int insert(VProjectCaseEntity record);

    int insertSelective(VProjectCaseEntity record);
}