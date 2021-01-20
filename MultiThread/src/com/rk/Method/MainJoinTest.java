package com.rk.Method;

public class MainJoinTest extends Thread {

	static Thread mainThread;
	
	public void run()
	{
		try {
			mainThread.join();
		}
		catch (InterruptedException e) {
		e.printStackTrace();
		}
		
		for(int i=0;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+"    "+"count is  "+i);
		}//for
	}//method
	
	public static void main(String[] args) throws InterruptedException {
		mainThread=Thread.currentThread();
		
	MainJoinTest jt=new MainJoinTest();
	
	jt.start();
	
	for(int i=0;i<=5;i++)
	{
		System.out.println(Thread.currentThread().getName()+"    "+" class      count is  "+i);
	}//for
	
	}//main
}//class
