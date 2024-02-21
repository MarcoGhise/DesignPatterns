package it.blog.designpatterns.behavioral.observer;

import java.util.HashMap;
import java.util.Map;

public class StoreHouse {

	Map<String, Product> storeHouse = new HashMap<>();

	public StoreHouse() {
		Product apple = new Product("Apple", 10, 100);
		Product pear = new Product("Pear", 2, 20);
		Product grapes = new Product("Grapes", 8, 50);

		storeHouse.put(apple.getName(), apple);
		storeHouse.put(pear.getName(), pear);
		storeHouse.put(grapes.getName(), grapes);
	}

	public void remove(Product product) {
		storeHouse.get(product.getName()).setQty(storeHouse.get(product.getName()).getQty() + 1);
		System.out.println("After remove:" + storeHouse.get(storeHouse.get(product.getName()).getName()));
	}

	public void add(Product product) {
		storeHouse.get(product.getName()).setQty(storeHouse.get(product.getName()).getQty() - 1);
		System.out.println("After added:" + storeHouse.get(storeHouse.get(product.getName()).getName()));
	}

	public Map<String, Product> getStoreHouse() {
		return storeHouse;
	}
}
