package javapackage;

import java.util.concurrent.TimeUnit;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fujavascript {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.fujitsu.com/global/");
		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		Thread.sleep(3000);
        js.executeScript("window.scrollBy(0, 7000)");	
        
        driver.findElement(By.xpath("//div[@class='l-grid']//div[1]//a[1]//div[2]//div[1]")).click();
        driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
        
        js.executeScript("window.scrollBy(0, 1000)");
		Thread.sleep(3000);
		
		js .executeScript("document.getElementById(\"949207056\").play()");
		Thread.sleep(5000);


        
        //int allframes = driver.findElements(By.tagName("iframe")).size();
        //System.out.println(allframes);
        
        //for(int i=0; i < allframes; i++  ) {
        	//driver.switchTo().frame(i);
        	//Thread.sleep(2000);
        	//driver.findElement(By.xpath("//iframe[@src=\"https://www.youtube-nocookie.com/embed/tCxSoHUpnt4?enablejsapi=1&origin=https%3A%2F%2Fwww2.fujitsu.com\"]")).click();
        	
       // }
        

		
		
		
	}

}
