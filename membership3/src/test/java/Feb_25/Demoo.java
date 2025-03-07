package Feb_25;



//import java.io.File;
//import java.io.IOException;

//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demoo {
	@Test
	public void verifyScrenn() {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.navigate().refresh();
	
//	Neww obj = new Neww(driver);
//
//	obj.getErrorScreenshot();
	
	Neww.getErrorScreenshot2(driver);
	
	
	}
}