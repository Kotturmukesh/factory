package Feb_28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ModifiedDemo {
	
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
	}
	
	@Test(priority=1)
	  public void loginTc()
	  {
	driver.findElement(By.id("email")).sendKeys("user1");
	WebElement pwd=driver.findElement(By.id("pass"));
	Assert.assertTrue(pwd.isDisplayed());
	pwd.sendKeys("test");
	driver.findElement(By.name("login")).click();
	Assert.assertEquals(0, 0);
	}
	  @Test(priority=2)
	  public void accountTc()
	  {
	
	driver.findElement(By.linkText("Create new account")).click();
	driver.findElement(By.name("firstname")).sendKeys("john");
	driver.findElement(By.name("lastname")).sendKeys("ibrahim");
	Assert.assertEquals(0, 0);
	}
	  
	  @AfterMethod
	  public void tearDown() throws InterruptedException {
		  driver.close();
	  }

}
