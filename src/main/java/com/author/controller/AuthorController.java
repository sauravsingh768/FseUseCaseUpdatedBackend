package com.author.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.author.model.Author;
import com.author.model.Book;
import com.author.model.BookSearchRequest;
import com.author.model.ReaderBookBuy;
import com.author.service.IAuthorService;
import com.author.service.Order.IOrderBookService;
import com.author.service.signup.AuthSignUpServiceImpl;
import com.author.service.signup.IAuthSignUpService;



@RestController
@RequestMapping("/book")
@CrossOrigin(origins= "http://localhost:4200")
public class AuthorController {

	@Autowired
	IAuthorService authorService;
	
	@Autowired
	IAuthSignUpService authSignUpService;
	
	@Autowired
	IOrderBookService OrderService;
	
	

 
 @PostMapping("/saveauthor")
 Integer createEmployee(@RequestBody Book author)
 {
	 Integer bookId = authorService.saveBook(author);
	 System.out.println(bookId);
	return bookId;
 }
 @GetMapping("/allbooks")
 public List<Book> getBook()
 {
	 return authorService.getAllBooks();
 }
 @GetMapping("/getBook/{bookId}")
 public Optional<Book> getBookById(@PathVariable Integer bookId)
 {
	 Optional<Book> author = authorService.getBookById(bookId);
	 return author;
 }
 @PutMapping("/update/{bookId}")
	public ResponseEntity<Book> updateStudent(@PathVariable("bookId") Integer bookId , @RequestBody Book book)
	{
		return new ResponseEntity<Book>(authorService.updateBook(book, bookId), HttpStatus.OK);
	}
 @PostMapping("/searchBook")
	public List<Book>searchBook(@RequestBody BookSearchRequest bookSearch){
		return authorService.searchBook(bookSearch.getTitle(), bookSearch.getAuthorName(),bookSearch.getPublisher());
	}
 @PostMapping("/signup")
  Integer createAuthor(@RequestBody Author author) {
	Integer id = authSignUpService.createAuthor(author);
	System.out.println(id);
	return id;
 }
 
 @GetMapping("/signin/{userName}/{password}")
 public Integer signin(@PathVariable("userName") String userName,@PathVariable("password") String password)
 {
	 return authSignUpService.signin(userName, password);
	 
 }
 
 @PostMapping("/buybook")

 public Integer buyBook(@RequestBody ReaderBookBuy readerBookBuy) {



     Integer id = OrderService.buyBook(readerBookBuy);

     return id;

 }
}
