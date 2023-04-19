package javaAbstractionClass;

public class cityAnimals extends CityAnimal {
	
	
	void dog()
	{
		String colour="black and White";
		String age="2 year";
		String drink="Water";
		
		System.out.println("dog colour :"+colour);
		System.out.println("dog age :"+age);
		System.err.println("dog drink :"+drink);
	}
	
	
	void cat()
	{
		String colour="dark brown";
		String age="1 year";
		String drink="Milk";
		
		System.out.println("cat colour :"+colour);
		System.out.println("cat age :"+age);
		System.err.println("cat drink :"+drink);
		
	}
	
	void INFO()
	{
		cityAnimals c=new cityAnimals();
		c.dog();
		c.cat();
	}
	
	
	public static void main(String[] args) {
		
		cityAnimals c=new cityAnimals();
		c.INFO();
		
		
		
	}
	

}
