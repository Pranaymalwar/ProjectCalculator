package calculator_1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Division {
	
	public WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  
	  driver.findElement(By.xpath("//input[@id='scirdsettingd']")).sendKeys("4000");
	  Thread.sleep(1000);
		
	  driver.findElement(By.xpath("//input[@id='scirdsettingd']")).sendKeys("/");
	  Thread.sleep(1000);
		
	  driver.findElement(By.xpath("//input[@id='scirdsettingd']")).sendKeys("200");
	  Thread.sleep(1000);
  }
  
  @BeforeTest
  public void beforeTest() {
	  
	  	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_2\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net/");
  }

  @AfterTest
  public void afterTest() {
	  //driver.close();
  }
  
}
