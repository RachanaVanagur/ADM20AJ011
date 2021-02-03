class Customer{
	private long customerId;
	private String customerName;
	private String customerAddress;	
	
	public long getCustomerId() {
		return this.customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	@Override
	public String toString() {
		return "Customer:\nCustomer Id =" + customerId + "\nCustomer Name=" + customerName + "\nCustomerAddress="
				+ customerAddress;
	}	
	
	
}

public class Encapsulation {
	public static void main(String[] args) {
		Customer customer_1 = new Customer();
		System.out.println("Customer ID = " + customer_1.getCustomerId() + "\nCustomer Name = "+customer_1.getCustomerName()+"\nCustomer Address = "+customer_1.getCustomerAddress());
		System.out.println(customer_1);
		
		customer_1.setCustomerId(100123);
		customer_1.setCustomerName("Charles");
		customer_1.setCustomerAddress("Hyderabad");
		
		System.out.println(customer_1);
	}
}
