package com.swu.user.ui;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.swu.user.service.UserService;
import com.swu.user.service.impl.UserServiceImpl;


public class TestSpring {
	private static ClassPathXmlApplicationContext ac;

	public static void main(String[] args) throws Exception {
		
		ac = new ClassPathXmlApplicationContext("/beans.xml");
		UserService uservice=ac.getBean("uservice", UserServiceImpl.class);
		uservice.addUser(null);
		
		
		
	}
}
