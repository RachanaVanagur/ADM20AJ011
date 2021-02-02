
public class Account {
 long acno;
 String name;
 float bal;
 
 Account(){}

 Account(long acno, String name, float bal) {	
	this.acno = acno;
	this.name = name;
	this.bal = bal;
 }
 
 /*--- method for withdrawing amount from account ---*/
 void withdraw(float amt) {
	 if(this.bal >= amt) {
		 this.bal -= amt;
		 System.out.println("FYI: Rs."+amt+ " debited || Balance: "+ this.bal);
	 }else {
		 System.out.println("ERROR: Insufficient Balance!");
	 }	 
 }
 
 /*--- method for depositing amount to account --- */
 void deposit(float amt) {
	 this.bal += amt;
	 System.out.println("FYI: Rs."+amt+" credited || Balance: "+ this.bal);
 }
 
 /*--- method for display the account details ---*/
 void getDetails() {
	 System.out.println("A/C No: "+this.acno+" | NAME: "+this.name+" | BALANCE: "+this.bal);
 } 
 
 static Account createAccount(long acno, String name, float amount) {
	 return new Account(acno, name, amount);
 }
 
}
