/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aw2079.todoapp.Controllers;

import aw2079.todoapp.Services.ICalculatorService;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Artur Wiśniewski
 */
@Controller
public class CalculatorController {

    @Autowired
    ICalculatorService service;

    @RequestMapping("/calculator")
    public String helloWorld(Model model) {
        model.addAttribute("message", "Hello World!");
        return "calculator";
    }

    @RequestMapping(value = "/calculated", method = RequestMethod.GET)
    public String add(Model model, HttpServletRequest request) {
        String ans = service.calculation(request.getParameter("s1"), request.getParameter("s2"), request.getParameter("r1"));
        model.addAttribute("ans", ans);
        return "calculated";
    }

}
