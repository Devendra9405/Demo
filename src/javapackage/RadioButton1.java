package javapackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_IndArm']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_StudentDiscount']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_Unmr']")).click();
		
		List<WebElement> radios = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(radios.size());
		
		List<WebElement> radios1 = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(radios1.size());
		String expresult = "family and friends";
		for(int i=0; i< radios1.size(); i++) {
			if(radios1.get(i).getText().equalsIgnoreCase(expresult)) {
				radios1.get(i).click();
				System.out.println("Clicked");
				break;
			}
		}
	
		
	}

}
