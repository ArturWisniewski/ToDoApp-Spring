package aw2079.todoapp.Model.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author Artur Wiśniewski
 */
@Getter @Setter @ToString
@Entity
public class TaskList {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    
}
