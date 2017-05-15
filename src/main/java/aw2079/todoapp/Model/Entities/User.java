/*
 *  MIT License
 */
package aw2079.todoapp.Model.Entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    private String nickname;
    private String email;

    @OneToMany(mappedBy = "user")
    private List<TaskList> taskList;

}
