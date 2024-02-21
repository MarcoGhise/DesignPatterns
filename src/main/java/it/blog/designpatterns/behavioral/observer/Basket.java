package it.blog.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Basket {
	public EventManager events;
	
	List<Product> cart = new ArrayList<>();

	public Basket() {
		this.events = new EventManager("add", "remove");
	}
	
	public void add(Product product)
	{
		cart.add(product);
		events.notify("add", product);
	}
	
	public void remove(Product product)
	{
		cart.remove(product);
		events.notify("remove", product);
	}
}
