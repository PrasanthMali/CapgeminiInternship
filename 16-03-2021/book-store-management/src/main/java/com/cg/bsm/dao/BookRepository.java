package com.cg.bsm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.bsm.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

}
