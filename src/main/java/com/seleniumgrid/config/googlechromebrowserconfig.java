package com.seleniumgrid.config;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;

public class googlechromebrowserconfig {
	
	protected static WebDriver driver;
	
	@Test(priority=1)
	public void setConfiguration() throws MalformedURLException
	{
		int OperatingSystem = 1;
		String HubServer;
		
		switch(OperatingSystem)
		{
			case 1:
				//Set Desired Capabilities
				DesiredCapabilities cap = new DesiredCapabilities();
				cap.setPlatform(Platform.WINDOWS);
				cap.setBrowserName("Chrome");
				//Set Chrome Options
				ChromeOptions options = new ChromeOptions();
				options.merge(cap);
				//Set Hub Server URL
				String HubServerURL = "http://192.168.1.8:4444/wd/hub";
				driver = new RemoteWebDriver(new URL(HubServerURL), options);
				break;
			case 2:
				//Set Desired Capabilities
				DesiredCapabilities cap1 = new DesiredCapabilities();
				cap1.setPlatform(Platform.MAC);
				cap1.setBrowserName("Chrome");
				//Set Chrome Options
				ChromeOptions options1 = new ChromeOptions();
				options1.merge(cap1);
				//Set Hub Server URL
				String HubServerURL1 = "http://192.168.1.8:4444/wd/hub";
				driver = new RemoteWebDriver(new URL(HubServerURL1), options1);
				break;
			case 3:
				//Set Desired Capabilities
				DesiredCapabilities cap3 = new DesiredCapabilities();
				cap3.setPlatform(Platform.LINUX);
				cap3.setBrowserName("Chrome");
				//Set Chrome Options
				ChromeOptions options2 = new ChromeOptions();
				options2.merge(cap3);
				//Set Hub Server URL
				String HubServerURL2 = "http://192.168.1.8:4444/wd/hub";
				driver = new RemoteWebDriver(new URL(HubServerURL2), options2);
				break;
			default:
				HubServer = "Invalid Operating System or HubServer";		
		}
	}
}
