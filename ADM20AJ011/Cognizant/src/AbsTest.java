import java.util.Scanner;
import java.lang.Object;
public class AbsTest {

	public static void main(String[] args) {
		Shape shape = null;
		// shape = new Shape("Red");//error: cannot create a direct object for an
		// abstract class

		Scanner sc = new Scanner(System.in);

		System.out.println("Which shape do you want to work with? \n1.Rectangle\n2.Circle");
		int opt = sc.nextInt();

		switch (opt) {
		 case 1:
			 System.out.print("Enter Color of Rectangle: ");
			 String color = sc.next();
			 System.out.print("Enter Length for of Rectangle: ");
			 int length = sc.nextInt();
			 System.out.print("Enter Breadth for of Rectangle: ");
			 int breadth = sc.nextInt();
			 
			 shape = new Rectangle(color, length, breadth);
			break;
		 case 2:
			 System.out.print("Enter Color of Circle: ");
			 color = sc.next();
			 System.out.print("Enter Radius Rectangle: ");
			 float radius = sc.nextFloat();
			 			 
			 shape = new Circle(color, radius);			 
			break;
		 default:
			System.out.println("Invalid Option... Try Again");
			return;
		}
		
		System.out.println("Color = "+ shape.getColor());
		shape.setColor("Green");
		shape.area();
		
		System.out.println("--- Shape Selected by the User = "+shape.getClass().getName().toUpperCase()+" ----");
	}

}
