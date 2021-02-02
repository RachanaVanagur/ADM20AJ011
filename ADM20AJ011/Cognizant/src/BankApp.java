import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account acc = null;		
		
		while(true) {
			System.out.println("1. Create Account");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Balance");
			System.out.println("5. Exit");
			
			System.out.print("enter an option: ");
			int opt = sc.nextInt();			
			System.out.println("--------------------------------------");
			
			switch(opt) {
			case 1:
				if(acc == null) {
					System.out.print("enter account number: ");
					long acno = sc.nextLong();
					sc.nextLine();
					
					System.out.print("enter A/C Name: ");
					String name = sc.nextLine();
					
					System.out.print("enter initial deposit: ");
					float amount = sc.nextFloat();
					
					//create account object
					acc = new Account(acno, name, amount);
					System.out.println("ACCOUNT CREATED");
				}else {
					System.out.println("FYI: ACCOUNT IS ALREADY CREATED");
				}
				break;
			case 2:
				if(acc != null) {
					System.out.print("enter amount to deposit: ");
					float amt = sc.nextFloat();
					acc.deposit(amt);
				}else {
					System.out.println("FYI: CREATE ACCOUNT!");
				}
				
				break;
			case 3:
				if(acc != null) {
					System.out.print("enter amount to withdraw: ");
					float amt = sc.nextFloat();
					acc.withdraw(amt);
				}else {
					System.out.println("FYI: CREATE ACCOUNT!");
				}				
				break;
			case 4:
				if(acc != null) {
					acc.getDetails();
				}else {
					System.out.println("FYI: CREATE ACCOUNT!");
				}
				break;
			case 5:
				System.out.println("***--- BYE BYE ---***");
				sc.close();				
				System.exit(0);
				break;
			default:
				System.out.println("INVALID OPTION .. TRY AGAIN");
				break;				
			}//switch
			System.out.println("======================================");
		}//while
	}//main
}//class
