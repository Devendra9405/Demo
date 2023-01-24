package javapackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Funevigate {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.fujitsu.com/global/");
		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
		
		
		driver.findElement(By.xpath("//div[@id='slick-slide00']//div//div[@class='c-card_title'][normalize-space()='Fujitsu at NRF 2023']")).click();
		Thread.sleep(3000);
        driver.navigate().back();
        
		driver.findElement(By.xpath("//div[@class='home-slide_arrow']//button[@aria-label='Next'][text()='Next']")).click();

	}

}
