package stu.napls.service;

import java.util.List;

import stu.napls.model.User;

public interface UserService {
	public User getUserById(int id);

	public User findUserByUsername(String username);
	
	public List<User> getUserInfo();
}
