package com.rk.solve.staticSynchronizationMethod;

public class BookedTicketApp extends Thread{
	
	public static void main(String[] args) {
		
	SeatBook sb=new SeatBook();
	
	MyThread1 t1=new MyThread1(sb, 8);
	t1.start();
	
	MyThread1 t2=new MyThread1(sb, 7);
	t2.start();
	
	//--------------------------------------- one time run its not create a problem

	//create a another time then its get problem                        all thread are collapse
	
	SeatBook sb1=new SeatBook();
	
	MyThread1 t3=new MyThread1(sb1, 5);
	t3.start();
	
	MyThread1 t4=new MyThread1(sb1, 5);
	t4.start();
	
	}//main
}//class
