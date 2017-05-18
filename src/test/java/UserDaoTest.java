/*
 * MIT License
 */

import aw2079.todoapp.Model.Entities.TaskList;
import aw2079.todoapp.Model.Entities.User;
import aw2079.todoapp.Model.Repository.UserDaoImpl;
import java.util.ArrayList;
import javax.transaction.Transactional;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author Artur Wiśniewski
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {aw2079.todoapp.Configuration.Application.class, aw2079.todoapp.Configuration.HibernateConfig.class})
//@Rollback(true)
@Transactional
public class UserDaoTest {

    @Test
    public void UserAddTest() {
        User u1 = new User();
        u1.setId(1L);
        u1.setFirstName("Artur");
        u1.setLastName("Wiśniewski");
        u1.setNickname("aw");
        u1.setEmail("xxx@yyy.zzz");
        u1.setTaskList(new ArrayList<TaskList>());
        
        UserDaoImpl userDaoImpl = new UserDaoImpl();
      //  userDaoImpl.save(u1);
        //Assert.assertTrue(u1.equals(userDaoImpl.findById(1L)));
    }
    
}
