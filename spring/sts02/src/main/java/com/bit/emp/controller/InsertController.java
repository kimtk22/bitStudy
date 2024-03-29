package com.bit.emp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.bit.emp.model.EmpDao;
import com.bit.emp.model.EmpVo;

public class InsertController implements Controller {
	EmpDao dao;
	
	public void setDao(EmpDao dao) {
		this.dao = dao;
	}
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		dao.insertOne(new EmpVo(
				Integer.parseInt(request.getParameter("empno")),
				request.getParameter("ename"),
				Integer.parseInt(request.getParameter("sal")),
				request.getParameter("job"),
				null
				));
		return new ModelAndView("redirect:list.bit");
	}

}
