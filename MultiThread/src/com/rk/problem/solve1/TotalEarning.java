package com.rk.problem.solve1;

public class TotalEarning extends Thread{

	int total=0;
	
	public void run() {
		
		for(int i=1;i<=50000;i++) {
			
			total=total+100;
		}
		
	}//method
	
}//class
