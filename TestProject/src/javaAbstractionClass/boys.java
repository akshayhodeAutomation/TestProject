package javaAbstractionClass;

public class boys extends abstractClass {
	
	void classA()
	{
		System.out.println("62 boys in class A");
	}
	
	void classB()
	{
		System.out.println("76 boys in class B");
	}
	
	void classC()
	{
		System.out.println("71 boys in class C");
	}
	
	public static void main(String[] args) {
		
		std();
		
		boys b=new boys();
		b.classA();
		b.classB();
		b.classC();
		
		
	}
	

}
