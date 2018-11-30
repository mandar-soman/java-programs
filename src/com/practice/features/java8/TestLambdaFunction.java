package com.practice.features.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * The class below would give little information of lambda expression introduced in java8
 * @author Mandar Soman
 *
 */
public class TestLambdaFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("E");
		list.add("D");
		
		// JAVA 7 Supported Functionality
		// below code would change the sequence of the elements
		// it would change the original list object with updated contents into it.
		list.sort( new Comparator<String>() {
			@Override
			public int compare(String str1, String str2) {
				return str2.compareTo(str1);
			}
		});
		System.out.println("List of elements -  " + list);
		
		// JAVA 8 Supported Functionality for sorting the data.
		list.sort((str1,str2) -> str1.compareTo(str2));
		System.out.println("List of elements -  " + list);
	}

}
