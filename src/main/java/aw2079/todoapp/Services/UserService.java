/*
 * MIT License
 */
package aw2079.todoapp.Services;

import aw2079.todoapp.Model.Repositories.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Artur Wiśniewski
 */
@Service
public class UserService {
    
    @Autowired
    UserDao dao;
    
    public String first(){
        return dao.first().toString();
        //return dao.findById(1L).toString();
    }
    
    
}
