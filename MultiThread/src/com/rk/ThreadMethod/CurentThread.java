package com.rk.ThreadMethod;

public class CurentThread extends Thread{

		public void run()
		{
			
			System.out.println(Thread.currentThread()+"    Thread name is::  "+Thread.currentThread().getName());
			
			//change thread name
				//Thread.currentThread().setName("change name");
				//System.out.println("Thread name is :: "+Thread.currentThread().getName());
			//only one time change but main method to change accordingly change thread name
			
			for(int i=0;i<=10;i++)
			{
			
				System.out.println("in run method "+i);
			
			}//for
			
		}//run
		
		public static void main(String[] args) {
			
			System.out.println("main method running:::");
			
			System.out.println("current thread name is :: "+Thread.currentThread()+"    "+Thread.currentThread().getName());
			
			//set thread name
			Thread.currentThread().setName("RakeshThread");
			
			System.out.println("new thread name is ::"+Thread.currentThread().getName());
			
			//System.out.println(10/0);
			CurentThread ct=new CurentThread();
			ct.start();
			
			CurentThread ct1=new CurentThread();
			ct1.setName("changeThreadName");
			ct1.start();
			
			CurentThread ct2=new CurentThread();
			ct2.start();
			
		}//main
	}//class