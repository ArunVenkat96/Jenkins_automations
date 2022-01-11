package com.avit.testrelease;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Testing {
	@GetMapping("/api/getdetails")
	public String testing() {
		return "arun";
		
	}
}
