package com.seleniumjavaprogramming;

public class classB  extends classA{
	
	int a=5,b=5;
	public void add()
	{
	  System.out.println(a+b);
	}
	

	public static void main(String[] args) {
		classB objb=new classB();
		classA obja=new classA();
		objb.add();
		System.out.println("a="+ objb.a);
		System.out.println("a="+ objb.b);
		System.out.println("a="+ obja.a);
		System.out.println("a="+ obja.b);
	}

}
