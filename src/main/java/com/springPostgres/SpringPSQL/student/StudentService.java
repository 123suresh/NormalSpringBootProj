
//Service layer is for writing business logics.

package com.springPostgres.SpringPSQL.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

//@Component
//@Component is for instantiating so we have reference in StudentController.
@Service
//@Service and @Component are same but more generic is @Service
public class StudentService {
    public List<Student> getStudents(){
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
