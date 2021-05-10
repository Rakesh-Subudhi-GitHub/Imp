package com.rk.solve.synchronizationMethod;

import java.beans.Expression;

public class SeatBook {

	int total_seat=10;
	
 public void seatbooked(int seat)
	{
	 
	 System.out.println("hello this is "+Thread.currentThread().getName());
	 System.out.println("hello this is "+Thread.currentThread().getName());
	 System.out.println("hello this is "+Thread.currentThread().getName());
	 System.out.println("hello this is "+Thread.currentThread().getName());
	 System.out.println("hello this is "+Thread.currentThread().getName());
	 
	 synchronized (this) //this :- as an object referance  (work) 
	 //or
	 //synchronized (object referance expression)    but this is not create referance
	 
	 {
			
		 if(total_seat>=seat) {
		
			System.out.println(seat+" - BOOKED ticket Sucessfully");
			total_seat=total_seat - seat;
			System.out.println(" Total Seat left is :: "+total_seat);
		
		}//if
		else {
			System.out.println("Sorry for that You cannot booked ticket bcz total seat is :: "+total_seat);
		}
		 
		}//synch
	 
	 System.out.println("hello this is "+Thread.currentThread().getName());
	 System.out.println("hello this is "+Thread.currentThread().getName());
	 System.out.println("hello this is "+Thread.currentThread().getName());
	 System.out.println("hello this is "+Thread.currentThread().getName());
	 System.out.println("hello this is "+Thread.currentThread().getName());
	 
	}//method
	
}//class
