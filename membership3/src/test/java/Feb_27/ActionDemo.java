package Feb_27;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {
	@Test
	public void moveoffset() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Actions a = new Actions(driver);
		WebElement e = driver.findElement(By.className("lnXdpd"));
		
		int x=e.getLocation().getX();
		int y = e.getLocation().getY();
		a.moveByOffset(x, y).contextClick().build().perform();
	}

}
