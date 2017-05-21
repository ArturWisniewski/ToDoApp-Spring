/*
 * MIT License
 */

import aw2079.todoapp.Model.Entities.Task;
import aw2079.todoapp.Model.Entities.TaskList;
import aw2079.todoapp.Model.Entities.Type;
import aw2079.todoapp.Model.Entities.User;
import aw2079.todoapp.Model.Repositories.TaskDao;
import aw2079.todoapp.Model.Repositories.TaskListDao;
import aw2079.todoapp.Model.Repositories.TypeDao;
import aw2079.todoapp.Model.Repositories.UserDao;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import javax.transaction.Transactional;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.context.WebApplicationContext;

/**
 *
 * @author Artur Wiśniewski
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {aw2079.todoapp.Configuration.ApplicationConfig.class})
@WebAppConfiguration
@Rollback(false)
@Transactional
public class DaosTest {

    @Autowired
    WebApplicationContext context;

    
    @Test
    public void UserAddTest() {

//        System.out.println("\n------------\n");
//        System.out.println( context==null? "NULL CONTEXT!!!!!!": Arrays.stream(context.getBeanDefinitionNames()).collect(Collectors.joining(", ---- , ")));
//        System.out.println("\n------------\n");
     
        UserDao udi = context.getBean("userDaoImpl", UserDao.class);
        TypeDao td = context.getBean("typeDaoImpl", TypeDao.class);
        TaskListDao tld = context.getBean("taskListDaoImpl", TaskListDao.class);
        TaskDao taskDao = context.getBean("taskDaoImpl", TaskDao.class);
        
        Type type = new Type();
        ArrayList<Task> listTask = new ArrayList<Task>();
        Task task = new Task();
        TaskList taskList = new TaskList();
        ArrayList<TaskList> listTaskList = new ArrayList<TaskList>();
        User u1 = new User();
        
        
        type.setType("Today");
        
        task.setName("task1");
        task.setType(type);
        task.setCreationDate(LocalDateTime.now());
        task.setStartDate(LocalDateTime.now());
        task.setDescription("Be Java Champion!");
        task.setTaskList(taskList);
        
        listTask.add(task);
        
        taskList.setName("My Task list");
        taskList.setTasks(listTask);
        
        listTaskList.add(taskList);
        
        u1.setFirstName("Artur");
        u1.setLastName("Wiśniewski");
        u1.setUsername("aw");
        u1.setEmail("xxx@yyy.zzz");
        u1.setPassword("123456");
        u1.setTaskList(listTaskList);
        Serializable userId = udi.save(u1);
        Serializable typeId = td.save(type);
        Serializable taskId = taskDao.save(task);
        Serializable taskLIstId = tld.save(taskList);
        
        
        System.out.println(userId.toString());
        System.out.println(typeId.toString());
        System.out.println(taskId.toString());
        System.out.println(taskLIstId.toString());
        
        Assert.assertTrue(u1.equals(udi.findById(userId)));
    }

}
