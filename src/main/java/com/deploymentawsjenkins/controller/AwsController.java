package com.deploymentawsjenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AwsController {
	
	@GetMapping("/aws")
	public String home() {
		return "my first deployment aws ec2 spring boot";
	}
	

}
