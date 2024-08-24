package com.thenikhiljadav.schoolservice.repository;

import com.thenikhiljadav.schoolservice.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolRepository extends JpaRepository<School, Integer> {
}
