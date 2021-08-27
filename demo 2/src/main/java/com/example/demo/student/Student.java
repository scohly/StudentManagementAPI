package com.example.demo.student;
//courtesy of lombok package, we can just use annotations to remove significant boiler plate aka getters/setters/
//constructor etc

import lombok.*;

import javax.persistence.*;

@ToString
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Student {
    //PROPERTIES
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            generator = "student_sequence",
            strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String email;
    @Enumerated(EnumType.STRING)
    private Gender gender;

    //create a constructor without ID as that will be created by DB


    public Student(String name, String email, Gender gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
}
