package com.swu.user.dao;

import java.util.List;

import com.swu.user.bean.User;

public interface UserDao {
	public List<User> select();
	public void insert(User u);
	public void delete(int uid);
	public void update(User u);
}
