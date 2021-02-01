//program to display first 10 odd number
public class ContinueTest {

	public static void main(String[] args) {
		for(int i=1;i<=20;i++) {
			int rem = i%2;
			if(rem==0)
				continue;
			System.out.println(i);
		}
	}
}
