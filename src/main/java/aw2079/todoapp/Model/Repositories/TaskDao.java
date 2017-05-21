/*
 * MIT License
 */
package aw2079.todoapp.Model.Repositories;

import aw2079.todoapp.Model.Entities.Task;
import java.io.Serializable;

/**
 *
 * @author Artur Wiśniewski
 */
public interface TaskDao {
    public Serializable save(Task task);
    public Task findById(final Serializable id);
    public Task first();
}
