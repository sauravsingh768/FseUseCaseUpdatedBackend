package com.author.service;

import java.util.List;
import java.util.Optional;

import com.author.model.Book;





public interface IAuthorService {
	Integer saveBook(Book author);
	public List<Book> getAllBooks()	;
	Book updateBook(Book book , Integer id);
	
	Optional<Book> getBookById(Integer bookId);

	List<Book> searchBook(String title, String authorName, String publisher);
}
