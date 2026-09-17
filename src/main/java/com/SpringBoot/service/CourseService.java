package com.SpringBoot.service;


import com.SpringBoot.repository.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class CourseService {


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

    // private final CourseRepository courseRepository;

//    public CourseService(CourseRepository courseRepository) {
//        this.courseRepository = courseRepository;
//    }
//
//    public void learn(){
//        System.out.println("Learning Spring Boot");
//        courseRepository.saveCourse();
//    }

}
