package com.SpringBoot.repository;

import org.springframework.stereotype.Repository;

@Repository
public class Django implements Course{
    @Override
    public void addCourse() {
        System.out.println("Added Django Course");
    }
}
