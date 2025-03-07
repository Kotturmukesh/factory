package Feb_26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertDemo {
	 @Test

	  public void webAlert() throws InterruptedException

	  {
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://ksrtc.in/");
		  driver.manage().window().maximize();//maximizing the page
		  driver.findElement(By.id("corover-close-btn")).click();//closing ad
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//div[@id='submitSearch']")).click();
		  Thread.sleep(2000);
		  
		  String txt = driver.switchTo().alert().getText();
		  System.out.println(txt);
		  Thread.sleep(2000);
		  if(txt.matches("Please select start place.")) {
			  Thread.sleep(2000);
			  driver.switchTo().alert().accept();
		  }else {
			  System.out.println("Invalid");
			  driver.switchTo().alert().dismiss();
		  }
		  
		  
		  
		  
	  }
}
