package Feb_28;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderDemo {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
	  System.out.println(n + " " + s);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  
  
  
  
 
	  @Test(dataProvider = "dpp")
	  public void f2(Integer n, String s, String s2) {
		  System.out.println(n + " " + s + " " + s2);
	  }

	  @DataProvider
	  public Object[][] dpp() {
	    return new Object[][] {
	      new Object[] { 1, "a", "rambabu"},
	      new Object[] { 2, "b", "obulreddy"},
	      new Object[] { 3, "c", "Raju Mittal"},
	      new Object[] { 4, "d", "Muthuu Swami"},
	    };
	  }
  
} 
