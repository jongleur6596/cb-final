package com.yujin.studentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class StudentserviceApplication {

	@RequestMapping("/")
	public String student(){
		return "This is student service";
	}

	@RequestMapping("/student/{name}")
	public String nameInput(@PathVariable String name){
		return "My name is "+name;
	}

	public static void main(String[] args) {
		SpringApplication.run(StudentserviceApplication.class, args);
	}

}
