package javaAbstractionClass;

public class Girls extends abstractClass{
	

	public void classA()
	{
		System.out.println("45 Girls in class A");
	}
	
	public void classB()
	{
		System.out.println("47 girls in class B");
	}
	
	public void classC()
	{
		System.out.println("41 Girls in class C");
	}
	
	

	public static void main(String[] args) {
		
		std();
		Girls g=new Girls();
		g.classA();
		g.classB();
		g.classC();
	
	
    }

}
