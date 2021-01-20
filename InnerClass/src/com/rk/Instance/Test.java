package com.rk.Instance;

class A1{
	int x=100;
	public void show()
	{
		int x=50;
		System.out.println("show method undeer run");
		System.out.println("x value ::"+x);
		System.out.println("x value but use This key word:: "+this.x);
	}//method
}//class

public class Test {
public static void main(String[] args) {
	
	A1 a=new A1();
	a.show();
	
}
}
