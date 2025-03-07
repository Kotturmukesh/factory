package Feb_27;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiooonDemo {
	
	@Test
	public void moveoffsettt() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		
		Actions ac = new Actions(driver);
		
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame));
		
		
		
		
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement srcc = driver.findElement(By.id("droppable"));
				
		//ac.dragAndDrop(src, srcc).perform();
		ac.dragAndDropBy(src, 90, 90).perform();
		
		
		if(srcc.getText().matches("Dropped!")) {
			System.out.println("sucessssss");
		}else {
			System.out.println("drag failed .");
		}
		
	}


}
