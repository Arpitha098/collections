package com.demo.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Spaces {

	public static void main(String[] args) {
		
	    List<String> ar= new ArrayList<String>();
		ar.add("hello world");
	    ar.add("success comes to those who are success consious ");
		ar.add("man searching for meaning");
		
		System.out.println(ar);
	

		ListIterator<String> itr = ar.listIterator();
		while (itr.hasNext()) {
		  itr.set(itr.next().replaceAll("\\s", ""));
		}
		System.out.println(ar);
		}
}
		
		
		

	


