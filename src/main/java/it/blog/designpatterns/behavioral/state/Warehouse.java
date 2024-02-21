package it.blog.designpatterns.behavioral.state;

public class Warehouse {
	
	private State state;
	
	public void prepareProduct(Product p)
	{
		if (!(state.isAssignTrackId() && state.isReadyToDelivery()))
			System.out.println(state.prepare(p));		
	}
	
	public void delivery(Product p) {
		if (state.isReadyToDelivery())
			System.out.println(state.delivery(p));
	}
	
	public void assignTrackId(Product p) {
		if (state.isAssignTrackId())
			System.out.println(state.assignTrackId(p));
	}
	
	public void changeStatus(State state)
	{
		this.state = state;
	}

}
