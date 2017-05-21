/*
 * MIT License
 */
package aw2079.todoapp.Model.Repositories;

import aw2079.todoapp.Model.Entities.TaskList;
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
public class TaskListDaoImpl implements TaskListDao {

    private SessionFactory sessionFactory;

    @Autowired
    public TaskListDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    protected Session getSession() {
        return this.sessionFactory.getCurrentSession();
    }

    @Override
    public TaskList findById(Serializable id) {
        return (TaskList) getSession().get(TaskList.class, id);
    }

    public TaskList first() {
        Object byId = getSession().byId(TaskList.class).load(1L);
        return byId == null ? new TaskList() : (TaskList) byId;
    }

    @Override
    public Serializable save(TaskList taskList) {
        return getSession().save(taskList);
    }

}
