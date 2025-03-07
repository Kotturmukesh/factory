package Mar_4;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener {
	
 public static Logger log = LogManager.getLogger(MyListener.class);
	
 public void onTestStart(ITestResult result) {
  System.out.println("Test Started...");
  log.info("Test Started...");
 }
	
 public void onTestSuccess(ITestResult result) {
  System.out.println("Test Passed...");
  log.info("Test Passed...");
 }
	
 public void onTestFailure(ITestResult result) {
  System.out.println("Test Failed...");
  log.error("Test Failed...");
 }
	
 public void onTestSkipped(ITestResult result) {
  System.out.println("Test Skipped...");
  log.warn("Test Skipped...");
 }
	
 public void onTestFinish(ITestResult result) {
  System.out.println("Test Finished...");
  log.info("Test Finished...");
 }
	
 public void onStart(ITestContext context) {
  System.out.println("TestNG is starting...");
 }
	
 public void onFinish(ITestContext context) {
  System.out.println("TestNG is finishing...");
 }

}

