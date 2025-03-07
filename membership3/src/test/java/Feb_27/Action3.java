package Feb_27;



import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Action3 {

	@Test
	public void keyboard() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		
		Actions ac = new Actions(driver);
		
		WebElement we = driver.findElement(By.id("email"));
		we.sendKeys("aabbbccc");

		
		ac.click(we).keyDown(Keys.CONTROL).sendKeys("a")
		.sendKeys("c").keyUp(Keys.CONTROL).click(driver.findElement(By.id("pass")))
		.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL)
		.click(driver.findElement(By.name("login"))).build().perform();
		
		

	}
}

