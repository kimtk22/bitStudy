package com.bit.sts29.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	
	@RequestMapping("/home")
	public String home() {
		return "home";
	}
	@RequestMapping("/")
	public String index() {
		return "home";
	}
	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
}
