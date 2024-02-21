package it.blog.designpatterns.behavioral.state;

public class AssignTrackIdState extends State {

	public AssignTrackIdState(Warehouse warehouse) {
		super(warehouse);
	}

	@Override
	public String prepare(Product p) {
		return "Product already prepared";
	}

	@Override
	public String delivery(Product p) {
		return "Product already delivered";
	}

	@Override
	public String assignTrackId(Product p) {
		this.warehouse.changeStatus(new PrepareState(warehouse));
		return "Getting track id for product delivery:" + p;
	}

	@Override
	public boolean isReadyToDelivery() {
		return true;
	}

	@Override
	public boolean isAssignTrackId() {
		return true;
	}

}
