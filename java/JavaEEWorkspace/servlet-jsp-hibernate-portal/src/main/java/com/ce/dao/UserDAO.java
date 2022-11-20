package com.ce.dao;

import java.util.List;

import com.ce.entity.User;

public interface UserDAO {
	void saveUser(User user);
	void updateUser(User user);
	void deleteUser(int id);
	User getUser(int id);
	List<User> getAllUsers();
}
