package com.thenikhiljadav.schoolservice.models;

import java.util.List;

public class FullSchoolResponse {

    private String name;
    private String email;

    private List<Student> students;

    public String getName() {
        return name;
    }

    public FullSchoolResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public FullSchoolResponse setEmail(String email) {
        this.email = email;
        return this;
    }

    public List<Student> getStudents() {
        return students;
    }

    public FullSchoolResponse setStudents(List<Student> students) {
        this.students = students;
        return this;
    }
}
