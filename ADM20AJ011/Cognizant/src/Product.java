
public class Product{
	long prodId;
	String prodName;
	int qty;
	float unitPrice;

	public Product() {
		super();
	}

	public Product(long prodId, String prodName, int qty, float unitPrice) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.qty = qty;
		this.unitPrice = unitPrice;
	}

	@Override
	public String toString() {
		return "Product [" + prodId + " | " + prodName + " | " + qty + " | " + unitPrice+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (prodId ^ (prodId >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (prodId != other.prodId)
			return false;
		return true;
	}	
	

}
