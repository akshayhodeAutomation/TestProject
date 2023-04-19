package javaAbstractionClass;

public class Wild extends WildAnimals {
	
	void lion()
	{
		String colour="Dark brown";
		
		System.out.println("lion colour :"+colour);
	}
	
	void tiger()
	{
		String colour="black and yellow";
		String colour1="black and white";
		
		System.out.println("tiger 1 colour :"+colour);
		System.out.println("tiger 2 colour :"+colour1);
		
	}
	
	void elephant()
	{
		String colour="Black";
		
		System.out.println("elephant colour :"+colour);
	}
	
	void info()
	{
		Wild w=new Wild();
		w.lion();
		w.tiger();
		w.elephant();
	}
	
	public static void main(String[] args) {
		
		Wild w=new Wild();
		w.info();
		
	}

}
