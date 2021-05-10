package com.rk.interrupter;

public class IsInterrupterTest extends  Thread {

	public void  run() {
		
		System.out.println(Thread.interrupted());//it true to convert  "false"  and execute the method
		
		//System.out.println(Thread.currentThread().isInterrupted()); //this time it not convert "true" so this is not execute method it stop it
		
		try {
			
			for(int i=0;i<=10;i++)
			{
				System.out.println(i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			
			System.out.println("Interupt thread comming ::: "+e);
		}//catch
		
	}//method
	
	public static void main(String[] args) {
		
		IsInterrupterTest it=new IsInterrupterTest();
		it.start();
		it.interrupt();
	}//main

}//class
