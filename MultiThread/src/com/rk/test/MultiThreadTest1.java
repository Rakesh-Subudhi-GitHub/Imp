package com.rk.test;

public class MultiThreadTest1 extends Thread {

	public void run()
	{
		for(int i=0;i<=10;i++)
		{
		System.out.println("in run method "+i);
		}//for
		
	}//run
	
	public static void main(String[] args) {
		
		System.out.println("main method running:::");
		
		MultiThreadTest1 mt=new MultiThreadTest1();
		mt.start();
	}//main
}//class
