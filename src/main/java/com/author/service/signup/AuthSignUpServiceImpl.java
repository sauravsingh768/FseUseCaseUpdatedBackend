package com.author.service.signup;

import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.author.model.Author;

import java.util.List;

@Service
public class AuthSignUpServiceImpl implements IAuthSignUpService {
	
	@Autowired
	private IAuthSignRepository authsignRepository;
	
	@Override
	public Integer createAuthor(Author author) {
		Author savingAuthor= authsignRepository.save(author);
		System.out.println(savingAuthor);
		
		return savingAuthor.getAuthorId();
		
	}
	
	@Override
	public Optional<Author> getAuthorById(Integer authorId) {
		return authsignRepository.findById(authorId);
	}
	
	@Override
	public List<Author> getAllAuthor() {
		return authsignRepository.findAll();
	}
	
	@Override
	public Integer signin(String userName, String password){
		System.out.println(authsignRepository.findAll());
		List<Author> login=authsignRepository.findAll().stream().
				filter(e->(e.getUserName().equals(userName))&&(e.getPassword().equals(password))).
						collect(Collectors.toList());
				System.out.println(login.size());
		
		if(login.size() > 0){
			if(login.get(0).getRole().equals("author")) {
				return 1;
			}
			
		
	      	else if(login.get(0).getRole().equals("reader")) {
			 return 2;
	      	}	
	    }
		else {
		return 0;
		} return 4;
	}
}
