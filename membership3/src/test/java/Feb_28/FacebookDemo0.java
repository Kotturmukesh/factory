package Feb_28;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class FacebookDemo0 {
  

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
       { "user1@gmail.com", "aaabbbccc", "user one profile" },
       { "user2@gmail.com", "bcdvdvdd", "log in" },
       { "user3@gmail.com", "bcdvegedd", "user three" },
    };
  }
  
  @Test(dataProvider = "dp")
  public void f(String n, String s , String e) {
	  
	  WebDriver driver = new ChromeDriver();
	  try {
		  driver.get("https://www.facebook.com/");
		  driver.findElement(By.id("email")).sendKeys(n);
		  driver.findElement(By.id("pass")).sendKeys(s);
		  driver.findElement(By.name("login")).click();
		  
		  String actualR = "";
		  if(e.equals("user one profile")) {
			  try {
				  actualR = driver.findElement(By.xpath("//*[contains(text(),'"+e+"')]")).getText();
				  
			  }catch(Exception eee) {
				  actualR = driver.getTitle();
			  }
		  }else {
			  actualR = driver.getTitle();
	  
	  
	  }Assert.assertTrue(actualR.contains(e), "expected:" + e + "actual" + actualR);
	  
	  }catch(Exception eea) {
		  eea.printStackTrace();
	  }finally {
		  driver.quit();
	  }
	  
  }
  
  
  
  
}
