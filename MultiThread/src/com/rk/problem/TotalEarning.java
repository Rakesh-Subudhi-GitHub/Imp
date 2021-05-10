package com.rk.problem;

public class TotalEarning extends Thread{

	int total=0;
	
	public void run() {
		
		for(int i=1;i<=10;i++) {
			
			total=total+100;
		}
		
	}//method
	
}//class
