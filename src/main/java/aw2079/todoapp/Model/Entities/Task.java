/*
 *  MIT License
 */
package aw2079.todoapp.Model.Entities;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author Artur Wiśniewski
 */
@Getter
@Setter
@ToString
@Entity
@Table(name = "TASK")
public class Task {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String description;
    private LocalDateTime creationDate;
    private LocalDateTime startDate;
    
    @ManyToOne
    private TaskList taskList;
    
    @ManyToOne
    private Type type;
}
