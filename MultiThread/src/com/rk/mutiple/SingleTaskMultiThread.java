package com.rk.mutiple;

public class SingleTaskMultiThread implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<=10;i++)
		{
			System.out.println("in run method "+i);
		}
		
	}//method
	
	public static void main(String[] args) {
	
		System.out.println("main method run:::");
		
		SingleTaskMultiThread stmt=new SingleTaskMultiThread();
		SingleTaskMultiThread stmt1=new SingleTaskMultiThread();
		SingleTaskMultiThread stmt2=new SingleTaskMultiThread();
		
		Thread th=new Thread(stmt);
		Thread th1=new Thread(stmt1);
		Thread th2=new Thread(stmt2);
		
		th.start();
		th1.start();
		th2.start();
	}//main
}//class 
