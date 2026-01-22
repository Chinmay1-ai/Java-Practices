package com.collection;

import java.util.HashMap;
import java.util.Map;

public class Demo3 {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(null, "Name");
		map.put(121, "Chinmay");
		map.put(122, "Priya");
		map.put(123, "Bhavik");
		map.put(124, "Malvi");
		map.put(125, "Shubham");

//		System.out.println(map);

		for (Map.Entry<Integer, String> s : map.entrySet()) {
			System.out.println(s.getKey() + "   " + s.getValue());
		}
	}
}
