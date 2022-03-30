package it.blog.designpatterns.decorator;

public class AssemblyLineDecorator implements AssemblyLine{

	private AssemblyLine wrappee;

	AssemblyLineDecorator(AssemblyLine source) {
      this.wrappee = source;
  }
  
	@Override
	public void build(Product product) {
		wrappee.build(product);
		
	}

	@Override
	public Product get() {
		return wrappee.get();
	}

}
