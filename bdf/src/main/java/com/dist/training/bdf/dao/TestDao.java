package com.dist.training.bdf.dao;

import com.dist.bdf.base.data.impl.HibernateBaseDao;
import com.dist.training.bdf.entity.instance.AppPrelandValueEntity;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import java.util.List;

public interface TestDao {

//  @Autowired
//  HibernateBaseDao hibernateBaseDao;

  public  List<AppPrelandValueEntity> getAllInfo(Class<AppPrelandValueEntity> appPrelandValueEntityClass, List<AppPrelandValueEntity> appPrelandValueEntities, int pageNum, int pageSize);

//  public Integer getCount(Class<AppPrelandValueEntity> appPrelandValueEntityClass, List<AppPrelandValueEntity> appPrelandValueEntities) {
//    Integer count = hibernateBaseDao.count(appPrelandValueEntityClass, appPrelandValueEntities);
//    return count;
//  }
}
