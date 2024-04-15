package com.app.test;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v123.io.IO;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listener_utility implements ITestListener{

	WebDriver driver;
	
	public void onTestStart(ITestResult result) {
		
		if(result.getStatus()==ITestResult.STARTED)
		{
			System.out.println("onTestStart");
		}
		else
		{
			System.out.println("Test Fail");
		}
		
	}	
	public void onTestSuccess(ITestResult result) {
		
		if(result.getStatus()==ITestResult.SUCCESS)
		{
			System.out.println("Test Success");
		}
		else
		{
			System.out.println("Test Fail");
		}
		
	}
	public void onTestFailure(ITestResult result) {
		
		if(result.getStatus()==ITestResult.FAILURE)
		{
			System.out.println("Test Failure");
		}
		else
		{
			System.out.println("Exception Occured");
		}
	}
	public void onTestSkipped(ITestResult result) {
		
		if(result.getStatus()==ITestResult.SKIP)
		{
			System.out.println("Test Skipped");
		}
		else
		{
			System.out.println("Test Fail");
		}
		
	}
}
