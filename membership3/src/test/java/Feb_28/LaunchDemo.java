package Feb_28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LaunchDemo {
	@Test
	public void loginTc() {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
		driver.findElement(By.id("email")).sendKeys("user1");
		WebElement pwd=driver.findElement(By.id("pass"));
		Assert.assertTrue(pwd.isDisplayed());
		pwd.sendKeys("test");
		
		
	}

}
