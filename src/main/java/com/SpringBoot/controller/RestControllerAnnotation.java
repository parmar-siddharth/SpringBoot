package com.SpringBoot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerAnnotation {

    @GetMapping("/show")
    public String showCourses(){
        return "Courses: JAVA, MERN, AIML ";
    }

}
