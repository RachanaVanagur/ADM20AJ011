class LambdaTest4 
{
	public static void main(String[] args) 
	{
		/*
		Runnable r = new Runnable(){
			public void run(){
				for(int i=1;i<=10;i++){
					try{
						System.out.println(Thread.currentThread().getName()+" - "+i);
						Thread.sleep(1000);
					}catch(Exception ex){}
				}
			}
		};
		*/
		Runnable r = () -> {
				for(int i=1;i<=10;i++){
					try{
						System.out.println(Thread.currentThread().getName()+" - "+i);
						Thread.sleep(1000);
					}catch(Exception ex){}
				}
		};

		Thread ct = new Thread(r);
		ct.start();
		
		Thread ct1 = new Thread(r);
		ct1.start();

		Thread ct2 = new Thread(()->System.out.println(Thread.currentThread().getName()+" working..."));
		ct2.start();
	}
}
