package com.swu.user.service.impl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.swu.user.bean.User;
import com.swu.user.dao.UserDao;
import com.swu.user.service.UserService;

@Named("uservice")
public class UserServiceImpl implements UserService {

	private UserDao userdao; 
	@Inject
	public void setUserdao(UserDao userdao) {
		this.userdao = userdao;
	}

	public void myinit()
	{
		System.out.println("userserviceimpl init");
	}
	@Override
	public void addUser(User u) {
		
		System.out.println("user service adduser");
		
		userdao.insert(u);
	}

	@Override
	public List<User> findAll() {
		return userdao.select();
	}

	@Override
	public void modifyUser(User u) {
		
		
	}

	@Override
	public void delete(User u) {
	
		
	}

}
