package Feb_28;

import org.testng.annotations.Test;

public class ParallelDemo {
	
  @Test(groups={"Function"})
  public void A() {
	  long i = Thread.currentThread().getId();
	  System.out.println("A" + i);
  }
 
  
  
  @Test(groups={"Function","Regression"})
  public void B() {
	  long ii = Thread.currentThread().getId();
	  System.out.println("B" + ii);
  }
  
  @Test(groups={"Function","Regression"})
  public void C() {
	  long i = Thread.currentThread().getId();
	  System.out.println("C" + i);
  }
  
  
  
  @Test(groups="smoke")
  public void D() {
	  long i = Thread.currentThread().getId();
	  System.out.println("D" + i);
  }
  
  @Test(groups={"Regression"})
  public void E() {
	  long i = Thread.currentThread().getId();
	  System.out.println("E" + i);
  }
  
  
 }

