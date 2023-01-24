package javapackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg1 {
	
	@Test
	
	public void a2() {
		System.out.println("Hello a2 method");
	
		
	}
	
	@BeforeTest
	
	public void b() {
		System.out.println("Hello b method");
	
		
	}
	
	@BeforeSuite
	
	public void c() {
		System.out.println("Hello c method");	
	}
	
	@AfterMethod
	
	public void d() {  
		System.out.println("Hello d method");
}
	
	@BeforeClass
	
	public void e() {
		System.out.println("Hello e method");
}
	
	@Test
	
	public void a1() {
		System.out.println("Hello a1 method");
}
	@BeforeMethod
	public void h() {
		System.out.println("Hello h method");
}
}
