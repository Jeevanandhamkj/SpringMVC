package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.Repo.UserRepo;
import com.example.demo.model.UserReg;

@Controller
public class DemoController {
	
	@Autowired
	UserRepo userRepo;
	@GetMapping("/j")
	public String add(ModelMap map) {
		map.put("kj", "Welcome to all");
		map.put("UserReg", new UserReg());
		return "Home";
	}
	@PostMapping("/add")
	public String save(UserReg userReg ,Model model) {
		 userRepo.save(userReg);
		 model.addAttribute("m", "Data stored in DB successfully");
		return "Welcome";
	}

}
