package it.blog.designpatterns.behavioral.observer;

public interface EventListener {
	void update(String eventType, Product product);
}
