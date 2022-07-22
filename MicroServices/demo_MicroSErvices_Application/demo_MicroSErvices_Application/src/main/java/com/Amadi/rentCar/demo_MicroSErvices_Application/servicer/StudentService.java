package com.Amadi.rentCar.demo_MicroSErvices_Application.servicer;

import com.Amadi.rentCar.demo_MicroSErvices_Application.model.Student;

public interface StudentService {
    Student save(Student student);
    Student fetchStudentById(int id);
}
