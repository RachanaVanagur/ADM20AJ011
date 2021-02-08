package com.cognizant.collections;

public class Product implements Comparable<Product>{
	private long productId;
	private String prodName;

	public Product(long productId, String prodName) {
		super();
		this.productId = productId;
		this.prodName = prodName;
	}

	@Override
	public String toString() {
		return "[productId=" + productId + ", prodName=" + prodName + "]\n";
	}

	@Override
	public int compareTo(Product o) {		
		if(this.productId > o.productId)
			return 1;
		else if(this.productId < o.productId)
			return -1;
		else
			return 0;
	}
}
