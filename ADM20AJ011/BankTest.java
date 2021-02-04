class BankTest 
{
	public static void main(String[] args) 
	{
		Bank bank = new SBI(); 
		bank.deposit(1000);
		bank.withdraw(500);
		bank.GstCalculation();

		System.out.println();

		bank = new ICICI(); 
		bank.deposit(1000);
		bank.withdraw(500);
		bank.GstCalculation();
		System.out.println();

		System.out.println(Bank.n); //static
		System.out.println(SBI.n); //static
		System.out.println(ICICI.n); //static
		System.out.println(bank.n); 

		//bank.n = 12; //error- cannot assign a value to final variable n

		//bank.checkMethod();//error: illegal static interface method call
		Bank.checkMethod();
	}
}
