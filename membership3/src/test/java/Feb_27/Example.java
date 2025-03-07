package Feb_27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example {
	
	@Test

	  public void selectdemo() throws InterruptedException

	  {
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.ixigo.com/");
		  driver.manage().window().maximize();//maximizing the page
		  Thread.sleep(2000);

		  driver.navigate().refresh();
		 // driver.findElement(By.id("closeButton")).click();//closing ad
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//button[text()='Search']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//div[@class='overflow-y-scroll absolute top-[61px] bg-white w-[375px] min-h-[150px] max-h-[450px] shadow-500 z-20 rounded-20 !animate-none no-scrollbar block Autocompleter_animate__zqRDe']//div//p[@class='body-sm text-secondary'][normalize-space()='Chatrapati Shivaji International Airport']")).click();//selecting place
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//button[text()='Search']")).click();
		  
		  
		  
	  }
	@Test

	  public void implictdemo() throws InterruptedException

	  {
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.ixigo.com/");
		  //driver.manage().window().maximize();//maximizing the page
		 
		  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(4));//selenium wait
		  //Thread.sleep(2000);
		  driver.navigate().refresh();
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//implicit wait
		  driver.findElement(By.xpath("//button[text()='Search']")).click();
		 
		  driver.findElement(By.xpath("//div[@class='overflow-y-scroll absolute top-[61px] bg-white w-[375px] min-h-[150px] max-h-[450px] shadow-500 z-20 rounded-20 !animate-none no-scrollbar block Autocompleter_animate__zqRDe']//div//p[@class='body-sm text-secondary'][normalize-space()='Chatrapati Shivaji International Airport']")).click();//selecting place
		  
		  driver.findElement(By.xpath("//button[text()='Search']")).click();

	  }
}
