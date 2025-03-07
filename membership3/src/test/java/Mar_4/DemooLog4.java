package Mar_4;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DemooLog4 {
	public static WebDriver driver;
	public static Logger log;

	public static void main(String[] args) {

		log = LogManager.getLogger(DemooLog4.class);

		log.info("Chrome browser starting... ");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		try {
			driver.get("https://www.facebook.com");
			driver.navigate().refresh();
			Assert.assertEquals(driver.getTitle(), "Log in to Facebook");
			log.info("Application launched.. ");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			log.error("Exception Occured", new Exception("facebook url is invalid"));
		}

		log.info("Logged into FaceBook");
		try {
			WebElement user = driver.findElement(By.id("email"));
			Assert.assertTrue(user.isDisplayed());
			user.sendKeys("user1");
			log.info("Entered username.");

			WebElement pwd = driver.findElement(By.id("pass"));
			Assert.assertTrue(pwd.isDisplayed());
			pwd.sendKeys("test");
			log.info("Entered password.");
			boolean status = driver.findElement(By.name("login")).isDisplayed();
			log.info("Login button is displayed.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			log.error("Exception Occured", new Exception("WebElement passed as input is invalid"));
		}
		finally {
			driver.quit();
			log.info("Quitting the driver");
		}
	}
}