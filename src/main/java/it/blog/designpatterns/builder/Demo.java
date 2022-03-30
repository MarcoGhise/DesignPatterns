package it.blog.designpatterns.builder;

public class Demo {
	
	public static void main(String[] args) {
		Director director = new Director();

		// Director gets the concrete builder object from the client
		// (application code). That's because application knows better which
		// builder to use to get a specific product.
		TvProductBuilder builder = new TvProductBuilder();
		director.constructorTvProduct(builder);

		// The final product is often retrieved from a builder object, since
		// Director is not aware and not dependent on concrete builders and
		// products.
		TvProduct radio = builder.getProduct();
		
		System.out.println("Tv Product built:\n" + radio);

		VoucherProductBuilder voucherBuilder = new VoucherProductBuilder();

		// Director may know several building recipes.
		director.constructorVoucherProduct(voucherBuilder);
		
		VoucherProduct eVoucher = voucherBuilder.getProduct();
		
		System.out.println("\nVoucher Product built:\n" + eVoucher);
	}
	
}