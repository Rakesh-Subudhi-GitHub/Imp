package com.rk.prioritie;

class Test extends Thread{
	public void run() {
		System.out.println("Test class prorities is :: "+Thread.currentThread().getPriority());
		for(int i=0;i<5;i++)
		{
		System.out.println("Test class  method running  :: "+i);	
		}
	}
}
public class Priorities extends Thread {

	public void run(){
		System.out.println("child class priorities is :: "+Thread.currentThread().getPriority());
		for(int i=0;i<5;i++)
		{
		System.out.println("child class  method running  :: "+i);	
		}
		
	}//run
	public static void main(String[] args) {
		
		System.out.println("priorities is :: "+Thread.currentThread().getPriority());
		
		Priorities p=new Priorities();
		
		Test t=new Test();
		t.setPriority(3);
		t.start();
		
		p.setPriority(1);
		p.start();
	}//main
}//class
