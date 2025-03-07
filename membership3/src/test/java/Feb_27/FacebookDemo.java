package Feb_27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class FacebookDemo {
	
	@Test

	  public void facebooktest() throws InterruptedException

	  {
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.facebook.com/");
	//driver.navigate().refresh();
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	
	WebElement e = driver.findElement(By.id("email"));
	e.sendKeys("ramvcouh@gmail.com");
	WebElement p = driver.findElement(By.id("pass"));
	p.sendKeys("agesf");
	
	WebElement l = driver.findElement(By.name("login"));
	wait.until(ExpectedConditions.numberOfElementsToBe(By.name("login"), 1));
	l.click();

	  }
}
