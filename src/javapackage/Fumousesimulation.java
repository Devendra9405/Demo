package javapackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Fumousesimulation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.fujitsu.com/in/");
		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
		
		Actions act = new Actions(driver);
		
		WebElement suppo = driver.findElement(By.xpath("//a[@href=\"https://www.fujitsu.com/in/support/index.html\"]"));
		
		WebElement search  = driver.findElement(By.xpath("//input[@id='Search']"));
		
		WebElement search1  = driver.findElement(By.xpath("//button[@type='submit']"));

		

		
		
		act.sendKeys(suppo, Keys.ENTER).build().perform();
		System.out.println("Support menu clicked");
		
		// act.contextClick().build().perform();
		
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Search']"))).click().build().perform();
        driver.findElement(By.xpath("//input[@id='Search']")).sendKeys("azure");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        
       


		

}
}
