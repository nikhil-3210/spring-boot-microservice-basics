package com.thenikhiljadav.studentservice.controller;

import com.thenikhiljadav.studentservice.entity.Student;
import com.thenikhiljadav.studentservice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveStudent(@RequestBody Student student){
        studentService.saveStudent(student);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Student> getAllStudent(){
        return studentService.findAllStudent();
    }

    @GetMapping(value = "/school/{school-id}")
    public ResponseEntity<List<Student>> getAllStudent(@PathVariable("school-id") Integer schoolId){
        return ResponseEntity.ok(studentService.findAllStudentsBySchool(schoolId));
    }
}
