package com.thenikhiljadav.schoolservice.controller;

import com.thenikhiljadav.schoolservice.entity.School;
import com.thenikhiljadav.schoolservice.models.FullSchoolResponse;
import com.thenikhiljadav.schoolservice.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/schools")
public class SchoolController {

    @Autowired
    private SchoolService schoolService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveSchool(@RequestBody School school){
        schoolService.saveSchool(school);
    }

    @GetMapping
    public ResponseEntity<List<School>> getAllSchool(){
        return ResponseEntity.ok(schoolService.findAllSchool());
    }

    @GetMapping(value = "/with-students/{school-id}")
    public ResponseEntity<FullSchoolResponse> getAllSchool(@PathVariable("school-id") Integer schoolId){
        return ResponseEntity.ok(schoolService.findSchoolsWithStudents(schoolId));
    }


}
