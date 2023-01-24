package javapackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("work hard");
		
		List<WebElement> Allsuggetions = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println(Allsuggetions.size());
		
		for(int i=0; i < Allsuggetions.size(); i++) {
          String Expresult = "work hard wallpaper";
          if(Allsuggetions.get(i).getText().equalsIgnoreCase(Expresult)) {
        	  Allsuggetions.get(i).click();
        	  break;
          }
		}

	}

}
