
public class Rectangle extends Shape {
	int length;
	int breadth;

	public Rectangle(String color, int length, int breadth) {
		super(color);
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	void area() {
		System.out.println("Area of Rectangle = " + (this.length * this.breadth));
	}
}
