package com.rk.Demon;

class Test extends Thread{
	
	public void run() {
		System.out.println("Test class child thread running:: ");
		for(int i=0;i<5;i++)
		{
		System.out.println("Test class child thread running  :: "+i);	
		}
	}
}
public class DemonThread extends Thread {

		public void run() {
			System.out.println("child thread running:: ");
			for(int i=0;i<15;i++)
			{
			System.out.println("child thread running  :: "+i);	
			}
		}
		
		public static void main(String[] args) {
			
		System.out.println("main method running::: ");	
		
		DemonThread dt=new DemonThread();
		Test t=new Test();
		
		dt.setDaemon(true);
		dt.start();
		for(int i=0;i<5;i++)
		{
		System.out.println("main method running  :: "+i);	
		}
		t.start();
		
		}//main
	}//class

