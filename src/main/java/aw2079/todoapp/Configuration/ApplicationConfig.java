/*
 *  MIT License
 */
package aw2079.todoapp.Configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 *
 * @author Artur Wiśniewski
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "aw2079.todoapp.Controllers")
class ApplicationConfig {

}
