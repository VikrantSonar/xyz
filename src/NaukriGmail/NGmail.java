package NaukriGmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class NGmail {
	WebDriver driver;
	
  @BeforeSuite
  public void LaunchBrowser() {
	  System.setProperty("webdriver.chrome.driver", "D:/IT/TestingSW-Linked/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com/gmail/");
  }
  
  @Test
  public void Login() throws InterruptedException {
	  WebElement username= driver.findElement(By.xpath("//input[@type='email']"));
	  	username.clear();
	  	username.sendKeys("visonar8@gmail.com");
	  Thread.sleep(2000);
	  WebElement next= driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d'][2]"));
	  	next.click();
	  
  }
	  
	  
	  
	  
	  
	  
	  
	  
  }

