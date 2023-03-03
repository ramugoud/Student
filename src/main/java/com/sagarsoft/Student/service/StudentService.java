package com.sagarsoft.Student.service;


import com.sagarsoft.Student.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();

    public Optional<Student> getById(int id);
}
