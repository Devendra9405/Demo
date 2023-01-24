package javapackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://money.rediff.com/gainers");
		
		List<WebElement> AllCompanies = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
		System.out.println(AllCompanies.size());
		
		List<WebElement> CurrentPrice = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		System.out.println(CurrentPrice.size());
		
		String  ExpResult = "SVP Housing";
		
		for(int i=0; i < AllCompanies.size(); i++) {
			
			System.out.println(AllCompanies.get(i).getText());
			if(AllCompanies.get(i).getText().equalsIgnoreCase(ExpResult)) {
				System.out.println(AllCompanies.get(i).getText() + "----" + CurrentPrice.get(i).getText());
				AllCompanies.get(i).click();
				break;
			}
		}
	}

}
