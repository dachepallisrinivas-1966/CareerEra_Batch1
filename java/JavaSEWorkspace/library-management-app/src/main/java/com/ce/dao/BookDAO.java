package com.ce.dao;

import java.util.List;

import com.ce.exception.LibraryException;
import com.ce.model.Book;

public interface BookDAO {
	Book add(Book book) throws LibraryException;
	Book save(Book book) throws LibraryException;
	void remove(Integer bookCode) throws LibraryException;
	List<Book> listAll() throws LibraryException;
	Book getById(Integer bookCode) throws LibraryException;
	
	public static final String INS_QRY  = "INSERT INTO books(bcode, title, price, category) VALUES (?,?,?,?)";
	public static final String UPD_QRY = "UPDATE books SET title = ?, price = ?, category = ? WHERE bcode = ?";
	public static final String DEL_QRY = "DELETE FROM books WHERE bcode = ?";
	public static final String SELECT_ALL_QRY = "SELECT bcode, title, price, category FROM books";
	public static final String SELECT_BY_ID_QRY = "SELECT bcode, title, category FROM books WHERE bcode = ?";
}
