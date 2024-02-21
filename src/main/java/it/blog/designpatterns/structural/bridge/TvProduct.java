package it.blog.designpatterns.structural.bridge;

public class TvProduct implements Product{

	private String shippingType;
	
	@Override
	public void wrapping() {
		System.out.println("Use polystyrene protection");
	}

	@Override
	public double getWeight() {		
		return 0.5;
	}

	@Override
	public boolean isFragile() {		
		return false;
	}

	@Override
	public void ship(String type) {
		this.shippingType = type;
		
	}

	public String getShippingType() {
		return shippingType;
	}

}
