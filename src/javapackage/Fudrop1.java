package javapackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fudrop1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.fujitsu.com/in/");
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
			fudemo1.get(j).click();
			
			if(ExpResult1=="Global") {
				driver.findElement(By.xpath("//div[@id=\"locations-01\"] //ul[@class=\"list-link-a diff-col3\"]/li")).click();
				break;
			}
			
			if(ExpResult1=="Africa") {
				List<WebElement> fudemo2 = driver.findElements(By.xpath("//div[@id=\"locations-02\"] //ul[@class=\"list-link-a diff-col3\"]/li"));
				System.out.println("Total Dropdown Values:- " + fudemo2.size());
				String  ExpResult2 = "Egypt";
				for(int k=0; k < fudemo2.size(); k++) {
					if(fudemo2.get(k).getText().equalsIgnoreCase(ExpResult2)) {
						System.out.println(fudemo2.get(k).getText());
						fudemo2.get(k).click();
			}
				}
				}
					if(ExpResult1=="Asia") {
						List<WebElement> fudemo3 = driver.findElements(By.xpath("//div[@id=\"locations-03\"] //ul[@class=\"list-link-a diff-col3\"]/li"));
						System.out.println("Total Dropdown Values:- " + fudemo3.size());
						String  ExpResult3 = "Malaysia";
						for(int i=0; i < fudemo3.size(); i++) {
							if(fudemo3.get(i).getText().equalsIgnoreCase(ExpResult3)) {
								System.out.println(fudemo3.get(i).getText());
								fudemo3.get(i).click();
					}
						}
					}
					if(ExpResult1=="Australasia") {
						List<WebElement> fudemo4 = driver.findElements(By.xpath("//div[@id=\"locations-04\"] //ul[@class=\"list-link-a diff-col3\"]/li"));
						System.out.println("Total Dropdown Values:- " + fudemo4.size());
						String  ExpResult4 = "Astralia";
						for(int m=0; m < fudemo4.size(); m++) {
							if(fudemo4.get(m).getText().equalsIgnoreCase(ExpResult4)) {
								System.out.println(fudemo4.get(m).getText());
								fudemo4.get(m).click();
					}
						}
					}	
			break;		
			
	}

        }
	
		}
        }
		
