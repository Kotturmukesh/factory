package Feb_27;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonWish {

	@Test
	public void selection() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		Actions ac = new Actions(driver);
		
		ac.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Account & Lists']"))).perform();
		
		driver.findElement(By.xpath("//span[normalize-space()='Your Wish List']")).click();
		
		ac.moveToElement(driver.findElement(By.xpath("//span[@class='al-intro-banner-header']"))).doubleClick().perform();
		
		

	}
}
