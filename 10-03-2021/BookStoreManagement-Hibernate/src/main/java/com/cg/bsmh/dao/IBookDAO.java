package com.cg.bsmh.dao;

import java.util.List;

import com.cg.bsmh.exception.BookStoreException;
import com.cg.bsmh.entity.Book;

public interface IBookDAO {	
	String add(Book book) throws BookStoreException;
	boolean delete(String bcode)throws BookStoreException;
	Book get(String bcode) throws BookStoreException;;
	List<Book> getAll() throws BookStoreException;;
	//boolean update(Book book) throws BookStoreException;
	void persist() throws BookStoreException;
}