package com.thenikhiljadav.schoolservice.service;

import com.thenikhiljadav.schoolservice.clientInterfaces.StudentClient;
import com.thenikhiljadav.schoolservice.entity.School;
import com.thenikhiljadav.schoolservice.models.FullSchoolResponse;
import com.thenikhiljadav.schoolservice.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolService {

    @Autowired
    private SchoolRepository schoolRepository;

    @Autowired
    private StudentClient studentClient;

    public void saveSchool(School school) {
        schoolRepository.save(school);
    }

    public List<School> findAllSchool() {
        return schoolRepository.findAll();
    }

    public FullSchoolResponse findSchoolsWithStudents(Integer schoolId) {
        var school = schoolRepository.findById(schoolId).orElse(new School());
        var students = studentClient.findAllStudentsBySchool(schoolId);
        FullSchoolResponse fullSchoolResponse = new FullSchoolResponse();
        fullSchoolResponse.setName(school.getName());
        fullSchoolResponse.setEmail(school.getEmail());
        fullSchoolResponse.setStudents(students);
        return fullSchoolResponse;
    }
}
