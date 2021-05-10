package com.rk.solve.staticSynchronizationMethod;

import java.beans.Expression;

public class SeatBook {

	static int total_seat=10;				//all are Static method or static synchronized then solve
	
 public static synchronized void seatbooked(int seat)
	{
	 
	 System.out.println(Thread.currentThread().getName());
	
	 if(total_seat>=seat) {
		
			System.out.println(seat+" - BOOKED ticket Sucessfully");
			total_seat=total_seat - seat;
			System.out.println(" Total Seat left is :: "+total_seat);
		
		}//if
		else {
			System.out.println("Sorry for that You cannot booked ticket bcz total seat is :: "+total_seat);
		}
		 
	}//method
	
}//class
