package com.SpringBoot.repository;

import org.springframework.stereotype.Repository;

@Repository
public class Node implements Course{
    @Override
    public String addCourse() {
        return "Added Node.js Course";
    }
}
