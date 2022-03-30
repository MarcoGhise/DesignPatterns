package it.blog.designpatterns.state;

public class PrepareState extends State {

	public PrepareState(Warehouse warehouse) {
		super(warehouse);	
	}

	@Override
	public String prepare(Product p) {
		this.warehouse.changeStatus(new DeliveryState(warehouse));
		return "Preparing product..." + p;
	}

	@Override
	public String delivery(Product p) {
		return "Product is not yet available";
	}

	@Override
	public String assignTrackId(Product p) {
		return "Tracking Id not yet available";
	}

	@Override
	public boolean isReadyToDelivery() {		
		return false;
	}

	@Override
	public boolean isAssignTrackId() {
		return false;
	}

}
