
public class StringMethods {

	public static void main(String[] args) throws InterruptedException {
		String str = "Cognizant Solutions";
		System.out.println(str);
		
		System.out.println("Size = " + str.length());
		System.out.println("Character @ index 0 = " + str.charAt(0));
		
		System.out.println("Index of \"o\" = " + str.indexOf("o"));
		System.out.println("Index of \"o\" from index of 3 = " + str.indexOf("o", 3)); //3 is the starting index for search
		System.out.println("Last Index of \"o\" = " + str.lastIndexOf("o"));
		System.out.println("Index of \"Java\" = " + str.indexOf("Java")); //-1
		
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
				
		System.out.println(str.replace('o', '*'));
		System.out.println(str);
		
		String part = str.substring(10);
		System.out.println(part);
		part = str.substring(10,13);//10 -start index & 13-end index 
		System.out.println(part);
		
		String[] parts = str.split(" ");
		for(String pa : parts) {
			System.out.print(pa + " | ");
		}
		System.out.println();
		
		String s1 = new String("Java");
		String s2 = new String("java");
		System.out.println("s1==s2 ===> "+ (s1==s2));
		System.out.println("equals() ===> " + (s1.equals(s2)));
		System.out.println("contentEquals() ===> " + (s1.contentEquals(s2)));
		System.out.println("equalsIgnoreCase() ===> " + (s1.equalsIgnoreCase(s2)));
		
		System.out.println(str.startsWith("Cog"));
		System.out.println(str.endsWith("ns"));
		
		char[] chars = str.toCharArray();
		for(char c : chars) {
			System.out.print(c+"  ");
			Thread.sleep(200);//200ms
		}
		System.out.println();
		
		//to convert a string to byte[]
		byte[] b = str.getBytes();
		for(byte x : b) {
			//System.out.print(x+"  ");
			System.out.print((char)x+"  ");
		}
		System.out.println();
		
		String s3 = "   Java   Tech   ";
		System.out.println(s3);
		System.out.println(s3.length());
		
		s3 = s3.trim();
		System.out.println(s3);
		System.out.println(s3.length());
		
		int n = 65;
		String num_str = String.valueOf(n);
		System.out.println(num_str);
		
		num_str = "625";
		System.out.println(num_str+25); //62525
		n = Integer.parseInt(num_str);
		System.out.println(n+25); //650
		/*
		num_str = "A";
		n = Integer.parseInt(num_str); //java.lang.NumberFormatException
		System.out.println(n);
		*/
		
		String data1 = "ABC";
		//String data2 = "ABC";
		String data2 = "ADA";
		n = data1.compareTo(data2);
		System.out.println("compareTo value = " + n);
	}
}
