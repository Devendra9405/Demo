package javapackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws Exception {
	      
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
		
		Thread.sleep(3000);
		
         List<WebElement> birthmonth = driver.findElements(By.xpath("//select[@id='month']/option"));
         System.out.println("Total Dropdown Values:- " + birthmonth.size());
         System.out.println(birthmonth.get(8).isEnabled());
         birthmonth.get(8).click();
         
         WebElement bm = driver.findElement(By.xpath("//select[@id='month']"));
         Select month = new Select(bm);
         month.selectByVisibleText("Apr");
         month.selectByValue("12");
         month.selectByIndex(10);
         System.out.println(month.getFirstSelectedOption().getText());
         
         
         WebElement bm1 = driver.findElement(By.xpath("//select[@id='month']"));
         Select month1 = new Select(bm1);
         
         List<WebElement> dropdown = month1.getOptions();
         for(int i=0; i < dropdown.size(); i++)
         { 
        	 String dropdownValues = dropdown.get(i).getText();
        	 if(dropdownValues.equalsIgnoreCase("Nov"));{
        		 dropdown.get(i).click();
        	 }
        	 
        	 
         }
         
         
         
         
         				

	}

}
