package calculator_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Addition {
	
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  
	  driver = new ChromeDriver();
	  driver.get("https://www.calculator.net/");
	  
	  driver.findElement(By.xpath("//input[@id='scirdsettingd']")).sendKeys("-234234");
	  Thread.sleep(1000);
	
	  driver.findElement(By.xpath("//input[@id='scirdsettingd']")).sendKeys("+");
	  Thread.sleep(1000);
	
	  driver.findElement(By.xpath("//input[@id='scirdsettingd']")).sendKeys("345345");
	  Thread.sleep(1000);
  }
  
}
