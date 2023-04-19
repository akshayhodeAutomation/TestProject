package javaCodes;

import java.util.Arrays;

public class javaCodes2 {

public static void main(String[] args) {
		

		split();
		concat();
		sumArray();
		maxArray();
		factorial();
		fabiancici();
		primeNo();
		palidromeNo();
		voel();
		Stringequals();
		factorial();
		primeNo();
		evenandodd();
		arraySort();
		duplicateValue();
	        stringRev();
	        removeWhiteSpaces();
	        splChar();
                ArrayEquality();
		digitcount();
		palimdromeno();
		countwords();
		charoccurance();
		vowel();
		linearsearch();

	
	}
	
	static void  stringRev()
	{
	  String s="ASHWIN";
	  
	  String rev="";
	  int l=s.length();
	  
	  for(int i=l-1;i>=0;i--)
	  {
		  rev=rev+s.charAt(i);
	  }
	  System.out.println(rev);
	  
	  System.out.println(s.charAt(l-1));
	  System.out.println(s.charAt(l/2));
	  System.out.println(s.toUpperCase());
	  System.out.println(s.toLowerCase());
	  
	}

	static void duplicateValue()
	{
		int a[]= {1,25,10,30,1,25,45};
		
		for(int i=0;i<a.length;i++)
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
				}
			}
		
	}
	
	static void arraySort()
	{
		int a[]= {1,25,42,10,31,48};
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
	}
	
	static void evenandodd()
	{
		int a[]= {1,25,12,30,41,25,16,84,23};
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println("Even :"+a[i]);
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println("Odd :"+a[i]);
			}
		}
		
	}
	
	static void Stringequals()
	{
		String s="Akshay";
		String x="akshay";
		String y="Akshay";
		String z="AKSHAY";
		
		
		System.out.println(s.equals(z));
		System.out.println(s.equals(y));
		System.out.println(s.equals(x));
		
		System.out.println(s.concat(x));
		
	
	}
	
	static void voel()
	{
		String s="Akshay you can do it";
		
		int count=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='i' || s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='o' || s.charAt(i)=='u')
				count++;
			
		}
		System.out.println("voel :"+count);
	}
	
	static void palidromeNo()
	{
		
	}
	
	static void primeNo()
	{
		int p=10;
		
		int count=0;
		
		if(p>0)
		{
			for(int i=1;i<=p;i++)
			if(p%i==0)
			count++;
		}
		
		if(count==2)
		{
			System.out.println("prime no");
		}
		else
		{
			System.out.println("not prime no");
			
		}
		
	}
	
	static void fabiancici()
	{
		int a=0 , b=1 , sum=1;
		
		for(int i=1;i<=10;i++)
		{
			sum=a+b;
			System.out.println(sum);
			
			a=b;
			b=sum;
			
		}
	}
	
	static void factorial()
	{
		int f=10;
		
		int factorial=1;
		
		for(int i=0;i<=f;i++)
		{
			factorial=factorial*i;
		}
		
		System.out.println("factorial no :"+factorial);
		
	}	 
		 
	static void split()
	{
		String s=("akshay,mahdeo,hode");
	
		String s1[]=s.split(",");
		
		for(String o : s1)
		{
			System.out.println(o);
		}
	
	}
	
	static void concat()
	{
		String s="AKhshay";
		String x=" Mahadeo";
		String z=" Hode";
		
		System.out.println(s.concat(x).concat(z));
	}
	static void sumArray()
	{
		int a[]= {1,12,10,25,5,84,251,120};
		
		int sum=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		
		System.out.println(sum);
	}
	
	static void maxArray()
	{
		int a[]= {1,41,626,32,45,745,15,2574,1534};
		
		int max=a[0];
		
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
				
			}
		}
		
		System.out.println("Max :"+max);
		
	}
	static void arrayEquality()
	{
		
	}
	
	static void removeWhiteSpaces()
	{
		String s="Akshay  hode 123";
		
		s=s.replaceAll("[^A-Za-z1-9]", "");
		
		
		System.out.println("remove spaces :"+s);
		
	}
	
	static void splChar()
	{
		String s="   Akshay   @#$%   Hode   123";
		
		
		s=s.trim();
		System.out.println("Trim  :"+ s);
		
		s=s.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(s);
		
		
	}

        static void ArrayEquality()
	{
		
			
	}
	
	static void digitcount()
	{
		
	}
	
	static void palimdromeno()
	{
		
	}
	
	static void countwords()
	{
		
	}
	
	static void charoccurance()
	{
		
	
	}
	
	static void vowel()
	{
		
	}
	
	static void linearsearch()
	{
		
	}


}
