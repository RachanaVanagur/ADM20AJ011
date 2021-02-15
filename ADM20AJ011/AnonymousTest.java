interface Nums{
	public void add(int x, int y);
}

class AnonymousTest 
{
	public static void main(String[] args) 
	{
		Nums numsRef = new Nums(){
			public void add(int x, int y){
				System.out.println("Sum = " + (x+y));
			}
		};

		Nums numsRef1 = new Nums(){
			public void add(int x, int y){
				System.out.println("Result = " + (x+y));
			}
		};

		numsRef.add(10,20);
		numsRef1.add(10,20);
	}
}
