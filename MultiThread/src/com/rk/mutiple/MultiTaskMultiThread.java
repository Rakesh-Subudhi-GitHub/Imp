package com.rk.mutiple;

public class MultiTaskMultiThread {
	  public static void main(String[] args) {
		
			System.out.println("main method run:::");
			
			Test1 t1=new Test1();
			Test2 t2=new Test2();
			Test3 t3=new Test3();
			
			Thread th=new Thread(t1);
			Thread th1=new Thread(t2);
			Thread th2=new Thread(t3);
			
			th.start();
			th1.start();
			th2.start();
		}//main

	}//class 

class Test1 implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<=10;i++)
		{
			System.out.println("TEST 1 CLASS in run method "+i);
		}
		
	}//method
}//test1

class Test2 implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<=10;i++)
		{
			System.out.println("TEST 2 CLASS in run method "+i);
		}
		
	}//method
}//test2

 class Test3 implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<=10;i++)
		{
			System.out.println("TEST 3 CLASS in run method "+i);
		}
		
	}//method
 }//test3
 
