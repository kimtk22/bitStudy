package com.bit.spring.aop;

import java.lang.reflect.Method;

import org.apache.log4j.Logger;
import org.springframework.aop.ThrowsAdvice;

public class ExceptionMethod implements ThrowsAdvice {
	Logger log = Logger.getLogger(this.getClass());
	
	public void afterThrowing(Method method, Object[] args, Object target, Exception ex) {
		log.debug("exception");
	}
}
