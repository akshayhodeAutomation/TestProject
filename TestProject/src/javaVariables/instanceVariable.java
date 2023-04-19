package javaVariables;

public class instanceVariable {
	
	public static void main(String[] args) {
		
		instanceVariable i=new instanceVariable();
		i.test();

		System.out.println();
		
		test1();
	}
	
	
	
	int a=10;
	int b=20;
	int c=30;
	
	public void test()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(a+b+c);
		
		
	}
	
	static int x=40;
	static int y=50;
	static int z=60;
	
	
	static void test1()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(x+y+z);
	}

}


  