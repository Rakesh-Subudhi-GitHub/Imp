package com.rk.solve.staticSynchronizationMethod;

public class MyThread1 extends Thread {

	SeatBook sb;
	int seat;

	public MyThread1(SeatBook sb, int seat) {
		
		this.sb = sb;
		this.seat = seat;
	
	}//2param constructor calling 

	public void run() {
		
		sb.seatbooked(seat);
	}
}//class
