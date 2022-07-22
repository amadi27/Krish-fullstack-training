package com.Amadi.rentCar.demo_MicroSErvices_Application.servicer;

import com.Amadi.rentCar.demo_MicroSErvices_Application.Repository.StudentRepository;
import com.Amadi.rentCar.demo_MicroSErvices_Application.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

//we wany to say this my service
@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepository studentRepository;
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    //this return optional
    public Student fetchStudentById(int id){
        Optional<Student> student= studentRepository.findById(id);
        if(student.isPresent()){
            return student.get();
        }
        return null;
    }
}
