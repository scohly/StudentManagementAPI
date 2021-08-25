package com.example.demo.student;
//courtesy of lombok package, we can just use annotations to remove significant boiler plate aka getters/setters/
//constructor etc

import lombok.*;

@ToString
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    //PROPERTIES
    private Long id;
    private String name;
    private String email;
    private Gender gender;
}
