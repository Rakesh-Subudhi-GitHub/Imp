package com.rk.Demo;

class X{
	public X() {
		System.out.println("constructor calling in Class X");
	}
	public void show() {
		System.out.println("show method calling in class X ");
	}//method
}//class

public class Test {
	
public static void main(String[] args) {

	new X();
	
	new X().show();
}//main
}//class
