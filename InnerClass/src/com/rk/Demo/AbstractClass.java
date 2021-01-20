package com.rk.Demo;
abstract class AbstarctClassTest{
	
	class Innerclass{
		
		public void show() {
			System.out.println("show method calling");
		}//method
	
	}
}

class Outer extends AbstarctClassTest{

	public void show1(){
		System.out.println("show1 method running");
	}//method

}//class

public class AbstractClass {

	public static void main(String[] args) {
	
		Outer o=new Outer();
		o.show1();
		
		//access abstract class innner class
		Outer.Innerclass oi=o.new Innerclass();
		
		//access method 
		oi.show();
	}
}
