package it.blog.designpatterns.behavioral.state;

public class DeliveryState extends State {

	public DeliveryState(Warehouse warehouse) {
		super(warehouse);
	}

	@Override
	public String prepare(Product p) {
		return "Product already prepared";
	}

	@Override
	public String delivery(Product p) {
		this.warehouse.changeStatus(new AssignTrackIdState(warehouse));
		return "Delivery product: " + p;
	}

	@Override
	public String assignTrackId(Product p) {
		return "Tracking Id not yet available";
	}

	@Override
	public boolean isReadyToDelivery() {
		return true;
	}

	@Override
	public boolean isAssignTrackId() {
		return false;
	}

}
