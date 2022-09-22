package com.author.service.Order;

import org.springframework.data.jpa.repository.JpaRepository;

import com.author.model.ReaderBookBuy;

public interface IOrderRepo extends JpaRepository<ReaderBookBuy, Integer>{
	

}
