package com.app.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.app.pages.Dashboard;
import com.app.pages.Login;
import com.seleniumgrid.config.internetexplorerbrowserconfig;

@Listeners(listener_utility.class)	
public class TestCase97 extends internetexplorerbrowserconfig{

	static Logger log = Logger.getLogger(TestCase97.class); 
	
	static WebDriver driver;
	
	@Parameters("browserName")
	@Test(priority=2)
	public void setBrowserConfig(String browserName)
	{
		if(browserName.equalsIgnoreCase("GoogleChrome"))
		{
			ChromeOptions options = new ChromeOptions();
			options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
			System.setProperty("WebDriver.Chrome.Driver", "C:\\Selenium Temp\\BDD_Cucumber\\SeleniumGrid\\drivers\\chromedriver.exe");
			driver=new ChromeDriver(options);
			log.info("Chrome browser is launched");
			//System.out.println("Chrome browser is launched");
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com/v1/index.html");
			log.info("URL is launched");
			//System.out.println("URL is launched");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		else if(browserName.equalsIgnoreCase("Firefox"))
		{
			FirefoxOptions options = new FirefoxOptions();
			options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
			System.setProperty("WebDriver.gecko.Driver", "C:\\Selenium Temp\\BDD_Cucumber\\SeleniumGrid\\drivers\\geckodriver.exe");
			driver=new FirefoxDriver(options);
			log.info("Firefox browser is launched");
			//System.out.println("Firefox browser is launched");
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com/v1/index.html");
			log.info("URL is launched");
			//System.out.println("URL is launched");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		else if(browserName.equalsIgnoreCase("MicrosoftEdge"))
		{
			EdgeDriver option = new EdgeDriver(); 
			System.setProperty("WebDriver.edge.Driver", "C:\\Selenium Temp\\BDD_Cucumber\\SeleniumGrid\\drivers\\msedgedriver.exe");
			driver=new EdgeDriver();
			log.info("Edge browser is launched");
			//System.out.println("Edge browser is launched");
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com/v1/index.html");
			log.info("URL is launched");
			//System.out.println("URL is launched");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		else if(browserName.equalsIgnoreCase("InternetExplorer"))
		{
			InternetExplorerOptions options = new InternetExplorerOptions();
			options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
			System.setProperty("WebDriver.ie.Driver", "C:\\Selenium Temp\\BDD_Cucumber\\SeleniumGrid\\drivers\\IEDriverServer.exe");
			driver=new InternetExplorerDriver(options);
			log.info("Internet Explorer browser is launched");
			//System.out.println("Internet Explorer browser is launched");
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com/v1/index.html");
			log.info("URL is launched");
			//System.out.println("URL is launched");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		else if(browserName.equalsIgnoreCase("Safari"))
		{
			SafariDriver option = new SafariDriver();
			driver=new SafariDriver();
			log.info("Safari browser is launched");
			//System.out.println("Safari browser is launched");
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com/v1/index.html");
			log.info("URL is launched");
			//System.out.println("URL is launched");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		else
		{
			System.out.println("Browser is not launched");
		}
	}
		@Test(priority=3)
		public void regression()
		{
			//Method to get Login
			Login login = new Login(driver);
			//Method to enter username
			login.setUsername("standard_user");
			//Method to enter password
			login.setPassword("secret_sauce");
			//Method to click on login button
			login.setSubmitButton();
			//Method to get dashboard
			Dashboard dashboard = new Dashboard(driver);
			//Method to click on product
			dashboard.setProduct2(null);
		}
		@Test(priority=4)
		public void logout()
		{
			driver.quit();
			log.error("Java Socket Exception Occured");
		}
}
