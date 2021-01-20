package com.rk.Instance;

class A{
	class B{
		class C{
			public void show()
			{
				System.out.println("class c inner class method calling::");
			}//method
		}//class C
	}//class B
}//class A

public class InstanceInnerClassTest2 {

	public static void main(String[] args) {
		
		A a=new A();  //classA access
		A.B ab=a.new B();	//classB access
		A.B.C abc=ab.new C();	//classC access
		
		abc.show(); //method calling
	
	}//main
}//instanceInner class
