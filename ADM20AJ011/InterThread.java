class Account
{  
int balance = 10000;  
      
synchronized void withdraw(int amt)
{  
  System.out.println("Going to withdraw...");  
      
  if(this.balance < amt)
  {  
    System.out.println("Less balance; waiting for deposit...");  
    try
    {
      Thread.sleep(2000);
      wait();
    }
    catch(Exception e){}  
  }  
  this.balance -= amt;  

  System.out.println("withdraw completed...");  

  System.out.println("Balance Amount = "+ this.balance);
}  
      
synchronized void deposit(int amt)
{  
   System.out.println("Going to deposit...");  

   this.balance += amt;  
    try
    {
      Thread.sleep(2000);
    }
    catch(Exception e){} 
   System.out.println("Deposit completed... ");  

   notify();
   //notifyAll();  
   }  
}  
      
class InterThread
{  
public static void main(String args[])
{  
final Account acc = new Account();  

Thread t1 = new Thread()
{  
  public void run()
  {
   acc.withdraw(15000);
  }  
};  

Thread t2=new Thread()
{  
  public void run()
  {
       acc.deposit(10000);
  }  
};  
 
t1.start(); 
t2.start();
}
}  
