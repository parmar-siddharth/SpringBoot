package com.SpringBoot.repository;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

//@Primary
//@Repository
//@Scope("prototype")
@Repository
public class JavaSpringBoot implements Course{
    @Override
    public String addCourse() {
        return "Added Java SpringBoot course Course";
    }
}
