package com.example.Deadpool;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/go")
public class Aventureexecution {
	@GetMapping(path="/boy")
	public String check() {
		return "I am Immortal";
	}
	
	

}
