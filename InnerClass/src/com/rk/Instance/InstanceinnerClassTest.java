package com.rk.Instance;

public class InstanceinnerClassTest {

	//instance variable
	int x=10;
	public void show()
	{
		System.out.println("instance method calling::::  ");
	}//instance method
	
	class A{
	
		//inner method
		public void show1()
		{
			System.out.println("inner class method calling::: ");
		}
		
	}//inner class

	public static void main(String[] args) {
		System.out.println("main method calling");
		
			//instance variable access
		InstanceinnerClassTest it=new InstanceinnerClassTest();
				System.out.println(it.x);
				it.show();
				
				//inner class access
				InstanceinnerClassTest.A itA=it.new A();
				
				itA.show1();
				
	}
}//outer class
