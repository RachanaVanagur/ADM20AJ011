class Account{
	void deposit(){
		System.out.println("Account class - deposit");
	}
}


class SavingsAccount extends Account{
	void deposit(){
		System.out.println("SavingsAccount class - deposit");
	}
}

class CurrentAccount extends Account{
	void deposit(){
		System.out.println("CurrentAccount class - deposit");
	}
}

class LoanAccount extends Account{
	void deposit(){
		System.out.println("LoanAccount class - deposit");
	}
}


class Polymorphism1 
{
	public static void main(String[] args) 
	{
		Account acc = new Account();

		SavingsAccount sacc = new SavingsAccount();
		CurrentAccount cacc = new CurrentAccount();
		LoanAccount lacc = new LoanAccount();

		acc.deposit();
		System.out.println("Account Type = "+ acc.getClass().getName());

		acc = sacc;
		acc.deposit();
		System.out.println("Account Type = "+ acc.getClass().getName());

		acc = cacc;
		acc.deposit();
		System.out.println("Account Type = "+ acc.getClass().getName());

		acc = lacc;
		acc.deposit();

		System.out.println("acc instanceof Account = "+ (acc instanceof Account)); //true
		System.out.println("acc instanceof SavingsAccount = "+ (acc instanceof SavingsAccount)); //false
		System.out.println("acc instanceof CurrentAccount = "+ (acc instanceof CurrentAccount)); //false
		System.out.println("acc instanceof LoanAccount = "+ (acc instanceof LoanAccount)); //true
		System.out.println("acc instanceof Object = "+ (acc instanceof Object)); //true

		System.out.println("Account Type = "+ acc.getClass().getName());
	}
}
