package com.bit.frame.filer;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;

@WebFilter(value = "/*", initParams = {
		@WebInitParam(name = "encoding", value = "utf-8")
})
public class Ex02Filter implements Filter {
	String encoding;
	
	@Override
	public void init(FilterConfig config) throws ServletException {
		System.out.println("Ex02 Filter init");
		encoding = config.getInitParameter("encoding");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("Ex02 Filter doFilter");
		HttpServletRequest req = (HttpServletRequest) request;
		if(!req.getMethod().equals("GET")) request.setCharacterEncoding(encoding); 
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
		System.out.println("Ex02 Filter destroy");
	}

}
