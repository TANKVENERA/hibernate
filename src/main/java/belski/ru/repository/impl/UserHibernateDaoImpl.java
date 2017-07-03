package belski.ru.repository.impl;

import belski.ru.repository.GenericHibernateDao;
import belski.ru.repository.UserHibernateDao;
import belski.ru.repository.model.User;

/**
 * Created by Администратор on 30.06.2017.
 */
public class UserHibernateDaoImpl extends GenericHibernateDaoImpl<User, Integer> implements GenericHibernateDao {

    public  User getUserByname(String username) {
        return  null;
    }

//    Class getPersistentClass () {
//        return clazz.getClass();
//    }


    @Override
    public void findById(Object o) {

    }
}
