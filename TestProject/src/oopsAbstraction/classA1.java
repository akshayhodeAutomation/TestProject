package oopsAbstraction;

public class classA1 extends classA {
	
	void A()
	{
		System.out.println("class A1 abstract method 1");
	}
	
	void A1()
	{
		System.out.println("class A1 abstract method 2");
	}
	
//	void A2()
//	{
//		System.out.println("class A1 abstract method 3");
//	}

	
	public static void main(String[] args) {
		
		classA1 a=new classA1();
		a.A();
		a.A1();
	   //a.A2();
		a.A3();
		
		A4();
		
		System.out.println();
		
		classA c=new classA();
		c.A();
		c.A1();
		c.A2();
		c.A3();
		
		A4();
		
	}
	
}
