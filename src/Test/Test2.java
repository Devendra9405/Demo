package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2 {

   
	@Test
	public void c() {
		System.out.println("Hello c method");
	
		
	}
	@Test
	public void e() {
		System.out.println("Hello e method");
	
		
	}
	
	@BeforeTest
	public void d() {
		System.out.println("Hello d method");
	
		
	}
}
