package com.spring.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {

	@RequestMapping({"/owners"})
	public String listOfOwners() {
		return "owner/index";
	}
}
