package javaAccessModifiers;

public class protectedAM {
	
	public static void main(String[] args) {
		

	
	}
	
	protected int a=10;
	protected String s="akshay";
	
	protected void P()
	{
		System.out.println(a);
		System.out.println(s);
	}
	
	
}

  class K extends protectedAM
{
	 
}
