package com.acadgild;

import java.util.*;

/**
 * 
 * Program to Create an application having a Generic HashMap with Empcode as key
 * and EmpName as value
 *
 */
public class Session9Assignment1 {

	public static void main(String[] args) {
		// Declare the hashmap - key as Integer and Value as String
		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		// Put elements to the hashmap
		hm.put(1, "Deepak");
		hm.put(2, "Sweta");
		hm.put(3, "Yuvaan");

		// Create iterator to loop through the hashmap String value
		Iterator<String> empNameIterator = hm.values().iterator();

		// Loop through the iterator to fetch the empName values
		while (empNameIterator.hasNext()) {
			String EmpName = empNameIterator.next();
			System.out.println(EmpName);
		}

	}

}
