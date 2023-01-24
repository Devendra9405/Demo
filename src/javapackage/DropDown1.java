package javapackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
         
		List<WebElement> Currency = driver.findElements(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']/option"));
        System.out.println("Total Dropdown Values:- " + Currency.size());
        System.out.println(Currency.get(2).isEnabled());
        Currency.get(2).click();
        
        WebElement bm = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
        Select month = new Select(bm);
        month.selectByVisibleText("INR");
        month.selectByIndex(2);
        System.out.println(month.getFirstSelectedOption().getText());
        
        WebElement bm1 = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
        Select currency1 = new Select(bm1);
        
        List<WebElement> dropdown = currency1.getOptions();
        for(int i=0; i < dropdown.size(); i++)
        { 
       	 String dropdownValues = dropdown.get(i).getText();
       	 if(dropdownValues.equalsIgnoreCase("USD"));{
       		 dropdown.get(i).click();
       	 }
       	 
       	 
        }
        
        driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']")).sendKeys("AED");        
        
        				

	}
	}

