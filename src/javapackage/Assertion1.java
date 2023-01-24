package javapackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion1 {
	
	WebDriver driver;
	@Test
	public void testcase1() throws Exception {
		String expectedMessage = "Sorry, we don't recognize this email.";
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://login.yahoo.com/?.intl=us");
		Thread.sleep(3000);
		driver.findElement(By.id("login-signin")).click();
		
		Thread.sleep(3000);
        String actualMessage = driver.findElement(By.id("username-error")).getText();
        
        Assert.assertEquals(actualMessage, expectedMessage);
        System.out.println("equal assertion verified");
		
	}
	

}
