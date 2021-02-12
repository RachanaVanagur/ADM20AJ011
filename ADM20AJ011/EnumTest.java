enum Subject
{
  Java, C, CPP, Android
}

class EnumTest 
{
	public static void main(String[] args) 
	{
		Subject sub;
		sub = Subject.Java;
		System.out.println(sub);

		switch(sub){
			case Java:
				System.out.println("You have Opted for Java Course");
				break;
			case C:
				System.out.println("You have Opted for C Course");
				break;
			case CPP:
				System.out.println("You have Opted for CPP Course");
				break;
			case Android:
				System.out.println("You have Opted for Andoid Course");
				break;
			default:
				System.out.println("The Opted Course is Not Available at Present");				
		}

		System.out.println("CPP Ordninal = " + Subject.CPP.ordinal());
	}
}
