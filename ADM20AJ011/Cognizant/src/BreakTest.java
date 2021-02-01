
public class BreakTest {

	public static void main(String[] args) {
		for(int i=1;;i++) {
			System.out.println(i);
			if(i == 5)
				break;
		}
		System.out.println("*** end ***");
	}
}
