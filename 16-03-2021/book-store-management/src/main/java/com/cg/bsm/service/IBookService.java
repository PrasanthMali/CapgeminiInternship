package com.cg.bsm.service;

import java.util.List;

import com.cg.bsm.entity.Book;

public interface IBookService {
	Book save(Book book);
	void deleteById(Long bookId);
	Book findById(Long bookId);
	List<Book> findAll();
}
