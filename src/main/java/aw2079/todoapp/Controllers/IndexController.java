/*
 * MIT License
 */
package aw2079.todoapp.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Artur Wiśniewski
 */

@Controller
public class IndexController {
    
    @RequestMapping("/")
    public String index(){
        return "index";
    }
    
    
}
