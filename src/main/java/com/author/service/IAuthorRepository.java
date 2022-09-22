package com.author.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.author.model.Book;

public interface IAuthorRepository extends JpaRepository<Book, Integer> {

	@Query(value="select * from book where title=?1 or author_name=?2 or publisher<=?3",nativeQuery = true)
	List<Book> searchBook(String title, String authorName, String publisher);
}
