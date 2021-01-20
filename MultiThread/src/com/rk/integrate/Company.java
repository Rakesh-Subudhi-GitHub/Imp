package com.rk.integrate;

import javax.sql.rowset.spi.SyncResolver;

public class Company {

	int n;
	boolean flag=false;
	
	//flag=false : chance producer_item method
	//flag=true : chance consume_item() method
	
	synchronized public void produce_item(int n) throws InterruptedException
	{
		//check cond
		if(flag)
		{
			//flag=true
			wait();
			}
			
			this.n=n;
			System.out.println("Produce iteam :"+n);
			
			flag=true;
			notify();
			
	}//1st method
	
	synchronized int consume_item() throws InterruptedException
	{
		if(!flag)
		{
			//flag=false
		wait();
		}
		//flag=true : chance consume_item() method
		System.out.println("Consume iteam : "+n);
		
		flag=false;
		notify();
		
		return n;
		
	}//2nd method
	
}//class
