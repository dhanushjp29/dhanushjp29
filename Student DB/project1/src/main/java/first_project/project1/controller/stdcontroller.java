package first_project.project1.controller;

import first_project.project1.model.students;
import first_project.project1.service.stdservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class stdcontroller {

    @Autowired
    stdservice std_service;

    @PostMapping("student/details")
    public String students_detail(@RequestParam("rollno")int rollno,
                                          @RequestParam("name")String name,
                                          @RequestParam("course")String course,
                                          @RequestParam("email")String email){
        std_service.students_details(rollno,name,course,email);
        return "Student Detail Saved" ;

    }
    @GetMapping("students")
    public List<students> all_students_data(){
        return std_service.all_student();
    }
}
