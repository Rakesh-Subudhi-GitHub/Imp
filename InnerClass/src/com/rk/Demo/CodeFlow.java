package com.rk.Demo;

class A{

	//constructor block calling
	public A() {
		System.out.println("constructor calling:::");
	}//constructor
	
	//method
	public void show() {
		System.out.println("method calling");
	}//method

	//instance block
	{
		System.out.println("instance block calling");
	}
	
	static  {
		System.out.println("static block calling");
	}
	
}//class
public class CodeFlow {

	public static void main(String[] args) {
	
		A a=new A();
		a.show();
	
	}//main
}//class
