
public class ConditionalOperator {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int lar;
		/*
		if(x > y)
		{
		  lar = x;
		}
		else
		{
		  lar = y;
		}
		*/
		lar = (x > y)?x:y;
		
		System.out.println("Largest = " + lar);

	}

}
