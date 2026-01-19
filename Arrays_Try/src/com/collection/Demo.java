package com.collection;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {

		ArrayList i = new ArrayList();

		i.add("Chinmay");
		i.add(21);
		i.add("Male");
		i.add("Pune");
		i.add("Java Developer");

		ArrayList i1 = new ArrayList(i);
		System.out.println(i1.isEmpty());
		System.out.println(i1);
		
		
	}
}