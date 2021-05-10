package com.rk.synchronization.problem;

public class SeatBook {

	int total_seat=10;
	
	public void seatbooked(int seat)
	{
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
