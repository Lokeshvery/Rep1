package org.sample.ng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample1Class 
{
	@Test
	private void tc2()
	{
		System.out.println("Test 2");
	}
	
	@Test
	private void tc3()
	{
		System.out.println("Test 3");
	}
	
	@Test
	private void tc1()
	{
		System.out.println("Test 1");
	}
	
	@BeforeClass
	private void bCls()
	{
		System.out.println("Execution starts");
	}
	
	@AfterClass
	private void aCls()
	{
		System.out.println("Execution ends");
	}
	
	@BeforeMethod
	private void startTime()
	{
		System.out.println("TC started");
	}
	
	@AfterMethod
	private void endTime()
	{
		System.out.println("TC ended");
	}
}
