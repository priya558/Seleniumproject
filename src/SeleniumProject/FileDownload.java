package SeleniumProject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FileDownload {
  @Test
  public void Filedownload() throws IOException, InterruptedException {
	  	WebDriver driver = new FirefoxDriver();
		driver.get("https://login.naukri.com/nLogin/Login.php?msg=0&URL=http%3A%2F%2Fmy.naukri.com");
		driver.findElement(By.id("emailTxt")).sendKeys("priyanandigam55555@gmail.com");
		driver.findElement(By.id("pwd1")).sendKeys("nandigam558");
		Thread.sleep(5000);
		driver.findElement(By.name("Login")).click();
		Actions action = new Actions(driver);
		WebElement edit = driver.findElement(By.xpath("//*[@id='mainHeader']/div/div/ul[2]/li[2]/a/div[2]"));
		action.moveToElement(edit).build().perform();
		driver.findElement(By.xpath("//*[@id='mainHeader']/div/div/ul[2]/li[2]/div/ul/li[1]/a")).click();
		driver.findElement(By.xpath(".//*[@id='leftNav_updateProfile']/ul/li/a[4]")).click();
		driver.findElement(By.linkText("Download")).click();
	    //script to download a file
	    Runtime.getRuntime().exec("D:\\autoIt\\DownloadFiles.au3");
	  }
}
