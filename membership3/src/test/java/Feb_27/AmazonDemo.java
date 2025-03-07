package Feb_27;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class AmazonDemo {
	@Test
	public void selection() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		WebElement we = driver.findElement(By.id("twotabsearchtextbox"));
		we.sendKeys("phones");
		WebElement wee = driver.findElement(By.id("nav-search-submit-button"));
		wee.click();
		
		WebElement app = driver.findElement(By.xpath("//span[@class='a-size-base a-color-base'][normalize-space()='Apple']"));
		app.click();
		
		

	}
	
}
