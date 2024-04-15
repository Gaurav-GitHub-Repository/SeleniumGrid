package com.app.pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.log4testng.Logger;

import com.app.test.reusable_utility;

public class Login extends reusable_utility{

	static Logger log = Logger.getLogger(Login.class);
	
	reusable_utility utility = new reusable_utility();
	
	WebDriver driver;
	//Constructor to assign driver object
	public Login(WebDriver driver)
	{
		this.driver=driver;
	}
	//Locator for username
	private By Username = By.xpath("//div[@class='login-box']/form/input[1]");
	//Locator for password
	private By Password = By.xpath("//div[@class='login-box']/form/input[2]");
	//Locator for submit button
	private By SubmitButton = By.xpath("//div[@class='login-box']/form/input[3]");
	//Locator for login error
	private By LoginError = By.xpath("//div[@class='login-box']/form/h3/text()[2]");
	
	
	public void setVerifyTitle() {
		Assert.assertEquals(driver.getTitle(), "Swag Labs");
	}
	public By getUsername() {
		return Username;
	}
	//Method to enter username
	public void setUsername(String value) {
		this.Username=Username;
		driver.findElement(Username).sendKeys(value);
		System.out.println("Entered Username");
		//log.info("Entered username");
	}
	public By getPassword() {
		return Password;
	}
	//Method to enter password
	public void setPassword(String value) {
		this.Password=Password;
		driver.findElement(Password).sendKeys(value);
		System.out.println("Entered Password");
		//log.info("Entered Password");
	}
	public By getSubmitButton() {
		return SubmitButton;
	}
	public void setSubmitButton() {
		this.SubmitButton=SubmitButton;
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(SubmitButton));
			driver.findElement(SubmitButton).click();
			System.out.println("Successfully clicked on submit button");
			//log.info("Successfully clicked on submit button");
			utility.takeScreenshot(driver);
		}
		catch(IOException e)
		{
			log.error("Exception Occured");
			//System.out.println("Exception Occured");
		}
	}
	public By getLoginError() {
		return LoginError;
	}
	public void setLoginError() {
		this.LoginError=LoginError;
		WebElement LoginError = driver.findElement(By.xpath("//div[@class='login-box']/form/h3"));
		String error = LoginError.getText();
		System.out.println(error);
		Assert.assertEquals(error, "Epic sadface: Username is required");
	}
	public void setLoginError2() {
		this.LoginError=LoginError;
		WebElement LoginError = driver.findElement(By.xpath("//div[@class='login-box']/form/h3"));
		String error1 = LoginError.getText();
		System.out.println(error1);
		Assert.assertEquals(error1, "Epic sadface: Password is required");
	}
	public void setLoginError3() {
	
		WebElement LoginError = driver.findElement(By.xpath("//div[@class='login-box']/form/h3"));
		String error1 = LoginError.getText();
		System.out.println(error1);
		Assert.assertEquals(error1, "Epic sadface: Username and password do not match any user in this service");
	}
}
