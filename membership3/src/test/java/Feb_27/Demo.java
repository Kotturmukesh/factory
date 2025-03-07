package Feb_27;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo {
	@Test(priority=1)
	public void verifyLogin() {
		
		System.out.println("verifylogin");
		Assert.assertEquals("aaa", "aaa");
		
	}
	
	
	
	@Test(priority=2)
	public void verifyAccount() {
		System.out.println("verify account");
		Assert.assertEquals("aaa", "bbb");
	}
	
	
	@Test(priority=3)
	public void verifyLogout() {
		System.out.println("verify logout");
		Assert.assertEquals("aaa", "aaa");
		
	}
	
	
	
	
	
}

	

