/*
 *  MIT License
 */
package aw2079.todoapp.Configuration;

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
@ComponentScan(basePackages = {"aw2079.todoapp.Controllers", "aw2079.todoapp.Services"})
@Import({SpringSecurityConfig.class, HibernateConfig.class})
class ApplicationConfig {

}
