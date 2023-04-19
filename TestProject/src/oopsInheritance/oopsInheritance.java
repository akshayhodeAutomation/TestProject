package oopsInheritance;

 public class oopsInheritance {
	
	int a=10;
	int b=20;
	String s="i can do it";
	char c='A';
	int d=100;
	
	int z=a+b;
	
	
	public void pClass()
	{
		System.out.println(z);
		System.out.println(d);
		System.out.println(s);
		System.out.println(c);
		
	}
}

class A extends oopsInheritance
{
	int a=100;
	int b=200;
	String s="i will";
	
	public void cClass()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(s);
	}
	public void superKeyword()
	{
		System.out.println("super :"+super.a);
		System.out.println("super :"+super.b);
		System.out.println("super :"+super.s);
	}
	public void thisKeyword()
	{
		System.out.println("this :"+this.s);
	}
	
}
 class B extends A
{
	int d=500;
	char c='Z';
	
	
	public void cClass1()
	{
		System.out.println(d);
		System.out.println("super :"+super.d);
		System.out.println("this :"+this.c);
	
	}
	
	public static void main(String[] args) {
		
		B b=new B();
		b.cClass1();
		b.pClass();
	}
	
	
	
	
}
