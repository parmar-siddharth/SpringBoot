package com.SpringBoot.repository;

import org.springframework.stereotype.Repository;

@Repository
public class React implements Course{
    @Override
    public String addCourse() {
        return "Added React.js Course";
    }
}
