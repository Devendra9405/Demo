package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {

   @Test
	public void a() {
		System.out.println("Hello a method");
	
		
	}
	
	@BeforeTest
	public void b() {
		System.out.println("Hello b method");
	
		
	}
}
