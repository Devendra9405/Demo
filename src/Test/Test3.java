package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test3 {

	@Test
	public void f() {
		System.out.println("Hello f method");
	
		
	}
	@Test
	public void g() {
		System.out.println("Hello g method");
	
		
	}
	
	@BeforeTest
	public void h() {
		System.out.println("Hello h method");
	
		
	}
}
