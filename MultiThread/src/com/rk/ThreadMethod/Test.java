package com.rk.ThreadMethod;

public class Test extends Thread {

	public void run() {
		System.out.println("child method ::::");
		for(int i=0;i<=5;i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i+" :  value in working in child class  ");
		}
		
	}//method
	
	public static void main(String[] args)throws Exception {
		
		long StartTime=System.currentTimeMillis();
		Test t=new Test();
		Test t1=new Test();
		t.start();
		t1.start();
		
		System.out.println(System.currentTimeMillis());
		System.out.println("----------------------------------------------------------------------------");
		t.run();
		t1.run();
		System.out.println("mainsnhasjdhj");
		long EndTime=System.currentTimeMillis();
		
		System.out.println("Total time takes :: "+(EndTime-StartTime)+ "   milsec");
	}//main
}//class
