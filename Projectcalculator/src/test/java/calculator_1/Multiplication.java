package calculator_1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Multiplication {
	
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  
	  	driver = new ChromeDriver();
	  	driver.get("https://www.calculator.net/");
	  
	  	driver.findElement(By.xpath("//input[@id='scirdsettingd']")).sendKeys("423");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='scirdsettingd']")).sendKeys("*");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='scirdsettingd']")).sendKeys("525");
		Thread.sleep(1000);
  }
  
  

}
