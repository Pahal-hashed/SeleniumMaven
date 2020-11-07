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
		System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		  driver =new FirefoxDriver();
		  driver.get("https://www.google.com");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}		
  @Test
  public void Verifyaddbook() {
		driver.findElement(By.xpath("//a[@href='https://www.google.co.in/imghp?hl=en&tab=wi&ogbl']")).click();
		driver.findElement(By.name("q")).sendKeys("Gracias");
		driver.findElement(By.xpath("//div[@class='FAuhyb']")).click();
  }
	@AfterMethod
	public void close() {
		driver.close();
	}
}
