package com.SpringBoot.repository;

import org.springframework.stereotype.Repository;

@Repository
public class React implements Course{
    @Override
    public void addCourse() {
        System.out.println("Added React.js Course");
    }
}
