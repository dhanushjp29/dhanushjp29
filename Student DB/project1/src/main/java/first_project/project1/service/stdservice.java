package first_project.project1.service;

import first_project.project1.model.students;
import first_project.project1.repositor.studentrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class stdservice {

    @Autowired
    studentrepo std_repo;

    public List<students> all_student(){
        return std_repo.findAll();
    }



    public void students_details(int rollno, String name, String course, String email) {
        students student = new students(rollno, name, course, email);
        std_repo.save(student);
    }
}
