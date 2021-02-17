import java.util.function.Predicate;

class PredicateEx 
{
	public static void main(String[] args) 
	{
		/*
		Predicate<Integer> pre = new Predicate<Integer>(){
			public boolean test(Integer in){
				if(in>=18)
					return true;
				return false;
			}
		};
		*/
		Predicate<Integer> pre = in -> in>=18;

		System.out.println(pre.test(10));
		System.out.println(pre.test(30));
	}
}
