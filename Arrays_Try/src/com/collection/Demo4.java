package com.collection;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class Demo4 {

	public static void main(String[] args) {
		
//		Set<Integer> s = new HashSet<Integer>();         /* insertion order is not maintain & all 3 is possible   */
//		Set<Integer> s = new LinkedHashSet<Integer>();   /* insertion order maintain & duplicates not allowed & only iterator is possible */
		Set<Integer> s = new TreeSet<Integer>();         /* null is not allowed & insertion order is maintain & only iterator is possible */
		
		s.add(10);
		s.add(10);   /* duplicates not allowed */
//		s.add(null);  
//		s.add(null); /* only one null is accepted */  
		s.add(20);
		s.add(30);
		s.add(40);

		Iterator<Integer> itr = s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("---------");
		
//		ListIterator<Integer> litr = s.listIterator();
//		while(litr.hasNext()) {
//			System.out.println(litr.next());
//		}
//		
//		System.out.println("---------");
//		
//		Enumeration<Integer> e = s.elements();
//		while(e.hasMoreElements()) {
//			System.out.println(e.nextElement());
//		}
				
	}
}
