package it.blog.designpatterns.behavioral.state;

public abstract class State {

	Warehouse warehouse;
	
	public State(Warehouse warehouse)
	{
		this.warehouse = warehouse;
	}
	
	public abstract String prepare(Product p);
	public abstract boolean isReadyToDelivery();
	public abstract String delivery(Product p);
	public abstract boolean isAssignTrackId();
	public abstract String assignTrackId(Product p);
}
