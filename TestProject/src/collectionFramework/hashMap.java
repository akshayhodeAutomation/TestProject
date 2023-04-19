package collectionFramework;

import java.util.HashMap;
import java.util.Hashtable;

public class hashMap {
	
	public static void main(String[] args) {
		
//		HAshmap();
//		mapvstable();
//		hashMap();
//		hashTable();
		p1();
		p2();
		
	}
	
	static public void HAshmap()
	{
    	HashMap h=new HashMap();
	
	    h.put("name", "akshay");
	    h.put("gender", "male");
	    h.put("mail", "aks@g12.gmsil.com");
	    
	    int count=h.size();
	    System.out.println(count);
	    
	    
	   System.out.println(h);
	   
    	h.values();
	   
	   System.out.println(h);
	
	   boolean status=h.isEmpty();
	   
	   System.out.println(status);
	}
	
	
	static void mapvstable()
	{
		HashMap h=new HashMap();
		h.put(0, 10);
		h.put(1, 20);
		h.put(3, 30);
		h.put(4, 40);
		h.put(5, 50);
		h.put(0, 60);
		h.put(1, 100);
		h.put(10, 200);
		h.put(null, 300);
		h.put(null, 250);
		
		
		System.out.println(h);
		try
		{
		Hashtable t=new Hashtable();
		t.put(0, 10);
		t.put(null, 20);
		
		System.out.println(t);
		}
		catch(Exception e)
		{
			System.out.println("continue");
		}
	}
	
	static void hashMap()
	{
		HashMap<String, Integer> h=new HashMap<String,Integer>();
		
		h.put("ak", 100);
		h.put("stan", 100);
		h.put(null, 200);
		h.put(null, 300);
		h.put("tan", 0);
		h.put("cat", 0);
		h.put(null, null);
		
		
		
		System.out.println(h);
	}
	static void hashTable()
	{
		Hashtable<String,Integer> h=new Hashtable<String,Integer>();
		
	
		h.put("tan", 100);
		h.put("satn", 200);
		h.put("stan", 300);
//		h.put(null, null);
//		h.put("ak", null);
		
		System.out.println(h);
		
		System.out.println(h.get("tan"));
		System.out.println(h.get("stan"));
		
		
	}
	
	static public void p1()
	{
		HashMap map=new HashMap();
		map.put("name", "akshay");
		map.put(null, "2");                  // We can stored only one null key in hashmap
		map.put("age", "23");
		map.put(null, "testing");
		map.put("class", "A1");
		
		System.out.println(map);
		
		HashMap mp=new HashMap();
		mp.put("name", "stan");
		mp.put(null, "123");
		mp.put("age", "31");
		mp.put("1","25");
		mp.put("2", null);
		mp.put("3", null);
		mp.put("4", null);
		mp.put(null, "987");
		
		System.out.println(mp);
	}
	
	static void p2()
	{
		Hashtable table=new Hashtable();
		table.put("1", "10");
		table.put("2", "20");
		table.put("3", "30");
		table.put("name", "stan");
		table.put("age", "23");
		table.put("0", "50");
		table.put("4", "  ");
		//table.put("5", null);
		
		System.out.println("p2 :"+table);
		
		
		Hashtable<Integer,Integer> tb=new Hashtable();
		
		
		tb.put(1, 123);
		tb.put(2, 25);
		tb.put(3, 35);
		
		System.out.println(tb);
		
		
	}

}
