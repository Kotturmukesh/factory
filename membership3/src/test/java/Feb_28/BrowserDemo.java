package Feb_28;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BrowserDemo {
	
	WebDriver  driver;
	
	@Parameters({"browser","appUrl"})
  @Test
  public void getBrowser(String b, String appUrl) {
	  switch(b) {
	  
	  case "chrome":
		  driver = new ChromeDriver();
		  break;
		  
	  case "firefox":
		  driver = new FirefoxDriver();
		  break;
		  
	  case "safari":
		  driver = new SafariDriver();
		  break;
		  

		  
		  default:
			  System.out.println("unknown browser");
		  
		  
	  }
	  driver.get(appUrl);
	  
  }
}
