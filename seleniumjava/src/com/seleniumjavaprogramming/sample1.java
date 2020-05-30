package com.seleniumjavaprogramming;

public class sample1 {
	
	static  int k=90;//since it is static it can be used wi
	public static int add( int i,int j)
	{
		System.out.println("k first is"+ k++);
		int sum=i+j;
		return sum;
		
	}

	public static void main(String[] args) {
	    int k=100;
     //  sample1 obj1=new sample1();
	   int res=sample1.add(10,20);
	   System.out.println("sum is"+ res);
	   System.out.println("k is"+ k);
	  //  sample2 obj2=new sample2();
	    int res1=sample2.multi(10,20);
	    System.out.println("multi is"+ res1);
	    System.out.println("h is " + sample2.h);
	}
	

}
