package Mar_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ListenerRun {
 WebDriver driver;
 @BeforeMethod
 public void launch() {
  driver = new ChromeDriver();
  driver.get("https://www.facebook.com/");
 }
  @Test
  public void login() {
   driver.findElement(By.id("email")).sendKeys("gfdsdf");
   //Assertion for password field
   WebElement pass = driver.findElement(By.id("pass"));
   Assert.assertTrue(pass.isDisplayed());
  pass.sendKeys("test");
   driver.findElement(By.name("login")).click();
  }
  
  @Test
  public void Forgotpass() {
   driver.findElement(By.xpath("//a[contains(text(),'Forgotten account?')]")).click();
   
  }
}