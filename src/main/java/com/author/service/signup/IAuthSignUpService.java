package com.author.service.signup;

import java.util.List;
import java.util.Optional;

import com.author.model.Author;

public interface IAuthSignUpService {

	Integer createAuthor(Author author);

	Optional<Author> getAuthorById(Integer authorId);

	List<Author> getAllAuthor();

	Integer signin(String userName, String password);

}
