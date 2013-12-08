package com.swu.user.service;

import java.util.List;

import com.swu.user.bean.User;

public interface UserService {
	public void addUser(User u);
	public List<User> findAll();
	public void modifyUser(User u);
	public void delete(User u);
}
