package javapackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testng5 {
	
	WebDriver driver;
	
	@BeforeClass
	public void setEnv() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
	}
    @DataProvider
 public Object[][] dataSet() throws Exception{
	
	File src = new File("C:\\Users\\DEVENDRA\\eclipse-workspace\\online_java_4thjuy\\Repository\\Object_repo.properties");
	FileInputStream fis = new FileInputStream(src);
    
    Properties pro = new Properties();
    pro.load(fis);
    
    Object arr[][] = new Object[3][2];
    
    arr[0][0] = pro.getProperty("TestData1");
    arr[0][1] = pro.getProperty("TestData2");
    
    arr[1][0] = "email_2";
    arr[1][1] = "pass_2";
    
    arr[2][0] = "email_3";
    arr[2][1] = "pass_3";
    
	return arr;
}

   @Test(dataProvider = "dataSet")
   public void enterData(String userName, String password) throws Exception {
	   Thread.sleep(3000);
	   driver.findElement(By.id("email")).clear();
	   Thread.sleep(3000);
	   driver.findElement(By.id("pass")).clear();
	   Thread.sleep(3000);
	   driver.findElement(By.id("email")).sendKeys(userName);
	   Thread.sleep(3000);
	   driver.findElement(By.id("pass")).sendKeys(password);
	   Thread.sleep(3000);
	   driver.findElement(By.name("login")).click();
	   Thread.sleep(3000);
	   driver.navigate().back();
   }
}
