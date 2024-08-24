package com.thenikhiljadav.schoolservice.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "school")
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String email;

    public Integer getId() {
        return id;
    }

    public School setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public School setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public School setEmail(String email) {
        this.email = email;
        return this;
    }
}
