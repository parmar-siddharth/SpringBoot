package com.SpringBoot.repository;

import org.springframework.stereotype.Repository;

@Repository
public class Django implements Course{
    @Override
    public String addCourse() {
        return "Added Django Course";
    }
}
