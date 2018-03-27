package com.first.entity;

public class Product {
/*
 * 不带参数的构造方法
 * 对象的私有属性，例如：id，name等等；
 * 对象的get方法；
 * 对象的set方法
 */
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	private int id;
	private String name;
	private int price;
	private String description;
	private String image;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	

}
