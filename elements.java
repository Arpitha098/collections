package com.demo.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Elements {

	public static void main(String[] args) {
		
		ArrayList<Integer> l1 =  new ArrayList<>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		l1.add(60);
		
	   Collections.sort(l1);
		System.out.println(l1);
		
		
		ArrayList<Integer> l2 = new ArrayList<>();
		l2.add(10);
		l2.add(20);
		l2.add(70);
		l2.add(15);
		l2.add(60);
		l2.add(30);
		
		Collections.sort(l2);
		System.out.println(l2);
		
		
		l2.removeAll(l1);
		System.out.println(l2);
		
		

	}

}
