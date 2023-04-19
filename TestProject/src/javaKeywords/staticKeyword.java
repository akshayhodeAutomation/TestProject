package javaKeywords;

public class staticKeyword {
	
	
	
	public static void main(String[] args) {
		
		A1();
		
		staticKeyword.A1();
		
		staticKeyword s=new staticKeyword();
		s.A1();
		
		System.out.println("down");
		
		
		
		
	}
	static int a=10;
	
	
	static void A1()
	{
		System.out.println(a);
	}

}
