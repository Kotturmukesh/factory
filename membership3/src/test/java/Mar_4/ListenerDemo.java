package Mar_4;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerDemo implements ITestListener{
	
	public void onTestStart(ITestResult result) {
		System.out.println("started tc");
	}
	
	public void onTestSucess(ITestResult result) {
		System.out.println("pass tc");
	}
	
	public void onTestFailure(ITestResult result) {
		System.out.println("failed tc");
	}
	
	public void onTestSkipped(ITestResult result) {
		System.out.println("skipped tc");
	}
	
	public void onStart(ITestContext context) {
		System.out.println("class started");
	}
	
	
	public void onFinish(ITestContext context) {
		System.out.println("class stoped");
	}
	
	

}
