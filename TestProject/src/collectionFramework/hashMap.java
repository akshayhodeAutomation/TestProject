package collectionFramework;

import java.util.HashMap;
import java.util.Hashtable;

public class hashMap {
	
	public static void main(String[] args) {
		
		HAshmap();
		hashTable();
		
		
	}
	
	static public void HAshmap()
	{
    	HashMap hm=new HashMap();
    	hm.put(1, 10);
    	hm.put(2, 20);
    	hm.put(5, 30);
    	hm.put(4, 40);
    	hm.put(null, 100);
    	hm.put(null, 200);
    	hm.put(5, null);
    	hm.put(3, null);
    	hm.put(1, 100);
    	hm.put(10, 30);
    	
    	System.out.println(hm);
    	
    	
    	HashMap<String, String> shm=new HashMap<String , String>();
    	
    	shm.put("A", "akshay");
    	shm.put("B", "stan");
    	shm.put("c", "shiv");
    	shm.put("E", "nimrit");
    	shm.put("D", "sumbhul");
    	
    	System.out.println(shm);
    	
    	
    	HashMap <Integer , String> is=new HashMap<Integer , String>();
    	is.put(1, "A");
    	is.put(2, "B");
    	is.put(5, "C");
    	is.put(3, "X");
    	is.put(4, "Y");
    	is.put(null, "Z");
    	
    	System.out.println(is);
    	
    	
	}
	
	static public void hashTable()
	{
		Hashtable ht=new Hashtable();
		ht.put(1, 10);
		ht.put(3, 20);
		ht.put(2, 30);
		ht.put(4, 40);
		ht.put(8, 80);
		ht.put(6, 60);
		ht.put(6, 600);
	
		
		System.out.println(ht);
		
		Hashtable <String , Integer> sht=new Hashtable();
		sht.put("X", 10);
		sht.put("D", 20);
		sht.put("G", 40);
		sht.put("F", 50);
		
		System.out.println(sht);
		
		
	}
	

}
