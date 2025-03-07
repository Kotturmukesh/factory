package mar_1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewFacebook {
	
	WebDriver driver;

	@BeforeMethod
	public void setup()
	{
	driver =new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	driver.navigate().refresh();
	
	//Assert.assertEquals(driver.getTitle(), "Log in to Facebook");
	}
	  @Test
	  public void loginTc()
	  {
		  Actions ac = new Actions(driver);
	WebElement unm = ReadDetails.getElement("username", driver);
	unm.sendKeys("user1");
	ReadDetails.getElement("password", driver).sendKeys("test");
	//WebElement as = ReadDetails.getElement("log", driver);
	ac.keyDown(Keys.TAB).keyUp(Keys.TAB).keyDown(Keys.TAB).keyUp(Keys.TAB).keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
	
	
	Assert.assertEquals(0, 0);
	  }
	  
	  

	  @Test(dataProvider="infoo")
	  public void loginTcc(String u1, String p1)
	  {
		  Actions ac = new Actions(driver);
	WebElement unm = ReadDetails.getElement("username", driver);
	unm.sendKeys(u1);
	ReadDetails.getElement("password", driver).sendKeys(p1);
	//ReadDetails.getElement("log", driver);
	ac.keyDown(Keys.TAB).keyUp(Keys.TAB).keyDown(Keys.TAB).keyUp(Keys.TAB).keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
	Assert.assertEquals(0, 0);
	  }
	  
	  @DataProvider
	  public Object[][]infoo(){
		  return new Object[][] {
			  {"aaa","a"},
			  {"bbb","b"},
			  {"ccc","c"}
		  };
	  }
	  
	  @Test(priority=2)
	  public void verifyf() {
		  
		  ReadDetails.getElement("forget", driver);
		  
		 // WebElement verify = ReadDetails.getElement("forgetVerify", driver);
		  //Assert.assertTrue(verify.isDisplayed());
	  }
	  
	  @AfterMethod
	  public void tearDown()
	  {
	driver.quit();
	  }

}
