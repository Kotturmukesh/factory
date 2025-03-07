package Feb_28;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
		Actions ac = new Actions(driver);
		ac.sendKeys("Muthhu Swami").build().perform();
		ac.keyDown(Keys.TAB).keyUp(Keys.TAB).sendKeys("rambooooooo.com").build().perform();
		ac.keyDown(Keys.TAB).keyUp(Keys.TAB).keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
		//driver.findElement(By.name("btnchkavail0e4d24fb")).click();
		ac.keyDown(Keys.TAB).keyUp(Keys.TAB).sendKeys("OBBulReddy@123").build().perform();
		ac.keyDown(Keys.TAB).keyUp(Keys.TAB).sendKeys("OBBulReddy@123").build().perform();
		ac.keyDown(Keys.TAB).keyUp(Keys.TAB).sendKeys("rambabu@gmail.com").build().perform();
		//WebElement aa = driver.findElement(By.xpath("//input[@name='chk_altemail0e4d24fb']"));
		
		
		
		
	}

}
