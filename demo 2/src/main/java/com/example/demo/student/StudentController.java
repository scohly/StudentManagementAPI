package com.example.demo.student;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/students")
@AllArgsConstructor
public class StudentController {

    //service
    private final StudentService service;

    //hardcoded for testing purposes
    @GetMapping
    public List<Student> getAllStudents(){

        //USING n-Tier architecture here
        return service.getAllStudents();
    }

    @PostMapping
    public void addStudent(@Valid @RequestBody Student student){
        service.addStudent(student);
    }

    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long studentId){
        service.deleteStudent(studentId);
    }

    /*
    new Student(1L, "Billy Butcher", "billy@supssuck.com", Gender.MALE),
                new Student(2L, "Hank", "hank@supssuck.com", Gender.MALE)
     */


}
