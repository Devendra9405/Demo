package javapackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testng4 {
	
	@Test
	public void b() {
		
		Assert.assertTrue( 3 < 12);
		System.out.println("b method");

}
	
	@Test(dependsOnMethods = "b")
	public void c() {
		
		System.out.println("c method");

}
}