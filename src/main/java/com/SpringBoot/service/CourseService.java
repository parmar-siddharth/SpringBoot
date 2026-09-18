package com.SpringBoot.service;


import com.SpringBoot.repository.Course;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseService {


    private final Course course;

    @Autowired
    public CourseService(@Qualifier("django") Course course){
        this.course = course;
    }

    @GetMapping("/purchased")
    public String coursePurchased(){
        course.addCourse();
        return "ThankYou for purchasing the course";
    }

    @GetMapping("/exit")
    public String exit(){
        return "have a nice day!";
    }

    @Value("${school.name}")
    private String schoolName;

    @GetMapping("/school")
    public String getSchoolName() {
        return schoolName;
    }

    @PostConstruct
    public void welcome(){
        System.out.println("Welcome to " + schoolName);
    }


    @PreDestroy
    public void bye(){
        System.out.println("ThankYou for visiting " + schoolName);
    }

    /*

    private final Course course;

    @Value("${course.name}")
    private String courseName;

    @Autowired
    public CourseService(@Qualifier("react") Course course) {
        this.course = course;
    }

    public void purchased(){
        course.addCourse();
        System.out.println("Course Purchased");
    }

    public void showCourseName(){
        System.out.println(courseName);
    }

     private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public void learn(){
        System.out.println("Learning Spring Boot");
        courseRepository.saveCourse();
    }

     */

}
