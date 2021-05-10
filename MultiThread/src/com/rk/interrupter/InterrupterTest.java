package com.rk.interrupter;

public class InterrupterTest extends  Thread {

	public void  run() {
		
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
		
		InterrupterTest it=new InterrupterTest();
		it.start();
		it.interrupt();
	}//main

}//class
