package com.rk.Instance;

class X1{
	int x=10;
		
	class Y{
		int x=100;
		
			public void show() {
				int x=1000;
			
				System.out.println("x value in local method:: "+x);
				System.out.println("x value in ClassB inner class  :: "+this.x);
				System.out.println("x value in ClassA outer class :: "+X1.this.x);
		
			}//method
	
	}//classB
}//classA
public class InstanceInnerClassVariableAccess {

	public static void main(String[] args) {
		System.out.println("main method run");
		
		X1 x=new X1();
		X1.Y xy=x.new Y();
	
		//invoke the method
		xy.show();
		
	}//main
}//class
