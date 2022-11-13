package com.ce.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "books")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "bcode")
	private Long bcode;
	
	@Column(name = "title", nullable = false)
	private String title;
	
	public Book() {
		/* default constructor */
	}

	public Book(Long bcode, String title) {
		super();
		this.bcode = bcode;
		this.title = title;
	}

	public Long getBcode() {
		return bcode;
	}

	public void setBcode(Long bcode) {
		this.bcode = bcode;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return String.format("Book [bcode=%s, title=%s]", bcode, title);
	}
	
}
