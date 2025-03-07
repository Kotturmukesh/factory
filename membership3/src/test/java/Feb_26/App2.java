package Feb_26;
import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;
public class App2 {
	 @Test

	  public void calender() throws InterruptedException

	  {
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://ksrtc.in/");
		  driver.manage().window().maximize();//maximizing the page
		  driver.findElement(By.id("corover-close-btn")).click();//closing ad
		  Thread.sleep(2000);
		  
		  WebElement we = driver.findElement(By.xpath("//div[@id='tab-busBooking']"));
		  
		  JavascriptExecutor js = ((JavascriptExecutor)driver);
		  js.executeScript("arguments[0].scrollIntoView(true)", we);
		  
		//method 1 --   js.executeScript("scroll(10,+400)");
		  
		  
		  
		  
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//input[@id='departDate']")).click();
		  Thread.sleep(1000);

		  List<WebElement> allele1= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
		  int cnt = allele1.size();
		  System.out.println(cnt);

		  
		  for(int i=0 ;i< cnt ; i++){

			  List<WebElement> allele= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));

			  System.out.println(allele.get(i).getText());
			  
			  if(allele.get(i).getText().matches("7")) {
				  allele.get(i).click();
				  break;
			  }

			 
		  }



	  }
	
}
