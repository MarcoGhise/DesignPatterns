package it.blog.designpatterns.decorator;

import java.time.LocalDateTime;

public class Product {

	String name;
	String season;
	double price;
	LocalDateTime time;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public LocalDateTime getTime() {
		return time;
	}
	public void setTime(LocalDateTime time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", season=" + season + ", price=" + price + ", time=" + time + "]";
	}
}