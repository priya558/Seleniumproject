package SeleniumProject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ScrollDownPage {
  @Test
  public void scrollDown() throws Exception {
	  WebDriver driver = new FirefoxDriver();
	  
	  driver.manage().window().maximize();
	  driver.get("http://jqueryui.com/");
	  Thread.sleep(5000);
	  ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
	  
	  }
}
