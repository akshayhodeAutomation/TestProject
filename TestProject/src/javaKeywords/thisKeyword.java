package javaKeywords;

public class thisKeyword {
	
	public static void main(String[] args) {
		
//		thisKeyword t=new thisKeyword();
//		t.A();
		
		childClass1 c=new childClass1();
//		c.A1();
//		c.A2();
//		c.A3();
		c.A4();
		c.A5();
		
	}
	
	int a=10;
	int b=25;
	String s="parent";
	
	
	
	
	public void A()
	{
	  System.out.println(a);
	  System.out.println(b);
	  System.out.println(s);
	  
	 
	}
	
	public void A2()
	{
		System.out.println("this :"+this.a);
		System.out.println("this :"+this.b);
		System.out.println("this :"+this.s);
	}
	
	public void A3()
	{
		System.out.println("method super:"+a);
		System.out.println("method super :"+b);
		System.out.println("method super :"+s);
	}

}



class childClass1 extends thisKeyword
{
	
	int a=100;
	int b=200;
	String s="child";
	
	public void A1()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(s);
		
		 super.A3();
	}
	
	public void A2()
	{
		System.out.println("this :"+this.a);
		System.out.println("this :"+this.b);
		System.out.println("this :"+this.s);
	}
	
	public void A3()
	{
		System.out.println("super :"+super.a);
		System.out.println("super :"+super.b);
		System.out.println("super :"+super.s);
	}
	
	public void A4()
	{
		
		
     	super.A3();
	
	
	}
	public void A5()
	{
		
		
     	this.A2();
	
	
	}
	
	
}
