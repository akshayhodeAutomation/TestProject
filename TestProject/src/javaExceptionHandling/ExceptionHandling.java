package javaExceptionHandling;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		
		
		try
		{
			int a=50/0;
			
		}
		catch(Exception a)
		{
			System.out.println("Arithmetic Exception");
		}
		
		
		try
		{
			int a=50/12;
			
		}
		catch(Exception a)
		{
			System.out.println(" ");
		}
		finally
		{
			System.out.println("try block execute so catch block avoided");
		}
		
		
		
		try
		{
			String s=null;
			System.out.println(s.length());
		}
		
		catch(Exception a)
		{
			System.out.println("null pointer Exception");
		}
		finally
		{
			System.out.println("Finally block always executed either Exception is occures or not");
		}
		
		
		try
		{
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println("interruptedException");
		}
		
		
	}
	
	
	public void method() throws InterruptedException
	{
		Thread.sleep(2000);
		
	}
	
	public void method1(int age) throws Exception
	{
		
		
		if(age<18)
		{
			throw new Exception();
		}
		else
		{
			System.out.println("vote");
		}
	}
	
	
	

}
