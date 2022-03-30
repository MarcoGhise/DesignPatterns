package it.blog.designpatterns.observer;

public interface EventListener {
	void update(String eventType, Product product);
}
