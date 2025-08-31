package com.register.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.register.entities.User;
import com.register.service.UserService;

import jakarta.servlet.http.HttpSession;





@Controller
public class MyController {
	
	@Autowired
	private UserService userservice;

	@GetMapping("/register")
	public String registerpage(Model model) {
         model.addAttribute("user", new User());
		return "register";
	}
	
	@PostMapping("/regForm")
	public String submitRegister(@ModelAttribute("user") User user,Model model) {
	boolean status=	userservice.registeruser(user);
	
	
	if (status) {
		model.addAttribute("successMsg", "User Registered Succesfully");
	}
	else {
		model.addAttribute("errorMsg", "Email already exists! Please use a different email");
	}
		return "register";
		
	}
	
	
	//Login
	@GetMapping("/login")
	public String Login(Model model) {
		model.addAttribute("userlogin", new User());
		return "login";
	}
	
	
	
	@PostMapping("/login")
	public String submitLoginForm(@ModelAttribute("userlogin") User user, Model model) 
	{
		User validuser=userservice.loginUser(user.getEmail(), user.getPassword());
		
		if (validuser != null) {
			model.addAttribute("modelname", validuser.getName());
			return "welcome";
		}else {
			model.addAttribute("errorMsg", "Email id or Password didnt matched");
			return "login";
		}
		
	}
	
	
	

    @GetMapping("/logout")
    public String logout(HttpSession session, Model model) {
        // Invalidate the current user session
        session.invalidate();

        // Optional: Add a logout success message to show on login page
        model.addAttribute("msg", "You have been logged out successfully!");

        // Redirect user to login page
        return "login";
	
    }
	
}
