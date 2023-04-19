package oopsInterface;

public class childClass implements parentInterface {
	
	
	public void A()
	{
		System.out.println("java oops");
	}
	
	public void B()
	{
		System.out.println("java collection framework");
	}
	
	public void C()
	{
		System.out.println("java Exception Handling");
	}
	
	public static void main(String[] args) {
		
		
		childClass c=new childClass();
		c.A();
		c.B();
		c.C();
		
	}

}
