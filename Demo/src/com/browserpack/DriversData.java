package com.browserpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriversData {
	public static WebDriver driver;
	
	
		
		
		     public static void browserLaunch(String browser,String url){
		    	 
		     
		     
		    	
		 		if(browser.equalsIgnoreCase("CHROME"))
		 		{
		 			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		 			driver=new ChromeDriver();
		 		}
		 		else if(browser.equalsIgnoreCase("FF"))
		 		{
		 			System.setProperty("webdriver.geko.driver", System.getProperty("user.dir")+"//drivers//gekodriver.exe");
		 			driver=new FirefoxDriver();
		 		}
		 		else if(browser.equalsIgnoreCase("IE"))
		 		{
		 			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"//drivers//IEDriverServer.exe");
		 			driver=new InternetExplorerDriver();
		 		}
		 		
		 		//driver.get(url);
		 		
		 		driver.navigate().to(url);
		 		driver.manage().window().maximize();
		 		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 	}

}