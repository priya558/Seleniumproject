package SeleniumProject;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTestNG {
  @Test
  public void verifyTitle() {
	  FirefoxDriver driver = new FirefoxDriver();
	  driver.get("https://www.google.co.in/");
	  String actual = driver.getTitle();
	  System.out.println(actual);
	  Assert.assertEquals(actual,"Google");
  }
}
