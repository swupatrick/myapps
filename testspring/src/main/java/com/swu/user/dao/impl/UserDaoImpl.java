package com.swu.user.dao.impl;


import java.util.List;



import javax.inject.Named;


import com.swu.user.bean.User;
import com.swu.user.dao.UserDao;

@Named("dao")
public class UserDaoImpl  implements UserDao{

	@Override
	public List<User> select() {
		
		return null;
	}

	@Override
	public void insert(User u) {
		System.out.println("userdaoimple insert()");
		
	}


	@Override
	public void delete(int uid) {
		//log
		
	}

	@Override
	public void update(User u) {
		//log
		
	}

}
