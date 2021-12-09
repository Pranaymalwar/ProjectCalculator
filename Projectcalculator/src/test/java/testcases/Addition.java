package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import testbase.Testbase;

public class Addition extends Testbase {
	
  @Test
  public void f() throws InterruptedException {
	  
	  driver.get("https://www.calculator.net/");
	  
	  driver.findElement(By.xpath("//input[@id='scirdsettingd']")).sendKeys("-234234");
	  Thread.sleep(1000);
	
	  driver.findElement(By.xpath("//input[@id='scirdsettingd']")).sendKeys("+");
	  Thread.sleep(1000);
	
	  driver.findElement(By.xpath("//input[@id='scirdsettingd']")).sendKeys("345345");
	  Thread.sleep(1000);
  }
  
}
