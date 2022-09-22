package com.author.service.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.author.model.ReaderBookBuy;
@Service
public class OrderBookServiceImpl implements IOrderBookService{

	
	@Autowired
	   IOrderRepo readerRepository;
	@Override
	public Integer buyBook(ReaderBookBuy readerBookBuy) {
		
		
		ReaderBookBuy readerBuyingBook = readerRepository.save(readerBookBuy);

	        return readerBuyingBook.getpId();
	}

}
