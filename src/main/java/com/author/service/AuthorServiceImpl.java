package com.author.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.author.model.Book;
import com.author.exception.*;

@Service
public class AuthorServiceImpl implements IAuthorService {
	@Autowired
	IAuthorRepository authorRepository;

	@Override
	public Integer saveBook(Book author) {
		
		Book savedBook =authorRepository.save(author);
		
		return savedBook.getBookId();
	}

	@Override
	public List<Book> getAllBooks() {
		return authorRepository.findAll();
	}

	@Override
	public Optional<Book> getBookById(Integer bookId) {
		return authorRepository.findById(bookId);
	}

	@Override
	public Book updateBook(Book book , Integer bookId)
	{
		Book existingBook = authorRepository.findById(bookId).orElseThrow(()
				-> new ResourceNotFoundException("Book", "Id", bookId));
				existingBook.setTitle(book.getTitle());
				existingBook.setCategory(book.getCategory());
				
				existingBook.setImage(book.getImage());
				existingBook.setPrice(book.getPrice());
				
				existingBook.setPublisher(book.getPublisher());
				existingBook.setAuthorName(book.getAuthorName());		
		authorRepository.save(existingBook);
		return existingBook;
	}

	@Override
	public List<Book> searchBook(String title, String authorName, String publisher) {
		return authorRepository.searchBook(title, authorName, publisher);
	}


}
