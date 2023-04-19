package collectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class list {

	
	public static void main(String[] args) {
		
	
//		arrayList();
//		likedList();
		list();
		
		
		
	}
	
	
	static public void arrayList()
	{
		
		ArrayList l=new ArrayList();
		l.add("akshay");
		l.add("hode");
		l.add(25);
		l.add(25);
		l.add("yes");
		
		System.out.println(l);
		
		
		for(Object o : l)
		{
			System.out.println(o);
		}
		
		
		l.remove(2);
		
		System.out.println(l);
		
		
		for(Object o : l)
		{
			System.out.println(o);
		}
		
		LinkedList l1=new LinkedList();
		l1.addAll(l);
		
		System.out.println("l1 :"+l1);
		
		
	}
	
	static void likedList()
	{
		LinkedList l=new LinkedList();
		l.add("akshay");
		l.add(25);
		l.add("hi");
		l.addLast(35);
		l.addFirst(100);
		l.add(2, 35);
		
		System.out.println(l);
		
		
		Vector v=new Vector();
		v.add(25);
		v.add("aksahy");
		v.add(2, 35);
		v.add("hii");
	
		System.out.println(v);
		
		v.clear();
		
		System.out.println(v);
		
		v.addAll(v);
		
		System.out.println(v);
	}
	
	static public void list()
	{
		ArrayList l=new ArrayList();
		l.add("12");
		l.add("cna");
		l.add(50);
		l.add("12");
		l.add(12);
		l.add("stan");
		l.add(35);
		
		System.out.println(l);
		
		
		ArrayList<Integer> a=new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(10);
		a.add(20);
		
		System.out.println(a);
		
		
		LinkedList ln=new LinkedList();
		ln.add("stan");
		ln.add("came");
		ln.add(25);
		ln.add("aksh123");
		ln.addAll(a);
		ln.remove(2);
		ln.removeAll(a);
		System.out.println(ln);
		
		
		Vector v=new Vector();
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		
		System.out.println(v);
		
		v.add(0, 10);
		
		System.out.println(v);
	}
	
	
}
