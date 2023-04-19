package javaConstructor;

public class defaultConstructor {
	
	
	public static void main(String[] args) {
		
		
		defaultConstructor d=new defaultConstructor();
		d.defaultConstructor();
		d.defaultConstructor(100);
		d.defaultConstructor("akki");
		d.defaultConstructor(25, "akshay");
		
	}
	
	
	
	void defaultConstructor()
	{
		System.out.println("default constructor");
	}
	
	
	
	void defaultConstructor(int a)
	{
		System.out.println(a);
	}
	
	void defaultConstructor(String s)
	{
		System.out.println(s);
	}
	
	void defaultConstructor(int c,String k)
	{
		System.out.println(c+k);
	}
}
