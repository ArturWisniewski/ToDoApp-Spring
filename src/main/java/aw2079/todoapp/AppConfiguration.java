/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aw2079.todoapp;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 *
 * @author Artur Wiśniewski
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "aw2079.todoapp")
@Import({WebInitializer.class, DispatcherConfig.class})
class AppConfiguration {

}
