package javaLoops;

public class forLoop {
	
	public static void main(String[] args) {
		
		p0();
		System.out.println();
		p1();
		
	}
	
	
	static public void p0()
	{
		int i;
		int j;
		int n=4;
		
		for( i=0;i<n;i++)
	     	{
			for(j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		    }
		
	}	
		
	static public void p1()
	{
		int i;
		int j;
		int star=5;
		
		for(i=0;i<star;i++)
			{
			for(j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
			}
	
	}

}
