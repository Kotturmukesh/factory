package Feb_28;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Two {
	
	

	@Test(priority=1)
	  public void loginTc()
	  {
		WebDriver driver =new ChromeDriver();;
	driver.get("https://www.facebook.com/");
	AssertJUnit.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
	driver.findElement(By.id("email")).sendKeys("user1");
	WebElement pwd=driver.findElement(By.id("pass"));
	AssertJUnit.assertTrue(pwd.isDisplayed());
	pwd.sendKeys("test");
	driver.findElement(By.name("login")).click();
	AssertJUnit.assertEquals(0, 0);
	}
	  @Test(priority=2)
	  public void accountTc()
	  {
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.facebook.com/");
	AssertJUnit.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
	driver.findElement(By.linkText("Create new account")).click();
	driver.findElement(By.name("firstname")).sendKeys("john");
	driver.findElement(By.name("lastname")).sendKeys("ibrahim");
	AssertJUnit.assertEquals(0, 0);
	}
}
