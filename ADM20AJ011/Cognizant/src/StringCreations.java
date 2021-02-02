
public class StringCreations {

	public static void main(String[] args) {
		String s1 = "Cognizant";
		String s2 = "Cognizant";
		System.out.println(s1 == s2); //true
		
		String s3 = new String("Java");
		String s4 = new String("Java");
		System.out.println(s3 == s4); //false
		
		//s1=s1.concat(" Solutions");
		s1.concat(" Solutions");
		System.out.println(s1);
	}
}
