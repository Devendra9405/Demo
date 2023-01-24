package javapackage;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNg2 {
	
	//@Test
	public void a() {
		
	}

	@Test(enabled=false)
	public void b() {
		System.out.println("b method");
	}
	
	@Test(invocationCount = 3)
	public void c() {
		
		System.out.println("c method");
	}
	
	@Test(invocationCount = 0)
	public void d() {
		
		System.out.println("d method");
	}
	
	@Test
	public void e() {
		
		System.out.println("e method");
		throw new SkipException("Skipping e method");
	}
	
}
