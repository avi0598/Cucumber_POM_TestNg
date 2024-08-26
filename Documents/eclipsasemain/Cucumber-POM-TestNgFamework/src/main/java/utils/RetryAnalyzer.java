package utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
int count=0;
int retryCunt=1;
 
	@Override
	public boolean retry(ITestResult result) {
		while(count<retryCunt) {
			
			count++;
			return true;
		}
		return false;
		 
	}

}
