package com.rk.test;

public class MultiThreadRunnable implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<=10;i++)
		{
			System.out.println("in run method "+i);
		}
		
	}//method
	
	public static void main(String[] args) {
	
		System.out.println("main method run:::");
		
		MultiThreadRunnable mtr=new MultiThreadRunnable();
		
		Thread th=new Thread(mtr);
		th.start();
	}//main
}//class
