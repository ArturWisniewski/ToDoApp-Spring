/*
 * MIT License
 */
package aw2079.todoapp.Model.Repository;

import aw2079.todoapp.Model.Entities.User;
import java.io.Serializable;

/**
 *
 * @author Artur Wiśniewski
 */
public interface UserDao {
    public Serializable save(User user);
    public User findById(final Serializable id);
}
