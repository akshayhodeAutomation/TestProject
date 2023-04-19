package javaKeywords;

public class finallyKeyword {
	
	
	
	
	public static void main(String[] args) {
		
		finallyBlock();
		
	}
	
	static public void finallyBlock()
{
	try
	{
		float a=50/12;
		
		System.out.println(a);
	}
	catch(Exception a)
	{
		System.out.println("Arithmetic Exception");
	}
	finally
	{
		System.out.println("Finally bolck always executed");
	}
	
}

}
