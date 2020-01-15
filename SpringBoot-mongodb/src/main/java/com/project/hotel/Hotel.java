package com.project.hotel;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Document(collection ="Hotels")
public class Hotel {
	
	@Id
	private String id;
	private String name;
	@Indexed(direction=IndexDirection.ASCENDING)
	private int pricePerNight;
	private Address address;
	private List<Review> review;
	
	
	protected Hotel()
	{
		this.review = new ArrayList<>();
	}
	
		
	public Hotel( String name, int pricePerNight, Address address, List<Review> review) {
		super();
		this.name = name;
		this.pricePerNight = pricePerNight;
		this.address = address;
		this.review = review;
	}



	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPricePerNight() {
		return pricePerNight;
	}
	public void setPricePerNight(int pricePerNight) {
		this.pricePerNight = pricePerNight;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Review> getReview() {
		return review;
	}
	public void setReview(List<Review> review) {
		this.review = review;
	}
	
	

}
