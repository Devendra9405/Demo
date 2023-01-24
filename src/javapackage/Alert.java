package javapackage;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Alert {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click();
		Thread.sleep(3000);
       
		System.out.println(driver.switchTo().alert().getText());
		String expstr = "Do you confirm action?";
        Assert.assertEquals(driver.switchTo().alert().getText(), expstr);
        System.out.println("alert text verified");
        
		Thread.sleep(3000);
        driver.switchTo().alert().accept();
        System.out.println("accepted");
        
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click();
		Thread.sleep(3000);
        driver.switchTo().alert().dismiss();
        System.out.println("dismiss");
        
        
        
		
	}

}
