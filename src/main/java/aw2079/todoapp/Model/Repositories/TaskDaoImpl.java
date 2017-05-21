/*
 * MIT License
 */
package aw2079.todoapp.Model.Repositories;

import aw2079.todoapp.Model.Entities.Task;
import java.io.Serializable;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Artur Wiśniewski
 */
@Repository
@Transactional
public class TaskDaoImpl implements TaskDao {

    private SessionFactory sessionFactory;

    @Autowired
    public TaskDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    protected Session getSession() {
        return this.sessionFactory.getCurrentSession();
    }

    @Override
    public Task findById(Serializable id) {
        return (Task) getSession().get(Task.class, id);
    }

    public Task first() {
        Object byId = getSession().byId(Task.class).load(1L);
        return byId == null ? new Task() : (Task) byId;
    }

    @Override
    public Serializable save(Task task) {
        return getSession().save(task);
    }

}
