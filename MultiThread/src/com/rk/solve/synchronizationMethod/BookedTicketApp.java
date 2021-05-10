package com.rk.solve.synchronizationMethod;

public class BookedTicketApp extends Thread{

	static SeatBook sb=new SeatBook();
	int seat=0;
	
	public void run() {
		
		sb.seatbooked(seat);
		
	}
	
	public static void main(String[] args) {
		
	BookedTicketApp amit=new BookedTicketApp();
	amit.seat=10;
	
	BookedTicketApp rohit=new BookedTicketApp();
	rohit.seat=7;
	
	amit.start();
	rohit.start();
	
	}//main
}//class
