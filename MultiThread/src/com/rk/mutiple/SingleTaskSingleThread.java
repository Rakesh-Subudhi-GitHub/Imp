package com.rk.mutiple;

import com.rk.test.MultiThreadRunnable;

public class SingleTaskSingleThread implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<=10;i++)
		{
			System.out.println("in run method "+i);
		}
		
	}//method
	
	public static void main(String[] args) {
	
		System.out.println("main method run:::");
		
		SingleTaskSingleThread stst=new SingleTaskSingleThread();
		
		Thread th=new Thread(stst);
		th.start();
	}//main
}//class 
