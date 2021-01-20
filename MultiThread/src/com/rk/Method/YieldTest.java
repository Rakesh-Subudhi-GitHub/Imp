package com.rk.Method;

public class YieldTest extends Thread {

	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+"    "+"count is  "+i);
		}//for
	}//method
	
	public static void main(String[] args) {
	
	YieldTest yt=new YieldTest();
	
	yt.start();
	Thread.yield();
	
	for(int i=0;i<=5;i++)
	{
		System.out.println(Thread.currentThread().getName()+"    "+" class      count is  "+i);
	}//for
	
	}//main
}//class
