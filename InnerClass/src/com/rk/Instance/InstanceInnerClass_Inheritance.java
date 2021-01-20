package com.rk.Instance;
class OuterClass{
	
	class InnerClass1{
		public void show() {
			System.out.println("InnerClass 1 calling");
		}//method
	}//1st inner class
	
	class InnerClass2 extends InnerClass1{
	 	public void show1() {
	 		System.out.println("InnerClass 2 calling");
	 	}//method
	}//1st inner class
	
}// outer class

public class InstanceInnerClass_Inheritance {

	public static void main(String[] args) {
	
		OuterClass oc=new OuterClass();
		OuterClass.InnerClass2 ocic=oc.new InnerClass2();
		
		ocic.show();//inner class 1
		ocic.show1();//inner class 2
}//main
}//class
