package SeleniumProject;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MultipleWindows {
  @Test
  public void MultipleWindows() throws InterruptedException {
	  WebDriver driver = new FirefoxDriver();
	  
	  driver.get("http://seleniumpractise.blogspot.in/2017/07");
	  String parent = driver.getWindowHandle();
	  System.out.println("Id of Parent Window"+parent);
	  driver.findElement(By.xpath("//a[contains(@href,'http://www.google.com')]")).click();
	  Set<String> allwindows = driver.getWindowHandles();
	  int count = allwindows.size();
	  System.out.println("Total no of windows:"+count);
	  for(String chlid:allwindows)
	  {
		  if(!parent.equalsIgnoreCase(chlid))
		  {
			  driver.switchTo().window(chlid);
			  Thread.sleep(3000);
			  driver.manage().window().maximize();
			  driver.findElement(By.id("lst-ib")).sendKeys("selenium webdriver");
			  driver.close();
		  }
	  }
	  driver.switchTo().window(parent);
	  System.out.println("parent window title:"+driver.getTitle());
	  
	  
  }
}
