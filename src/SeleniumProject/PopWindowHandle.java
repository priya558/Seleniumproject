package SeleniumProject;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PopWindowHandle {
  @Test
  public void Popwindow() {
	  System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	  WebDriver driver =  new ChromeDriver();
	  driver.get("http://learn-automation.com/launch-chrome-browser-using-selenium-webdriver/");
	  String parent = driver.getWindowHandle();
	  //System.out.println("Parent window:"+parent);
	  //Set<String> allwindows = driver.getWindowHandles();
	  //ArrayList<String> tabs = new ArrayList(allwindows);
	  //int count = tabs.size();
	  //System.out.println("count:"+count);
	  //driver.switchTo().window(tabs.get(1));
	  Alert alt  = driver.switchTo().alert();
	  alt.accept();
	  }
}

