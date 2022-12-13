package com.yujin.majorservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MajorserviceApplication {

	@RequestMapping("/")
	public String major(){
		return "This is major service";
	}

	@RequestMapping("/major/{major}")
	public String majorInput(@PathVariable String major){
		return "My major is "+major;
	}

	public static void main(String[] args) {
		SpringApplication.run(MajorserviceApplication.class, args);
	}

}
