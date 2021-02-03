
public class Inventory {

	public static void main(String[] args) {
		Product prod = new Product(1000231,"Monitor",12,6500f);
		System.out.println(prod); //calls toString()
		System.out.println(prod.getClass().getName());
		System.out.println(0x53bd815b);
		System.out.println(prod.hashCode());
	}
}
