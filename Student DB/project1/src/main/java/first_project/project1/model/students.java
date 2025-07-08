package first_project.project1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class students {
    @Id
    private int rollno;
    private String name;
    private String course;
    private String email;

    public students(int rollno, String name, String course, String email) {
        this.rollno = rollno;
        this.name = name;
        this.course = course;
        this.email = email;
    }
    public students(){

    }
}
