/*
 * MIT License
 */
package aw2079.todoapp.Model.Repositories;

import aw2079.todoapp.Model.Entities.Type;
import java.io.Serializable;

/**
 *
 * @author Artur Wiśniewski
 */
public interface TypeDao {

    public Serializable save(Type type);

    public Type findById(final Serializable id);

    public Type first();
}
