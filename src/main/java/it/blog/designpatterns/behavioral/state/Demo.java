package it.blog.designpatterns.behavioral.state;

public class Demo {

	public static void main(String[] args) {
		Warehouse warehouse = new Warehouse();
		Product p1 = new Product("Apple");
		
		warehouse.changeStatus(new PrepareState(warehouse));
		
		/*
		 * Preparing
		 */
		warehouse.prepareProduct(p1);
		/*
		 * Delivery
		 */
		warehouse.delivery(p1);
		/*
		 * Assign track id
		 */
		warehouse.assignTrackId(p1);
	}

}
