package com.app.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class reusable_utility {

	WebDriver driver;
	
	//Method to scroll
	public void scroll(WebDriver driver1)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver1;
		js.executeScript("window.scrollBy(0,450)", "");
	}	
	/*	//Method to scroll to the element
	public void scroll()
	{
		WebElement Element = driver.findElement(Button);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", Element);
	} */
	//Method to take screenshot
	public void takeScreenshot(WebDriver driver1) throws IOException  
	{
		TakesScreenshot screenshot = (TakesScreenshot)driver1;
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		File target = new File("C:\\Selenium Temp\\BDD_Cucumber\\SeleniumGrid\\screenshots\\PassedTestCase.png"); 
		FileHandler.copy(source, target);
	}
	//Method to upload file
	public void uploadFile() throws AWTException, InterruptedException, IOException
	{
	       Robot robot = new Robot();
	       robot.setAutoDelay(3000);
	       StringSelection stringselection = new StringSelection("C:\\Users\\Gaurav\\Desktop\\File.txt");  //File Upload
	       Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselection, null);
	       robot.setAutoDelay(3000);
	       robot.keyPress(KeyEvent.VK_CONTROL);
	       robot.keyPress(KeyEvent.VK_V);
	       robot.keyRelease(KeyEvent.VK_CONTROL);
	       robot.keyRelease(KeyEvent.VK_V);
	       robot.setAutoDelay(3000);
	       robot.keyPress(KeyEvent.VK_ENTER);
	       robot.keyRelease(KeyEvent.VK_ENTER);
	}
	//Method to scroll
	public void scroll3(WebDriver driver4)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver4;
		js.executeScript("window.scrollBy(0,6000)", "");
	}	
	//Method to scroll
	public void scroll2(WebDriver driver3)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver3;
		js.executeScript("window.scrollBy(0,1500)", "");
	}	
}
