package com.Amadi.rentCar.demo_MicroSErvices_Application.Repository;

import com.Amadi.rentCar.demo_MicroSErvices_Application.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

//Student -data type that going to deal with
//Integer - data type of primary key(normly it is Integer)
public interface StudentRepository extends JpaRepository<Student,Integer> {
    //Student save(Student student);
}
