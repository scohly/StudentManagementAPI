package com.example.demo.student;

//business logic happens here

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class StudentService {

    private final StudentRepository studentRepo;

    //create a getAll method
    public List<Student> getAllStudents(){
        return studentRepo.findAll();
    }

    public void addStudent(Student student) {
        //add validation for checkEmail taken etc... if taken throw error
        studentRepo.save(student);
    }
}
