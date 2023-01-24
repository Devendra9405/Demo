package javapackage;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopHandling {

	public static void main(String[] args) throws Exception {
             
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id='windowButton']")).click();
		Thread.sleep(3000);

		Set<String> allWindoIDs = driver.getWindowHandles();
         System.out.println(allWindoIDs);	
         System.out.println(allWindoIDs.size());
         
         java.util.Iterator<String> abc = allWindoIDs.iterator();
         
         String Window1 = abc.next();
         String Window2 = abc.next();
         
         driver.switchTo().window(Window2);
         System.out.println(Window2);
 		 Thread.sleep(3000);
         driver.close();
         
         driver.switchTo().window(Window1);
         System.out.println(Window1);
         System.out.println(driver.getTitle());
         Thread.sleep(3000);
         driver.quit();
         
	}   

}
