class Printer {
	//void printTable(int n){
	  synchronized void printTable(int n){
		for(int i=1;i<=10;i++){
			int p = n * i;
			System.out.println(n + " x " + i + " = " + p);
			try{
				Thread.sleep(1500);
			}catch(Exception ex){}			
		}//for
		System.out.println("---------------------------------");
		try{
			Thread.sleep(5500);
		}catch(Exception ex){}
	}
}


class Task1 extends Thread{
	Printer printer;
	Task1(Printer printer){
		this.printer = printer;
	}
	public void run(){
		printer.printTable(5);
	}
}

class Task2 extends Thread{
	Printer printer;
	Task2(Printer printer){
		this.printer = printer;
	}
	public void run(){
		printer.printTable(6);
	}
}


class SynchroTest
{
	public static void main(String[] args) 
	{
		Printer printerObj = new Printer();

		Task1 thread1 = new Task1(printerObj);
		Task2 thread2 = new Task2(printerObj);

		thread1.start();
		thread2.start();
	}
}
