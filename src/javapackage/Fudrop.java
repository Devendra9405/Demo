package javapackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fudrop {

	public static void main(String[] args) throws Exception {
	      
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.fujitsu.com/global/");
		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
		driver.findElement(By.xpath("//span[text()='Fujitsu Uvance']")).click();
		
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
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Change']")).click();
		List<WebElement> fudemo1 = driver.findElements(By.xpath("//ul[@class='regions']/li"));
		System.out.println("Total Dropdown Values:- " + fudemo1.size());
	//	System.out.println(fudemo1.get(2).isEnabled());
	//	fudemo1.get(2).click();


		Thread.sleep(2000);
		
            String  ExpResult1 = "Africa";
        
            for(int j=0; j < fudemo1.size(); j++) {
			
			if(fudemo1.get(j).getText().equalsIgnoreCase(ExpResult1)) {
				System.out.println(fudemo1.get(j).getText());
				fudemo1.get(j).click();
				List<WebElement> fudemo2 = driver.findElements(By.xpath("//div[@id=\"locations-02\"] //ul[@class=\"list-link-a diff-col3\"]/li"));
				System.out.println("Total Dropdown Values:- " + fudemo2.size());
				String  ExpResult2 = "Egypt";
				for(int k=0; k < fudemo2.size(); k++) {
					if(fudemo2.get(k).getText().equalsIgnoreCase(ExpResult2)) {
						System.out.println(fudemo2.get(k).getText());
						fudemo2.get(k).click();
				break;
			}
				}

	}
		

}
}
	}
