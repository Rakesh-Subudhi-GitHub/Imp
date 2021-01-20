package com.rk.integrate;

public class Consumer extends Thread {

	Company c;
	
	public Consumer(Company c) {
		this.c = c;
	}

	public void run() {
		while(true)
		{
			try {
				c.consume_item();

				Thread.sleep(2000);
				} 
					catch (InterruptedException e) 
						{
						e.printStackTrace();
						}
			
		}//while
	}//run
}//class
