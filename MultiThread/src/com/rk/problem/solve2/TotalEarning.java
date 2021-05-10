package com.rk.problem.solve2;

public class TotalEarning extends Thread{

	int total=0;
	
	public void run() {
		
		for(int i=1;i<=1000000;i++) {
			
			total=total+100;
		}
		
	}//method
	
}//class
