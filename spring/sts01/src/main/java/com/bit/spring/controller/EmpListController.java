package com.bit.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.bit.spring.model.Emp01Dao;
import com.bit.spring.model.Emp02Dao;
import com.bit.spring.model.Emp03Dao;
import com.bit.spring.model.EmpDao;

public class EmpListController implements Controller {
	EmpDao dao;
	
	public EmpListController() {
		System.out.println("EmpListContoller...");
	}
	
	public void setDao(EmpDao dao) {
		this.dao = dao;
	}
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("emp/list");
		
		request.setAttribute("list", dao.selectAll());
		
		return mav;
	}

}
