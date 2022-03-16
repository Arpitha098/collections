package com.demo.collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Students {

	public static void main(String[] args) {
		
		
	HashMap< Integer,Document> h1 = new HashMap<Integer , Document>();
	
	 Document arpitha = new Document("Arpitha" ,10,20,30,40);
	 Document sri = new Document("Sri" ,30,70,66,50);
	 Document nayana = new Document("Nayana" ,77,90,28,76);
	 
	 h1.put(1, arpitha);
	 h1.put(2, sri);
	 h1.put(3, nayana);
	 
	 Scanner s = new Scanner(System.in);
	 System.out.println("enter the student id :");
	 int id = s.nextInt();
	 if(h1.containsKey(id)) {
		 Document var = h1.get(id);
		 System.out.println("the maths marks is :" + var.Maths);
		 
	 }
	 
     System.out.println(h1);
	}
}
    	 
    	
    	
		 
		

	  



