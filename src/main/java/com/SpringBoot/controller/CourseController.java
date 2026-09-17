package com.SpringBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CourseController {

    @GetMapping("/course")
    @ResponseBody
    public String getCourse(){
        return "Spring Boot Course";
    }

    @GetMapping("/buy")
    @ResponseBody
    public String buyCourse(){
        return "Course purchased";
    }

}
