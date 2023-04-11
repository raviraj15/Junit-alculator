package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestCalculator {

	private static Calculator calculator=null;
	
	@BeforeAll
	public static void init()
	{
		calculator=new Calculator();
	}
	
	@AfterAll
	public static void destroy()
	{
		calculator=null;
	}
	
	@Test
	public void testSum()
	{
		
		int actual = calculator.sum(10, 10);
		int expected =20;
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	
	public void testSub()
	{
		
		
		int actual= calculator.sub(20, 10);
		
		int expected=10;
		
		assertEquals(actual,expected);
		
	}
	
	@Test
	public void testmul()
	{
		
		int actual = calculator.mul(10, 10);
		int expected =100;
		
		assertEquals(expected, actual);
		
	}
	@Test
	public void testDiv()
	{
		
		int actual = calculator.div(10, 10);
		int expected =1;
		
		assertEquals(expected, actual);
		
	}
}
