
public class SBTest {

	public static void main(String[] args) {
		//StringBuffer sb = new StringBuffer();
		StringBuilder sb = new StringBuilder();
		
		System.out.println(sb + " | Size = "+sb.length()+" | Capacity = "+ sb.capacity());
		
		sb.append("Cognizant ");
		System.out.println(sb + " | Size = "+sb.length()+" | Capacity = "+ sb.capacity());
		
		sb.append("Soluti");
		System.out.println(sb + " | Size = "+sb.length()+" | Capacity = "+ sb.capacity());
		
		sb.append("ons");
		System.out.println(sb + " | Size = "+sb.length()+" | Capacity = "+ sb.capacity());
		
		sb.insert(0, "** ");
		System.out.println(sb + " | Size = "+sb.length()+" | Capacity = "+ sb.capacity());
		
		sb.reverse();
		System.out.println(sb);
		
		//sb = new StringBuffer("ABC");
		sb = new StringBuilder("ABC");
		System.out.println(sb + " | Size = "+sb.length()+" | Capacity = "+ sb.capacity());
	}
}
