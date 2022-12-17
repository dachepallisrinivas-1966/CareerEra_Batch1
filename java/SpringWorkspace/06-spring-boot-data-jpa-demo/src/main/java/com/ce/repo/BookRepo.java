package com.ce.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ce.entity.Book;

public interface BookRepo extends JpaRepository<Book, Long> {

}
