package com.ce.service;

import java.util.List;

import com.ce.dao.UserDao;
import com.ce.exception.InvalidUserException;
import com.ce.model.User;

public class UserServiceImpl implements UserService{

	private UserDao userDao;
	
	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
		
	}
	@Override
	public User add(User user) {
		return userDao.add(user);
	}

	@Override
	public User update(User user) {
		return userDao.update(user);
	}

	@Override
	public User getByFullName(String fullName) {
		return userDao.getByFullName(fullName);	
	}

	@Override
	public List<User> getAll() {
		return userDao.getAll();
	}

	@Override
	public void deleteByFullName(String fullName) throws InvalidUserException{
		if (!userDao.existsByFullName(fullName))
			throw new InvalidUserException();
		userDao.deleteByFullName(fullName);
	}

}
