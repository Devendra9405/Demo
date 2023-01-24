package javapackage;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4j {

	public static void main(String[] args) {
             Logger logger = Logger.getLogger("Log4j");
             
             PropertyConfigurator.configure("C:\\Users\\DEVENDRA\\eclipse-workspace\\online_java_4thjuy\\log4j.properties");
             
             System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");
     		 WebDriver driver = new ChromeDriver();	
     		 logger.info("chrome browswer opened");
     		 
     		 driver.manage().window().maximize();
     		 logger.info("window maximized");
     		 
     		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     		 logger.info("implicite wait");
     		 
     		driver.get("https://www.google.com/");
    		 logger.info("Application launched");


     		 
	}

}
