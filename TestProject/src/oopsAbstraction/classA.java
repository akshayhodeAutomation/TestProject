package oopsAbstraction;

public class classA extends usingAbstractClass{
	
	void A()
	{
		System.out.println("classA abstract method 1");
	}
	
    void A1()
	{
		System.out.println("ClassA abstract method 2");
	}
	
    void A2()
	{
		System.out.println("ClassA abstract method 3");
	}
	
	
	
	public static void main(String[] args) {
		
		
		classA c=new classA();
		c.A();
		c.A1();
		c.A2();
		c.A3();
	
		A4();
		
		
		
	}

}
