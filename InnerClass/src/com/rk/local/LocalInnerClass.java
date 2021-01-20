package com.rk.local;

class Outerclass{
	
	//local method
	public void show() {
		
		class innerclass
					{
			
						public void show1() {
							System.out.println("local inner class :::--->> show 1 method calling");
						}//method
						
					}//local inner class
	
		//access local inner class
		innerclass ic=new innerclass();
		ic.show1();
		
		System.out.println("outer class :::--->> show method calling");
	
	}//local method
}//outer class

public class LocalInnerClass {

	public static void main(String[] args) {
		
		Outerclass oc=new Outerclass();
		oc.show();
		
	}//main
}//class
