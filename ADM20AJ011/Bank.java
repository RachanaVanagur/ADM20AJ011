interface Bank
{
 int n = 12; //public static final
 void deposit(float amt); //public abstract
 void withdraw(float amt); //public abstract

 default void GstCalculation(){
	 System.out.println("GST Calculation...");
 }

 static void checkMethod(){
	 System.out.println("static method inside an interface...");
 }
}