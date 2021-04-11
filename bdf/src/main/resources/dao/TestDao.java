package dao;

import com.dist.bdf.base.data.impl.HibernateBaseDao;
import com.dist.training.bdf.entity.instance.AppPrelandValueEntity;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;

import java.util.List;

public class TestDao implements com.dist.training.bdf.dao.TestDao {

  @Autowired
  HibernateBaseDao hibernateBaseDao;

  @Override
  public List<AppPrelandValueEntity> getAllInfo(Class<AppPrelandValueEntity> appPrelandValueEntityClass, List<AppPrelandValueEntity> appPrelandValueEntities, int pageNum, int pageSize) {
//    return (List<AppPrelandValueEntity>) hibernateBaseDao.criteria(appPrelandValueEntityClass, appPrelandValueEntities, 10, 4);
    return null;
  }

//  public List<?> criteria(Class<?> cls, List<Criterion> criterions, Order order, int pageNum, int pageSize) {
//    HibernateTemplate hds = getHibernateTemplate(cls);
//    SessionFactory sf = hds.getSessionFactory();
//    Session session = sf.getCurrentSession();
//    Criteria c = session.createCriteria(cls);
//    addAllCriterion(c, criterions);
//    if (order != null) {
//      c.addOrder(order);
//    }
//    if (pageNum < 1) {
//      pageNum = 1;
//    }
//    if (pageSize < 1) {
//      pageSize = 1;
//    }
//    pageNum--;
//    int begin = pageNum * pageSize;
//    c.setFirstResult(begin);
//    c.setMaxResults(pageSize);
//    return c.list();
//  }
}
