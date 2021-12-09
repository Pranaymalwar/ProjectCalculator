package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testbase.Testbase;

public class Division extends Testbase {
	
  @Test
  public void f() throws InterruptedException {
	  
	  driver.get("https://www.calculator.net/");
	  
	  driver.findElement(By.xpath("//input[@id='scirdsettingd']")).sendKeys("4000");
	  Thread.sleep(1000);
		
	  driver.findElement(By.xpath("//input[@id='scirdsettingd']")).sendKeys("/");
	  Thread.sleep(1000);
		
	  driver.findElement(By.xpath("//input[@id='scirdsettingd']")).sendKeys("200");
	  Thread.sleep(1000);
  }
  
  
  
}
