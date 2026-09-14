package net.javaguides.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootDockerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDockerDemoApplication.class, args);
		//Create a new branch and modift this file
		System.out.println("Added for testing purpose");
	}

}
