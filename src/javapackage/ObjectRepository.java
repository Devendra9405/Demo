package javapackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectRepository {

	public static void main(String[] args) throws Exception  {
               File src = new File("C:\\Users\\DEVENDRA\\eclipse-workspace\\online_java_4thjuy\\Repository\\Object_repo.properties");
               
               
               FileInputStream fis = new FileInputStream(src);
               
               Properties pro = new Properties();
               pro.load(fis);
               
            System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");
       		WebDriver driver = new ChromeDriver();		
       		driver.manage().window().maximize();
       		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       		driver.get(pro.getProperty("URL"));
       		
       		driver.findElement(By.id(pro.getProperty("Email"))).sendKeys(pro.getProperty("TestData1"));
       		driver.findElement(By.xpath(pro.getProperty("Password"))).sendKeys(pro.getProperty("TestData2"));

    

               
               
               
	}

}
 