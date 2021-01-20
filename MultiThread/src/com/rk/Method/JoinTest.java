package com.rk.Method;

public class JoinTest extends Thread {

	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+"    "+"count is  "+i);
		}//for
	}//method
	
	public static void main(String[] args) throws InterruptedException {
	
	JoinTest jt=new JoinTest();
	
	jt.start();
	jt.join();
	
	for(int i=0;i<=5;i++)
	{
		System.out.println(Thread.currentThread().getName()+"    "+" class      count is  "+i);
	}//for
	
	}//main
}//class
