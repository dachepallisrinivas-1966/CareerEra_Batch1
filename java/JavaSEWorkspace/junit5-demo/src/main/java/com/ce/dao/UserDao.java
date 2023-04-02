package com.ce.dao;

import java.util.List;

import com.ce.model.User;

public interface UserDao {
	User add(User user);
	User update(User user);
	User getByFullName(String fullName);
	List<User> getAll();
	boolean deleteByFullName(String fullName);
	boolean existsByFullName(String fullName);
}
 