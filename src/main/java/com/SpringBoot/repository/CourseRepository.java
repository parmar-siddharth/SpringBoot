package com.SpringBoot.repository;

import org.springframework.stereotype.Repository;

@Repository
public class CourseRepository {

    public void saveCourse(){
        System.out.println("Course saved");
    }
}
