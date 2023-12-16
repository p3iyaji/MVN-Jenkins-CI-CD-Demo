package com.realpay.mvnjenkinsgitdemo;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class AppTest 
{

	@Test
  public void sumVals() {
	  Assert.assertEquals(33, 33);
  }
	
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before our method runs");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After our method runs");
	}
}
