package com.example.demo.student;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {

    //hardcoded for testing purposes
    public List<Student> getAllStudents(){
        List<Student> students = Arrays.asList(
                new Student(1L, "Billy Butcher", "billy@supssuck.com", Gender.MALE),
                new Student(2L, "Hank", "hank@supssuck.com", Gender.MALE)
        );
        return students;
    }
}
