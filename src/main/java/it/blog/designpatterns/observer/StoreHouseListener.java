package it.blog.designpatterns.observer;

public class StoreHouseListener implements EventListener {

	StoreHouse storeHouse;

	public StoreHouseListener() {
		storeHouse = new StoreHouse();
	}

	@Override
	public void update(String eventType, Product product) {
		switch (eventType) {
		case "add":
			storeHouse.add(product);
			break;
		case "remove":
			storeHouse.remove(product);
			break;
		}
	}

}
