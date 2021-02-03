
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
}
