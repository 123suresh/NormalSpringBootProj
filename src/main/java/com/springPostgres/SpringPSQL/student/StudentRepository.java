package com.springPostgres.SpringPSQL.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//This is Data Access Layer which intract with DB and should be an Interface
//Here JpaRepository<Student, Interger> Student is type we want to work with and Id type in Integer
//This interface is @Repository because it is reponsible for data access

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}


//we will be using this interface inside our StudentService