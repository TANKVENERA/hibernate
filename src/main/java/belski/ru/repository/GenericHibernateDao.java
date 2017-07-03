package belski.ru.repository;

/**
 * Created by Администратор on 30.06.2017.
 */
public interface GenericHibernateDao<T, ID> {

    void  insert(T entity);
    void  update(T entity);
    void delete(ID id);
    void findById(ID id);
    void findAll();
}
