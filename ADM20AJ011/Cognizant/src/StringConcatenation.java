
public class StringConcatenation {

	public static void main(String[] args) {
		String s1 = "Cognizant";
		String s2 = " Solutions";
		String s3 = s1.concat(s2);
		String s4 = s1 + s2;
		
		System.out.println(s3);
		System.out.println(s4);
		
		/*
		//s3 = s1.concat(null); //java.lang.NullPointerException
		s3 = s1 + null;
		System.out.println(s3);
		*/
		
		s3 = s1.concat(" Solutions");
		System.out.println(s3);
		
		s3 = s1 + " Solutions "+ 25 + " Java";
		System.out.println(s3);
		
		s3=s1.concat("");
		System.out.println(s1+" | "+s3);
		System.out.println(s1 == s3); //true
		
		s3=s1+"";
		System.out.println(s1+" | "+s3);
		System.out.println(s1 == s3); //false		
	}

}
