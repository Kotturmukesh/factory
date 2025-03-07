package Feb_25;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
//import java.sql.Date;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Neww {
	static WebDriver driver;
	
	public Neww(WebDriver driver) {
		this.driver=driver;
	}
	
	public void getErrorScreenshot(WebDriver driver1) {
		driver=driver1;
		File x = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File y = new File("src\\test\\java\\Feb_25\\image.png");
		try {
			FileUtils.copyFile(x, y);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		}
	public static void getErrorScreenshot2(WebDriver driver1) {
		driver = driver1;
		Date d = new Date();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
		String time = df.format(d);
		System.out.println(time);
		
		File x = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File y = new File("src\\test\\java\\Feb_25\\image" +time+ ".png");
		try {
			FileUtils.copyFile(x, y);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	}

