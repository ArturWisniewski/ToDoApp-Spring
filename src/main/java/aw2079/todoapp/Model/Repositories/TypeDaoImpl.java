/*
 * MIT License
 */
package aw2079.todoapp.Model.Repositories;

import aw2079.todoapp.Model.Entities.Type;
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
public class TypeDaoImpl implements TypeDao{

   
    private SessionFactory sessionFactory;
   
    @Autowired
    public TypeDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    
    protected Session getSession(){
        return this.sessionFactory.getCurrentSession();
    }
    
    @Override
    public Type findById(Serializable id) {
        return (Type) getSession().get(Type.class, id);
    }
    
    public Type first(){
        Object byId = getSession().byId(Type.class).load("Today");
        return byId==null? new Type(): (Type) byId;
    }

    @Override
    public Serializable save(Type type) {
        return getSession().save(type);
    }
    
}
