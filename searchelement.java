package com.demo.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SerachElement {

	public static void main(String[] args) {
		
		
		
		List<Integer> l1 = new ArrayList<>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		
		System.out.println(l1);
	
	    int i1 =	Collections.binarySearch(l1, 20);
	    System.out.println("the element is found in index : " + i1);
	
		}

}
