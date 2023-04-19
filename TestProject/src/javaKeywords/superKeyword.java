package javaKeywords;

public class superKeyword {

	
	int a=10;
	int b=20;
	int c=30;
	int d=40;
	
	 public void A()
	{
		System.out.println("A :"+a);
		System.out.println("A :"+b);
	}
	

	public static void main(String[] args) {
		
		superKeyword s=new superKeyword();
		s.A();
		
		childClass c=new childClass();
		c.A1();
		c.A2();	
		c.A3();
		c.A4();
	}

}

class childClass extends superKeyword
{	
	int a=200;
	int b=300;
	
	public void A1()
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	public void A2()
	{
		System.out.println("A2 super :"+super.a);
		System.out.println("A2 super :"+super.b);
	}
	
	public void A3()
	{
		System.out.println(c);
		System.out.println(d);
	}
	
	public void A4()
	{
		System.out.println("A1 this :"+this.a);
		System.out.println("A1 this:"+this.b);
	}
	
	
	
	
	
	
	
	
	
}
