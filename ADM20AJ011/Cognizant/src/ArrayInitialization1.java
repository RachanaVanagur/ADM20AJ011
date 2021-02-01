
public class ArrayInitialization1 {

	public static void main(String[] args) {
		//two dimensional array initialization
		int[][] n = {{1,2,3},{4,5},{6,7,8,9}};
		
		System.out.println("Size of Array = " + n.length);
		
		for(int i=0;i<n.length;i++) {
			System.out.println("Size of n["+i+"] = " + n[i].length);
		}
		
		/*--- display array elements in matrix form ---*/
		for(int[] x : n) {
			for(int y : x) {
				System.out.print(y+"   ");
			}
			System.out.println();
		}

	}

}
