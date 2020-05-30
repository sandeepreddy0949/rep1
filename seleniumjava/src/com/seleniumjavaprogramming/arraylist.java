package com.seleniumjavaprogramming;

import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {
	
     ArrayList<Charector> x=new ArrayList<Integer>();
     
     x.add(1);
     x.add(2);
     x.add(3);
     x.add(9);
     
    // System.out.println(x); //all elements in array list
     System.out.println(x.size());
     
     x.add(1,200);
     x.set(1, 300);
     System.out.println("2nd is="+x.get(2));
     for (Integer k : x)
     {
    	 System.out.println(k);
     }
     
     
     
     
	}

}
