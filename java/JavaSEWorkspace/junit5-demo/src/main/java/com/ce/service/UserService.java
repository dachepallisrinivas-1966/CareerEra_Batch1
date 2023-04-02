package com.ce.service;

import java.util.List;

import com.ce.exception.InvalidUserException;
import com.ce.model.User;

public interface UserService {
	User add(User user);
	User update(User user);
	User getByFullName(String fullName);
	List<User> getAll();
	void deleteByFullName(String fullName) throws InvalidUserException;
}
