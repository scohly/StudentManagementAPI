package com.example.demo.student;

//business logic happens here

import com.example.demo.student.exception.BadRequestException;
import com.example.demo.student.exception.StudentNotFoundException;
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

        //flag for if email already in use
        Boolean emailUsed = studentRepo.selectExistsEmail(student.getEmail());

        if(emailUsed){
            throw new BadRequestException(
                    "Email " +student.getEmail() + " is already in use, use another");
        }

        studentRepo.save(student);
    }

    //use delete by id
    public void deleteStudent(long id) {
        //when we do error  checking we need to check if the student exists before calling deleteby id
        if(!studentRepo.existsById(id)){
            throw new StudentNotFoundException(
                    "Student with id " + id + "does not exist!");
        }
        studentRepo.deleteById(id);
    }


}
