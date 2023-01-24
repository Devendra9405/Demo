package javapackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Futestng {
	
	WebDriver driver;

	@Test
	public void a() {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.fujitsu.com/global/");
		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
		
	}
	
	@Test
	public void b() {
		driver.findElement(By.xpath("//span[text()='Fujitsu Uvance']")).click();
	}
	
	@Test
	public void c() {
		List<WebElement> fudemo = driver.findElements(By.xpath("//ul[@aria-activedescendant=\"setTabAria0\"]/li"));
		System.out.println("Total Dropdown Values:- " + fudemo.size());
		//System.out.println(fudemo.get(2).isEnabled());
		//fudemo.get(2).click();

           String  ExpResult = "Healthy Living";
		
		for(int i=0; i < fudemo.size(); i++) {
			
			//System.out.println(fudemo.get(i).getText());
			if(fudemo.get(i).getText().equalsIgnoreCase(ExpResult)) {
				System.out.println(fudemo.get(i).getText());
				fudemo.get(i).click();
				break;
			}

	}
	}
	
	
}


