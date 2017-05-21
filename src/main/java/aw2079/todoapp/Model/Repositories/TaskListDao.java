/*
 * MIT License
 */
package aw2079.todoapp.Model.Repositories;

import aw2079.todoapp.Model.Entities.TaskList;
import java.io.Serializable;

/**
 *
 * @author Artur Wiśniewski
 */
public interface TaskListDao {
    public Serializable save(TaskList taskList);
    public TaskList findById(final Serializable id);
    public TaskList first();
}
