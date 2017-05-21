/*
 * MIT License
 */
package aw2079.todoapp.Model.Repositories;

import aw2079.todoapp.Model.Entities.User;
import java.io.Serializable;
import javax.transaction.Transactional;
import org.hibernate.IdentifierLoadAccess;
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
public class UserDaoImpl implements UserDao{

   
    private SessionFactory sessionFactory;
   
    @Autowired
    public UserDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    
    protected Session getSession(){
        return this.sessionFactory.getCurrentSession();
    }
    
    @Override
    public Serializable save(User user) {
        return getSession().save(user);
    }

    @Override
    public User findById(Serializable id) {
        return (User) getSession().get(User.class, id);
    }
    
    public User first(){
        Object byId = getSession().byId(User.class).load(1L);
        return byId==null? new User(): (User) byId;
    }
    
}
