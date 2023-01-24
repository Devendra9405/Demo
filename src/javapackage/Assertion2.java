package javapackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion2 {

	@Test
	public void testcase2() {
		
		String actualmessage = "Google";
		String expectedmessage = "Gooogle";
		
		try {
			Assert.assertEquals(actualmessage, expectedmessage, "actal and exp are not matching");
		}catch(AssertionError a) {
		
	}
		System.out.println("equal assertion pass");
}
}