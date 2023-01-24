package javapackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		Thread.sleep(2000);
		
		WebElement Electro = driver.findElement(By.xpath("//*[text()='Electronics']"));
		
		Actions act = new Actions(driver);
		
		Thread.sleep(2000);
		act.moveToElement(Electro).build().perform();
        
		Thread.sleep(3000);
		//right click
		act.contextClick().build().perform();
		Thread.sleep(3000);
        driver.navigate().refresh();
		Thread.sleep(3000);
        
		WebElement Grocery = driver.findElement(By.xpath("//*[text()='Grocery']"));
		Thread.sleep(3000);
        act.sendKeys(Grocery, Keys.ENTER).build().perform();
        System.out.println("grocery entered");
		

        
		

		
		
	}

}
