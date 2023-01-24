package javapackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fulinks {

	public static void main(String[] args) throws Exception {
                      
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.fujitsu.com/in/");
		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footerdri = driver.findElement(By.id("footer-nav-a"));
		
		System.out.println(footerdri.findElements(By.tagName("a")).size());
		WebElement columbf = driver.findElement(By.xpath("//body/footer/div[@id='footer']/div[@id='footer-group-nav']/div[@id='footer-group-nav-inner']/div[@id='footer-nav-a']/ul/li[1]"));
		System.out.println(columbf.findElements(By.tagName("a")).size());
		
		for(int i=0;i < columbf.findElements(By.tagName("a")).size();i++) {
			columbf.findElements(By.tagName("a")).get(i).click();
			Thread.sleep(3000);
			
		}
		
	}

}
