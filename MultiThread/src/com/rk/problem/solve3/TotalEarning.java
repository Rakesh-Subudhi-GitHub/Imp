package com.rk.problem.solve3;

public class TotalEarning extends Thread{

	int total=0;
	
	public void run() {
		
		synchronized (this) {
			for(int i=1;i<=1000000;i++) {
				
				total=total+100;
			}
			this.notify(); //all execution complet then it send the main method 
															//you call release the main my work is complet
		}
		
	}//method
	
}//class
