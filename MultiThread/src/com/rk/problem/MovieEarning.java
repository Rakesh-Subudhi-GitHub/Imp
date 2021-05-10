package com.rk.problem;

public class MovieEarning {

	public static void main(String[] args) {
		
		TotalEarning te=new TotalEarning();
		te.start();
		
		System.out.println("Total earning booked ticket is :: "+te.total+" Rs");   //that is give problem problem bcz 
																																					//TotalEaring Thread run to give some time
																																									//but main Thread is not wait it run directly
		
		                        //so it give 0 that is Problem
	}//main
}//class
