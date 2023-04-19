package javaInterface;

public class classA implements interfaceClass {
	
	
	public void A1()
	{
		System.out.println("A1");
	}
	
	public void A2()
	{
		System.out.println("A2");
	}
	
	public void A3()
	{
		System.out.println("A3");
	}
	
	
	public static void main(String[] args) {
		
		classA c=new classA();
		c.A1();
		c.A2();
		c.A3();
		
		
		
	}

}
