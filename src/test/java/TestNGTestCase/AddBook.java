package TestNGTestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddBook {
	WebDriver driver;
	@BeforeMethod
	public void launch() {
		System.setProperty("webdriver.gecko.driver","/home/pahal/Selenium_JAR/geckodriver");
		  driver =new FirefoxDriver();
		  driver.get("http://0.0.0.0:3001/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}		
  @Test
  public void Verifyaddbook() {
	  	driver.findElement(By.name("login")).sendKeys("devops");
	  	driver.findElement(By.name("password")).sendKeys("test");
	  	driver.findElement(By.name("click")).click();		
  }
	@AfterMethod
	public void close() {
		driver.close();
	}
}
