package com.spring.petclinic.springpetclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.spring","org.spring"})
public class SpringPetclinicApplication {

   public static void main(String[] args) {
		SpringApplication.run(SpringPetclinicApplication.class, args);
	}
}
