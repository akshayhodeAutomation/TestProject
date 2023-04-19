package collectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class set {
	
	
	public static void main(String[] args) {
		
		
		HashSet s=new HashSet();
		s.add("akshay");
		s.add(15);
		s.add("hi");
		s.add(25);
		s.add("akshay");
		s.add("Akshay");
		
		System.out.println(s);
		
		System.out.println(s.size());
		
		HashSet h=new HashSet();
		h.add(10);
		h.add(20);
		h.add(30);
		h.add(40);
		h.add(80);
		h.add(50);
		h.add("test");
		
		System.out.println(h);
		
		h.clear();
		
		System.out.println(h);
		
		LinkedHashSet l=new LinkedHashSet();
		l.add(10);
		l.add(15);
		l.add(20);
		l.add(25);
		l.add(40);
		l.add("check");
	    
		
		System.out.println(l);
		
		boolean status=l.contains(40);

        System.out.println(status);
        
       
        
      
		
	}

}
