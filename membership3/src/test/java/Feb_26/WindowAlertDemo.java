package Feb_26;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowAlertDemo {
	 @Test

	  public void windowAlert() throws InterruptedException, AWTException

	  {
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brandcom&gad_source=1&gclid=CjwKCAiAlPu9BhAjEiwA5NDSA57TPkzN6OI2QkmKhlyhb6qfXU4ynF_gG7km3xIku4vXzozFk1VbkRoCKvYQAvD_BwE&gclsrc=aw.ds");
		  driver.manage().window().maximize();//maximizing the page
		  JavascriptExecutor js = ((JavascriptExecutor)driver);
		  js.executeScript("scroll(10,+400)");
		  Thread.sleep(2000);
		  
		  
		  
		  driver.findElement(By.xpath("//h2[text()=\"I'm experienced\"]")).click();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		  Thread.sleep(2000);
		  
		  StringSelection s = new StringSelection("C:\\Users\\Administrator\\Desktop\\Hloooo.pdf");//coping the file path
		  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);//storing the path to system memory
		  
		  Robot r = new Robot();
		  r.keyPress(KeyEvent.VK_CONTROL);//paste the file
		  r.keyPress(KeyEvent.VK_V);
		  
		  r.keyRelease(KeyEvent.VK_V);//release the key
		  r.keyRelease(KeyEvent.VK_CONTROL);
		  
		  Thread.sleep(2000);
		  
		  r.keyPress(KeyEvent.VK_ENTER);//pressing enter
		  r.keyRelease(KeyEvent.VK_ENTER);//releasing enter
		  
	  }
}
