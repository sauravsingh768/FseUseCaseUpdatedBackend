package com.author.service.signup;

import org.springframework.data.jpa.repository.JpaRepository;

import com.author.model.Author;

public interface IAuthSignRepository extends JpaRepository<Author, Integer> {

}
