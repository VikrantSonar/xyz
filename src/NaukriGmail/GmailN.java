package NaukriGmail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class GmailN {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		
		 
		  System.setProperty("webdriver.chrome.driver", "D:/IT/TestingSW-Linked/chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://gmail.com/");
		  driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		  
//		  driver.findElement(By.linkText("Sign in")).click();
		 
		 WebElement username= driver.findElement(By.id("identifierId")); 
		 	////input[@type='email']
		  	username.clear();
		  	username.sendKeys("visonar8@gmail.com");
		 Thread.sleep(2000);
		 WebElement next= driver.findElement(By.xpath("//span[text()='Next']"));
		  	next.click();
			  
		  

	}

}
