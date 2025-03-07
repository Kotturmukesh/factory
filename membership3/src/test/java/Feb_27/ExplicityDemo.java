package Feb_27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicityDemo {
	@Test

	  public void explicitywait() throws InterruptedException

	  {
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.ixigo.com/");

		Thread.sleep(3000);

		driver.navigate().refresh();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));


		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

		wait.until(ExpectedConditions.attributeContains(By.xpath("//button[text()='Search']"),"xpath","//button[text()='Search']"));


		WebElement serach = driver.findElement(By.xpath("//button[text()='Search']"));

		wait.until(ExpectedConditions.attributeToBeNotEmpty(serach,"xpath"));

		wait.until(ExpectedConditions.elementSelectionStateToBe(By.xpath("//button[text()='Search']"),true));
		serach.click(); // search button
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='overflow-y-scroll absolute top-[61px] bg-white w-[375px] min-h-[150px] max-h-[450px] shadow-500 z-20 rounded-20 !animate-none no-scrollbar block Autocompleter_animate__zqRDe']/div/div/div[1]/span[text()='DEL']")));

		WebElement del=driver.findElement(By.xpath("//div[@class='overflow-y-scroll absolute top-[61px] bg-white w-[375px] min-h-[150px] max-h-[450px] shadow-500 z-20 rounded-20 !animate-none no-scrollbar block Autocompleter_animate__zqRDe']/div/div/div[1]/span[text()='DEL']"));

		del.click();
	
		  
	  }

}
