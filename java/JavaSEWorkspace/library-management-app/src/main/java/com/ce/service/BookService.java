package com.ce.service;

import java.util.List;

import com.ce.exception.LibraryException;
import com.ce.model.Book;

public interface BookService {
	Book add(Book book) throws LibraryException;
	Book save(Book book) throws LibraryException;
	void remove(Integer bookCode) throws LibraryException;
	List<Book> listAll() throws LibraryException;
	Book getById(Integer bookCode) throws LibraryException;
}
