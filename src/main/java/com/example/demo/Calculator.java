package com.example.demo;

public class Calculator {

	public int sum(int a,int b)
	{
		int c=a+b;
		System.out.println("addition of a and b is "+c);
		return c;
	}
	
	public int sub(int a,int b)
	{
		int c=a-b;
		System.out.println("substraction of a and b is "+c);
		return c;
	}
	
	public int mul(int a,int b)
	{
		int c=a*b;
		System.out.println("multiplication of a and b is "+c);
		return c;
	}
	
	public int div(int a,int b)
	{
		int c=a/b;
		System.out.println("division of a and b is "+c);
		return c;
	}
}
