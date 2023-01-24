package javapackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws Exception {
	      
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
		
		List<WebElement> birthmonth = driver.findElements(By.xpath("//label[contains(@class,'mt')]"));
        System.out.println("Total Dropdown Values:- " + birthmonth.size());
		
			

	}

}
