package com.ce.service;

import java.util.List;

import com.ce.entity.Book;

public interface BookService {
	List<Book> getAll();
	Book getById(Long bcode);
	Book add(Book book);
	Book update(Book book);
	boolean deleteById(Long id);
}
