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

    @RequestMapping(value = "/calculator", method = RequestMethod.GET)
    public String helloWorld(Model model) {
        model.addAttribute("ans", 0);
        model.addAttribute("s1", "");
        model.addAttribute("s2", "");
        return "calculator";
    }

    @RequestMapping(value = "/calculator", method = RequestMethod.POST)
    public String add(Model model, HttpServletRequest request) {
        String s1 = request.getParameter("s1");
        String s2 = request.getParameter("s2");
        String ans = service.calculation(s1, s2, request.getParameter("r1"));
        model.addAttribute("ans", ans);
        model.addAttribute("s1", s1);
        model.addAttribute("s2", s2);
        return "calculator";
    }

}
