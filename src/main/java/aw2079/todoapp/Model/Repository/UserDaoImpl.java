/*
 * MIT License
 */
package aw2079.todoapp.Model.Repository;

import aw2079.todoapp.Model.Entities.User;
import java.io.Serializable;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Artur Wiśniewski
 */
public class UserDaoImpl implements UserDao{

    @Autowired
    private SessionFactory sessionFactory;
    
    protected Session getSession(){
        return this.sessionFactory.getCurrentSession();
    }
    
    @Override
    public Serializable save(User user) {
        return getSession().save(user);
    }

    @Override
    public User findById(Serializable id) {
        return getSession().get(User.class, id);
    }
    
}
