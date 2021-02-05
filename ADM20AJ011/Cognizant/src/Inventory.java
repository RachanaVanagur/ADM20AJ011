import java.util.HashSet;

public class Inventory {

	public static void main(String[] args) {
		Product prod = new Product(1000231,"Monitor",12,6500f);
		System.out.println(prod); //calls toString()
		System.out.println(prod.getClass().getName());
		System.out.println(0x53bd815b);
		System.out.println(prod.hashCode());
		
		Product p1 = new Product(101,"Keyboard",10, 250);
		Product p2 = new Product(101,"Keyboard",10, 250);
		
		System.out.println(p1 == p2); //false
		System.out.println(p1.equals(p2)); //false
		
		System.out.println("p1 hashCode = "+ p1.hashCode());
		System.out.println("p2 hashCode = "+ p2.hashCode());
		
		HashSet<Product> set = new HashSet<>();
		set.add(p1);
		set.add(p2);
		System.out.println(set);
	}
}
