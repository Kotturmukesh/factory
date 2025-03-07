package Feb_25;
import java.util.List;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;
public class Appp {

	  @Test

	  public void calender() throws InterruptedException

	  {
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://ksrtc.in/");
		  driver.manage().window().maximize();
		  driver.findElement(By.id("corover-close-btn")).click();

		  driver.findElement(By.xpath("//input[@id='departDate']")).click();
		  Thread.sleep(1000);

		  List<WebElement> allele1= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
		  int cnt = allele1.size();
		  System.out.println(cnt);

		  for(int i=0 ;i< cnt ; i++){

			  List<WebElement> allele= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));

			  System.out.println(allele.get(i).getText());

			  allele.get(i).click();

			  Thread.sleep(500);

			  driver.findElement(By.xpath("//input[@id='departDate']")).click();
		  }



	  }

	}

