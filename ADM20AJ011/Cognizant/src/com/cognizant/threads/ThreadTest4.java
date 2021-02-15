package com.cognizant.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class CognizantTask1 implements Callable<Integer> {
	@Override
	public Integer call() throws Exception {
		int otp = 0;
		// logic to generate OTP;
		try {
			System.out.println(Thread.currentThread().getName() + " - generating OTP");
			otp = (int) (Math.random() * 10000);
			TimeUnit.SECONDS.sleep(5);
		} catch (Exception ex) {
		}
		return otp;
	}

}

public class ThreadTest4 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService pool = Executors.newFixedThreadPool(10);

		CognizantTask1 task = new CognizantTask1();

		for (int i = 1; i <= 10; i++) {
			Future<Integer> future = pool.submit(task);
			Integer otp = future.get();
			System.out.println(otp);
		}

		pool.shutdown();
	}
}
