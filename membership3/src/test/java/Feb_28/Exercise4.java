package Feb_28;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");
		driver.manage().window().maximize();
		Actions ac = new Actions(driver);
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		
		driver.findElement(By.xpath("//a[normalize-space()='Order']")).click();
		//driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity")).sendKeys("12");
		//ac.moveToElement(driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity"))).sendKeys("12").perform();
		
		WebElement we = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity"));
		we.click();
		ac.click(we).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).keyDown(Keys.CLEAR).keyUp(Keys.CLEAR).sendKeys("12").build().perform();
		
		WebElement a = driver.findElement(By.cssSelector("#ctl00_MainContent_fmwOrder_txtName"));
		a.sendKeys("Rama Krishnappa Bariya");
		
		driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox2']")).sendKeys("Hamalwadi");
		driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox3']")).sendKeys("Nizamabad");
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox4")).sendKeys("Telangana");
		driver.findElement(By.cssSelector("#ctl00_MainContent_fmwOrder_TextBox5")).sendKeys("503002");
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("scroll(10,+400)");
		WebElement c = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_cardList_1']"));
		c.click();
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).sendKeys("372655541546");
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1")).sendKeys("05/29");
		driver.findElement(By.partialLinkText("Process")).click();
	}

}
