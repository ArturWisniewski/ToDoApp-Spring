package aw2079.todoapp.Model.Entities;

import javax.persistence.Entity;
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
public class Type {
    @Id
    private String type;
}
