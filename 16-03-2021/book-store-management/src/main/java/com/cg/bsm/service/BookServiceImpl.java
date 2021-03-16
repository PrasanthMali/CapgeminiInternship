package com.cg.bsm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bsm.dao.BookRepository;
import com.cg.bsm.entity.Book;

@Service
public class BookServiceImpl implements IBookService {
	@Autowired
	private BookRepository bookRepo;
	
	@Override
	public Book save(Book book) {
		return bookRepo.save(book);
	}

	@Override
	public void deleteById(Long bookId) {
		bookRepo.deleteById(bookId);

	}

	@Override
	public Book findById(Long bookId) {
		return bookRepo.findById(bookId).orElse(null);
	}

	@Override
	public List<Book> findAll() {
		return bookRepo.findAll();
	}

}
