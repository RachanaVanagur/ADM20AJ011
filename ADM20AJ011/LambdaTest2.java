@FunctionalInterface
interface Nums{
  public int add(int x, int y);
}

class LambdaTest2
{
	public static void main(String[] args) 
	{
		//Nums numsRef = (int x, int y)->{return x + y;};
		//Nums numsRef = (x,y)->{return x + y;};
		Nums numsRef = (x,y)-> (x + y);
		
		System.out.println("result = "+ numsRef.add(10,20));		
	}
}
