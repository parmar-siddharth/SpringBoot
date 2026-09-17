package com.SpringBoot.repository;

import org.springframework.stereotype.Repository;

@Repository
public class Node implements Course{
    @Override
    public void addCourse() {
        System.out.println("Added Node.js Course");
    }
}
