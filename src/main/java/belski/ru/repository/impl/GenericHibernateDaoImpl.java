package belski.ru.repository.impl;

import belski.ru.repository.GenericHibernateDao;
import belski.ru.repository.exceptions.DaoHibernateException;
import belski.ru.repository.util.HibernateUtil;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.io.Serializable;


/**
 * Created by Администратор on 30.06.2017.
 */
public abstract class GenericHibernateDaoImpl<T extends Serializable, ID> implements GenericHibernateDao {
    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    private Class <T> clazz;

    private  static  Logger logger = Logger.getLogger(GenericHibernateDaoImpl.class);
    @Override
    public void insert(Object entity)  { // public T insert (T entity)
        Session session = null;
        try {
          session =   sessionFactory.openSession();
            session.beginTransaction(); // начало транзакции
            session.save(entity);
            session.getTransaction().commit();  // сесси должна желательно быть внутри одного потока
        } catch (HibernateException e) {
            session.getTransaction().rollback();
            e.printStackTrace();
            throw  new DaoHibernateException();
        }

    }

    @Override
    public void update(Object entity) {
        Session session = null;
        try {
            session =   sessionFactory.getCurrentSession();
            session.beginTransaction(); // начало транзакции
            session.update(entity);
            session.getTransaction().commit();  // сесси должна желательно быть внутри одного потока
        } catch (HibernateException e) {
            session.getTransaction().rollback();
            e.printStackTrace();
            throw  new DaoHibernateException();
        }
    }

    @Override
    public void delete(Object o) {

    }

//    @Override
//    public T findById(Object o) {
//        Session session = null;
//        T entity;
//        try {
//            session =   sessionFactory.getCurrentSession();
//            session.beginTransaction(); // начало транзакции
//            session.update(entity);
//            entity = (T) session.get(getPersistentClass, )  // сесси должна желательно быть внутри одного потока
//        } catch (HibernateException e) {
//            session.getTransaction().rollback();
//            e.printStackTrace();
//            throw  new DaoHibernateException();
//        }
//    }

    @Override
    public void findAll() {

    }
}
