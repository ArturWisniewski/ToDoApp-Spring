/*
 * MIT License
 */
package aw2079.todoapp.Controllers;

import aw2079.todoapp.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Artur Wiśniewski
 */
@Controller
public class UserController {
    
    @Autowired
    UserService service;
    
    @RequestMapping("/firstUser")
    public String firstUser(Model model){
        model.addAttribute("user", service.first());
        return "firstUser";
    }
}
