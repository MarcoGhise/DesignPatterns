package it.blog.designpatterns.adapter;

public class UsMetricAdapter extends EuropeanMetric{

	private UsMetric usMetric;
	
	public UsMetricAdapter(UsMetric usMetric) {
		this.usMetric = usMetric;
	}
	
	@Override	 
	public double getWeight() {
		return usMetric.getWeight() / 0.453592;
	}
}