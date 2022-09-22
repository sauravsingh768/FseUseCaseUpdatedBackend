package com.author.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class ReaderBookBuy {
	
	


public ReaderBookBuy() {
		super();
		// TODO Auto-generated constructor stub
	}

public ReaderBookBuy(Integer pId, String readerName, String readerEmailId, String bId, Integer price) {
		super();
		this.pId = pId;
		this.readerName = readerName;
		this.readerEmailId = readerEmailId;
		this.bId = bId;
		this.price = price;
	}

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Integer pId;
private String readerName;

private String readerEmailId;   

private String bId;

private Integer price;

public Integer getpId() {
	return pId;
}

public void setpId(Integer pId) {
	this.pId = pId;
}

public String getReaderName() {
	return readerName;
}

public void setReaderName(String readerName) {
	this.readerName = readerName;
}

public String getReaderEmailId() {
	return readerEmailId;
}

public void setReaderEmailId(String readerEmailId) {
	this.readerEmailId = readerEmailId;
}

public String getbId() {
	return bId;
}

public void setbId(String bId) {
	this.bId = bId;
}

public Integer getPrice() {
	return price;
}

public void setPrice(Integer price) {
	this.price = price;
}



}
