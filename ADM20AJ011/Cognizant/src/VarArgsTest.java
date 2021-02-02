
public class VarArgsTest {

	public static void main(String... args) {
		findLargest(10,20);
		findLargest(10,20,30);
		findLargest(1,2,3,4,5,6);
		findLargest();
		findLargest(10,34.5f,45.9,12);
	}


	private static void findLargest(double... args) {
		if(args.length>0) {
			double lar = args[0];
			for(int i=1;i<args.length;i++) {
				if(args[i] > lar)
					lar=args[i];
			}
			System.out.println("Largest = "+ lar);
		}
		else {
			System.out.println("No Arguments Passed!");
		}
	}

}
