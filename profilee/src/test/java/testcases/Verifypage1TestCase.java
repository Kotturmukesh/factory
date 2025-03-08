package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import helper.BrowserSelect;
import helper.TestingDemoTestCase;
import testscript.Page1;


//import Helper.ReadExcel;
//import TestScript.ReadDetails;
public class Verifypage1TestCase {
	Page1  page1;
	WebDriver driver=null;
	
	
	 @BeforeMethod
	 public void setUp() {
		
	  //driver = new ChromeDriver();
	  //driver.get("https://www.facebook.com/");
		 BrowserSelect browser = new BrowserSelect();
		 driver = browser.getBrowser("chrome", "https://www.facebook.com/");
		 driver.navigate().refresh();
		 
	 // Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
		 page1=PageFactory.initElements(driver, Page1.class);
		
		 
		 
	 }

	 @Test(dataProvider = "info",priority=1)
	 public void loginTc(String u1, String p1) {
		 
		
		 page1.getLogin(u1, p1);
		 Assert.assertEquals(0, 0);
	
	 }
	 

	 @DataProvider
	   public Object[][] info()
	   {
	    TestingDemoTestCase ex= new TestingDemoTestCase();
	    ex.testdata();
	    int rowcnt= ex.getRowCount(0);
	   short colcnt =ex.getColumnCount(0);
	   System.out.println("Row Count:"+rowcnt+ " "+"Column Count:"+ colcnt);

	   Object[][] dataobj = new Object[rowcnt+1][colcnt];

	   for(int r=0 ; r<= rowcnt ; r++)
	   {
	   for(int c=0; c<colcnt ;c++)
	   {
	    dataobj[r][c]= ex.getdata(0, r, c);
	   }
	   }
	  return dataobj;

	   }
	 
	 

		//@Test(priority=2)
//		   public void verifyForgetPwd()
//		   {
//			 
//			 page1.getRecover();
//			 Assert.assertEquals(20, 20);
//			 
//			 
//			 
//		   }

	 
	 
	 

	 @AfterMethod
	 public void tearDown() {
	  // driver.close();

	  driver.quit();
	 }
	}