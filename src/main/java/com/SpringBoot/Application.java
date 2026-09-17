package com.SpringBoot;

import com.SpringBoot.repository.JavaSpringBoot;
import com.SpringBoot.service.CourseService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(scanBasePackages = "com.SpringBoot")
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);

		CourseService courseService = context.getBean(CourseService.class);

		courseService.purchased();

		courseService.showCourseName();

		JavaSpringBoot course1 = context.getBean(JavaSpringBoot.class);
		JavaSpringBoot course2 = context.getBean(JavaSpringBoot.class);

		course1.addCourse();

		System.out.println(course1 == course2);



//		CourseRepository courseRepository = context.getBean(CourseRepository.class);
//
//		courseRepository.saveCourse();
	}

}
