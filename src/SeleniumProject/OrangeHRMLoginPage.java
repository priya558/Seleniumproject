package SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class OrangeHRMLoginPage {
  @Test
  public void Login() {
	  FirefoxDriver driver = new FirefoxDriver();
	  driver.get("http://testingmasters.com/hrm/symfony/web/index.php/auth/login");
	  driver.findElement(By.cssSelector("input[id='txtUsername']")).sendKeys("user01");;
	  driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("pass1234");;
	  driver.findElement(By.cssSelector("input.button")).click();
	  //driver.findElement(By.name("txtUsername")).sendKeys("user01");
	  //driver.findElement(By.name("txtPassword")).sendKeys("pass1234");
	  //driver.findElement(By.name("Submit")).click();
	  
	  }
}
