interface StringLengthLambda
{
   int getLength(String str);
}

class LambdaTest3 
{
	public static void main(String[] args) 
	{
		/*
		StringLengthLambda sLambda = (String str) -> {
			              return str.length();
		};
		*/
		StringLengthLambda sLambda = str -> str.length();
		
		System.out.println("Length of String = " + sLambda.getLength("Hello World!"));
	}
}
