package com.rk.problem.solve1;

public class MovieEarning {

	public static void main(String[] args) throws InterruptedException {
		
		TotalEarning te=new TotalEarning();
		te.start();
		
		synchronized (te) {
		
			te.wait(10);       //it wait for main in 5sec that time TotalEaring Thread is run and show 
			                                                     //may be actual output bcz if that time Thread is not complet may be   
		}
		
		System.out.println("Total earning booked ticket is :: "+te.total+" Rs");   
	}//main
}//class
