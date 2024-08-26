package utils;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.IAnnotationTransformer;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

import baseTest.baseTest;

public class SuiteListner implements ITestListener,IAnnotationTransformer {
	public void OnTestFailure(ITestResult result) {
	
	//String filename= System.getProperty("user.dir")+File.separator+"screenshots"+File.separator+result.getMethod().getMethodName();
	String filename= System.getProperty("user.dir") + File.separator+"screenshots"+File.separator+"SDETADDAE"+File.separator+result.getMethod().getMethodName();

	System.out.println(filename);
			File f1= ((TakesScreenshot)baseTest.driver).getScreenshotAs (OutputType.FILE);

			try {

			FileUtils.copyFile(f1, new File(filename+".png"));

			} catch (IOException e) {

			// z

			e.printStackTrace();

			}}
	
	public void OnTestPass(ITestResult result) {
		String Filenam =  System.getProperty("user.dir")+File.separator+"screenshots"+result.getMethod().getMethodName();
	File f2=((TakesScreenshot)baseTest.driver).getScreenshotAs(OutputType.FILE);
		
	try {
		FileUtils.copyFile(f2, new File(Filenam+".png"));	
	} catch(IOException e) {
		e.printStackTrace();
		
	}
		//
		
	}
			public void transform(ITestAnnotation annotation) {
				      //ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
				    // not implemented
				annotation.setRetryAnalyzer(RetryAnalyzer.class);
				  }

}
