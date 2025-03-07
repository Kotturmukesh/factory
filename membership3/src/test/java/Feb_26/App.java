package Feb_26;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class App {
	@Test
	public void calender() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://ksrtc.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("corover-close-btn")).click();
		driver.findElement(By.xpath("//input[@id='departDate']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr[2]/td[4]/a")).click();
		}
	}
	

