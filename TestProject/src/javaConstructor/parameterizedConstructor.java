package javaConstructor;

public class parameterizedConstructor {
	
	public static void main(String[] args) {

		parameterizedConstructor();
		parameterizedConstructor(100);
		parameterizedConstructor(100,100);
		parameterizedConstructor("akshay",97);

		
	}
	

	static public void parameterizedConstructor()
	{
		System.out.println("default constructor");
	}
	
	static public void parameterizedConstructor(int a)
	{
		System.out.println(a);
	}
	
	static public void parameterizedConstructor(int a, int b)
	{
		System.out.println(a+" "+b);
		System.out.println(a+b);
	}
	
	static public void parameterizedConstructor(String s,int k)
	{
		System.out.println(s+k);
	}
	
}
