package Mar_4;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestListener {
  @Test
  public void f() {
	  System.out.println("Tc1..");
	  Assert.assertEquals(10, 10);
  }
  
  @Test
  public void f2() {
	  System.out.println("Tc2..");
	  Assert.assertEquals(10,50);
  }
  
}
