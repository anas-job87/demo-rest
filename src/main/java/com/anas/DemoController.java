package com.anas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DemoController {

	@GetMapping
	public String greeting(@RequestParam(defaultValue = "Anonymous") String name) {
		return "Hello "+name;
	}
	
}
