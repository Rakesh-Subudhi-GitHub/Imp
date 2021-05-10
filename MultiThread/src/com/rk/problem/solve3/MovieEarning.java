package com.rk.problem.solve3;

public class MovieEarning {

	public static void main(String[] args) throws InterruptedException {
		
		TotalEarning te=new TotalEarning();
		te.start();
		
		synchronized (te) {
		
			te.wait();      //it give Actual out put
						//it stop the main method 
			
			//notify() is come then it release the main method and say you can execute the  next value
		}
		
		System.out.println("Total earning booked ticket is :: "+te.total+" Rs");   
	}//main
}//class
