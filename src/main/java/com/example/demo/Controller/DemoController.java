package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
	@GetMapping("/j")
	public String add(ModelMap map) {
		map.put("kj", "Welcome to all");
		return "Home";
	}

}
