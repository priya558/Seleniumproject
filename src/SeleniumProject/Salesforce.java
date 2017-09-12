package SeleniumProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Salesforce {
	@Test 
	public void Registartion() throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("signup_link")).click();
		driver.findElement(By.id("UserFirstName")).sendKeys("devi");
		driver.findElement(By.id("UserLastName")).sendKeys("Priya");
		driver.findElement(By.id("UserTitle")).sendKeys("Software Engineer");
		driver.findElement(By.id("UserEmail")).sendKeys("devipriya.nandigam@gmail.com");
		driver.findElement(By.id("UserPhone")).sendKeys("9490497623");
		driver.findElement(By.id("CompanyName")).sendKeys("Devmode IT Solutions");
		driver.findElement(By.xpath("//span[@class='selectBox-arrow']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[starts-with(@class,'selectBox')]/li[3]")).click();
		
		driver.findElement(By.xpath(".//*[@id='form-container']/ul/li[15]/div/div[2]/a/span[1]")).click();
		 driver.findElement(By.xpath("html/body/ul[3]/li[100]/a")).click();
		
		driver.findElement(By.id("SubscriptionAgreement")).click();
		driver.findElement(By.xpath(".//*[@id='form-container']/div[2]/a/span")).click();

	}
}
