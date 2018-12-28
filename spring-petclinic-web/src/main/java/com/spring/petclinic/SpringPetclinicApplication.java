package com.spring.petclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages={"com.spring"})
public class SpringPetclinicApplication {

   public static void main(String[] args) {
		SpringApplication.run(SpringPetclinicApplication.class, args);
	}
}
