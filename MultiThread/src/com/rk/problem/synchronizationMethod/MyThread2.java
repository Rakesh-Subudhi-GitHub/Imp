package com.rk.problem.synchronizationMethod;

public class MyThread2 extends Thread {

	SeatBook sb;
	int seat;

	public MyThread2(SeatBook sb, int seat) {
		
		this.sb = sb;
		this.seat = seat;
	
	}//2param constructor calling 

	public void run() {
		
		sb.seatbooked(seat);
	}
}//class
