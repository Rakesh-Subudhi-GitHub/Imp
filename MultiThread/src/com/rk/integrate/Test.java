package com.rk.integrate;

public class Test {
	
	public static void main(String[] args) {
		Company comp=new Company();
		Producer p=new Producer(comp);
		Consumer c=new Consumer(comp);
		
		p.start();
		c.start();
	}
}
