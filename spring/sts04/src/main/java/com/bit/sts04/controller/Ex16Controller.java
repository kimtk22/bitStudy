package com.bit.sts04.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Ex16Controller {
	
	@RequestMapping("/ex16")
	public String ex16() {
		return "ex01";
	}
	
}
