package mar_1;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class ReadDetails {

	public static String getdetails(String key){
		String value = null;
		try {
			FileInputStream f = new FileInputStream("src\\test\\java\\mar_2\\locator.properties");
			Properties p = new Properties();
			p.load(f);
			
			value = p.getProperty(key);
			
			
			
			
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		return value;
		
		
		
	}
	
	public static WebElement getElement(String key2, WebDriver driver) {
		WebElement we = null;
		
		String value= getdetails(key2);
		String[] info = value.split(":");
		switch(info[0]) {
		case "id":
			we=driver.findElement(By.id(info[1]));
			break;
		case "xpath":
			we=driver.findElement(By.xpath(info[1]));
			break;
		case "linktext":
			we=driver.findElement(By.linkText(info[1]));
			break;
		case "className":
			we=driver.findElement(By.className(info[1]));
			break;
			default:
				System.out.println("unknown locator found");
		
		
		
		
		
		}
		return we;
		
		
	}

}
