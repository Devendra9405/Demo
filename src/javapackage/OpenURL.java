package javapackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenURL {

	public static void main(String[] args) throws Exception {
      
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		driver.navigate().to("https://www.google.co.in/");
		Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        // String currentURL = driver.getCurrentUrl();
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(2000);
         System.out.println(driver.getTitle());
         Thread.sleep(2000);
         driver.close();
         Thread.sleep(2000);

          driver.quit();
        
        
        
		
		
		
		
		
	}

}
