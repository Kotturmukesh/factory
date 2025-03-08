package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Page1 {
	//WebDriver driver;
	//public Page1(WebDriver driver) {
		//this.driver=driver;
	//}
	
	//By username = By.id("email");
	//By password = By.id("pass");
	//By log = By.name("login");
	//By forget = By.linkText("Forgotten account?");
	
	@FindBy(id="email")WebElement username;
	@FindBy(id="pass")WebElement password;
	@FindBy(name="login")WebElement log;
	//@FindBy(linkText="Forgotten account?")WebElement forget;
	
	
	
	public void getLogin(String user, String pass) {
	
//		WebElement e = driver.findElement(username);
//		e.sendKeys(user);
//		driver.findElement(password).sendKeys(pass);
//		driver.findElement(log).click();
//		
		username.sendKeys(user);
		password.sendKeys(pass);
		log.click();
		
		
		
		
	}
	


}
