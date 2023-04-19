package oopsAbstraction;

public class interface1 implements usingInterface{
	
	public void body1()
	{
		System.out.println("Abstract method1 body1");
	}
	
	public void body2()
	{
		System.out.println("Abstract method1 body2");
	}
	
	public void body3()
	{
		System.out.println("Abstract method1 body3");
	}
	
	public void body4()
	{
		System.out.println("Abstract method1 body4");
	}
	
	
	public static void main(String[] args) {
		
		interface1 i=new interface1();
		i.body1();
		i.body2();
		i.body3();
		i.body4();
		
	}

}
