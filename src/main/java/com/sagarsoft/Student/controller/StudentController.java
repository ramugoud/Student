package com.sagarsoft.Student.controller;


import com.sagarsoft.Student.model.Student;
import com.sagarsoft.Student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "New student is added";
    }

    @GetMapping("/getAll")
    public List<Student> list(){
        return studentService.getAllStudents();
    }

    @GetMapping("/getById/{id}")
    public Optional<Student> getById(@PathVariable("id") int id) {return studentService.getById(id);}
}
