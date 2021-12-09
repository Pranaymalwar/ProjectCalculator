package calculator;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class Operations_All {
	
	WebDriver driver;
	
  @Test
  public void Multiplication() throws InterruptedException {
	  
	  	driver.get("https://www.calculator.net/");
	  
	  	driver.findElement(By.xpath("//input[@id='scirdsettingd']")).sendKeys("423");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='scirdsettingd']")).sendKeys("*");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='scirdsettingd']")).sendKeys("525");
		Thread.sleep(1000);
				
  }
  
  @Test
  public void Division() throws InterruptedException {
	
	  driver.get("https://www.calculator.net/");
	  
	  driver.findElement(By.xpath("//input[@id='scirdsettingd']")).sendKeys("4000");
	  Thread.sleep(1000);
		
	  driver.findElement(By.xpath("//input[@id='scirdsettingd']")).sendKeys("/");
	  Thread.sleep(1000);
		
	  driver.findElement(By.xpath("//input[@id='scirdsettingd']")).sendKeys("200");
	  Thread.sleep(1000);
	  
  }
  
  @Test
  public void Addition() throws InterruptedException {
	
	  driver.get("https://www.calculator.net/");
	  
	  driver.findElement(By.xpath("//input[@id='scirdsettingd']")).sendKeys("-234234");
	  Thread.sleep(1000);
	
	  driver.findElement(By.xpath("//input[@id='scirdsettingd']")).sendKeys("+");
	  Thread.sleep(1000);
	
	  driver.findElement(By.xpath("//input[@id='scirdsettingd']")).sendKeys("345345");
	  Thread.sleep(1000);
  }
  
 @Test
 public void Subtraction() throws InterruptedException {
	 	
	 driver.get("https://www.calculator.net/");
	 
	 driver.findElement(By.xpath("//input[@id='scirdsettingd']")).sendKeys("234823");
	 Thread.sleep(1000);
		
	 driver.findElement(By.xpath("//input[@id='scirdsettingd']")).sendKeys("-");
	 Thread.sleep(1000);
		
	 driver.findElement(By.xpath("//input[@id='scirdsettingd']")).sendKeys("23094823");
	 Thread.sleep(1000);
 }
  

  @BeforeClass
  public void beforeClass() {
	  
	  	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_2\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//Thread.sleep(1000);
		
  }

  @AfterClass
  public void afterClass() {
	  //driver.close();
  }

}
