package com.springPostgres.SpringPSQL.student;

//will have all of the resources required for student class.

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path="/api/v1/student")
public class StudentController {
    @GetMapping
    public List<Student> getStudent(){
        return List.of(
                new Student(
                        1,
                        "maria",
                        "ff@gmail.com",
                        LocalDate.of(2012, 4, 12),
                        45
                )
        );
    }
}

