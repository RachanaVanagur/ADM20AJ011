
public class Literals {

	public static void main(String[] args) {
		//Integral Literals
		System.out.println(12);
		System.out.println(012);
		//System.out.println(028); //The literal 028 of type int is out of range 
		System.out.println(0x12);
		System.out.println(0XFF);
		System.out.println(0b11);
		System.out.println();
		
		System.out.println('9');
		System.out.println('A');
		System.out.println(Integer.toHexString(65)); //41
		System.out.println(0x41); //65
		
		System.out.println('\u0041');
		System.out.println(Integer.toHexString(97));
		System.out.println('\u0061');
		
		System.out.println('\u0905');
		System.out.println('\u0c05');
		System.out.println('\u4eca');
		System.out.println('\u0975');
		
		System.out.println(true);
		System.out.println(false);

	}
}
