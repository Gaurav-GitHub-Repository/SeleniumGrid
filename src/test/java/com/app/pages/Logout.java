package com.app.pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.log4testng.Logger;

import com.app.test.reusable_utility;

public class Logout extends reusable_utility{

	static Logger log = Logger.getLogger(Logout.class);
	
	reusable_utility utility = new reusable_utility();
	
	WebDriver driver;
	//Contructor to assign driver object
	public Logout(WebDriver driver)
	{
		this.driver=driver;
	}
	//Locator to click on button
	private By Button = By.cssSelector("div.bm-burger-button");
	//Locator to click on all items
	private By All_Item = By.xpath("//*[@id='inventory_sidebar_link']");
	//Locator to click on about button
	private By About = By.xpath("//*[@id='about_sidebar_link']");
	//Locator to click on reset app state button
	private By ResetAPPState = By.xpath("//*[@id='reset_sidebar_link']");
	//Locator to click on close button
	private By Close = By.xpath("//*[@id='menu_button_container']/div/div[2]/div[2]/div/button");
	//Locator for logout button
	private By LogoutButton = By.xpath("//div[@class='bm-menu-wrap']/div/nav/a[3]");

	//Method to verify dashboard page
	public void setVerifyTitle() {
		Assert.assertEquals(driver.getTitle(), "Swag Labs");
	}
	public By getButton() {
		return Button;
	}
	//Method to click on button
	public void setButton() throws IOException {
		this.Button = Button;
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(Button));
			driver.findElement(Button).click();
			System.out.println("Successfully clicked on button");
			//log.info("Successfully clicked on button");
			utility.takeScreenshot(driver);
		}
		catch(ElementClickInterceptedException e)
		{
			log.error("Exception Occured");
			//System.out.println("Exception Occured");
		}
	}
	public By getAll_Item() {
		return All_Item;
	}
	//Method to click on all item button
	public void setAll_Item() {
		this.All_Item=All_Item;
		driver.findElement(All_Item).click();
		System.out.println("Successfully clicked on all items button");
		//log.info("Successfully clicked on all items button");
	}
	public By getAbout() {
		return About;
	}
	//Method to click on about button
	public void setAbout() {
		this.About = About;
		driver.findElement(About).click();
		System.out.println("Successfully clicked on about button");
		//log.info("Successfully clicked on about button");
	}
	public By getResetAPPState() {
		return ResetAPPState;
	}
	//Method to click on ResetAPPState button
	public void setResetAPPState() throws IOException {
		this.ResetAPPState=ResetAPPState;
		try {
			driver.findElement(ResetAPPState).click();
			System.out.println("Successfully clicked on ResetAPPState button");
			//log.info("Successfully clicked on ResetAPPState button");
			utility.takeScreenshot(driver);
		}
		catch(NoSuchElementException e)
		{
			log.error("Exception Occured");
			//System.out.println("Exception Occured");
		}
	}
	public By getClose() {
		return Close;
	}
	//Method to click on close button
	public void setClose() {
		this.Close = Close;
		driver.findElement(Close).click();
		System.out.println("Successfully clicked on Close button");
		//log.info("Successfully clicked on Close button");
	}
	public By getLogoutButton() {
		return LogoutButton;
	}
	//Method to click on logout button
	public void setLogoutButton(By setLogoutButton) throws IOException {
		this.LogoutButton=LogoutButton;
		driver.findElement(LogoutButton).click();
		System.out.println("Successfully clicked on LogoutButton");
		//log.info("Successfully clicked on LogoutButton");
		utility.takeScreenshot(driver);
	}
}
