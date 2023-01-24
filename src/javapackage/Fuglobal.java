package javapackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fuglobal {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.fujitsu.com/in"
				+ "/");
		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Change']")).click();
		List<WebElement> fudemo1 = driver.findElements(By.xpath("//ul[@class='regions']/li"));
		System.out.println("Total Dropdown Values:- " + fudemo1.size());
		
		Thread.sleep(2000);
		
        String  ExpResult1 = "Global";
    
        for(int j=0; j < fudemo1.size(); j++) {
		
		if(fudemo1.get(j).getText().equalsIgnoreCase(ExpResult1)) {
			System.out.println(fudemo1.get(j).getText());
			driver.findElement(By.xpath("//div[@id=\"locations-01\"] //ul[@class=\"list-link-a diff-col3\"]/li")).click();
			break;
		}
        }
	}

}
