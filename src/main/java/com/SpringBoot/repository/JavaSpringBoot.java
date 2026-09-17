package com.SpringBoot.repository;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

//@Primary
//@Repository
@Scope("prototype")
public class JavaSpringBoot implements Course{
    @Override
    public void addCourse() {
        System.out.println("Added Java Spring Boot Course");
    }
}
