package utilities;

import org.testng.annotations.Test;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class MultipleWindowsClass{
	@Test
	public void testMultipleWindows() throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\latestdrivers\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("http://www.naukri.com/");
	// It will return the parent window name as a String
	String mainWindow=driver.getWindowHandle();
	// It returns no. of windows opened by WebDriver and will return Set of Strings
	Set<String> set =driver.getWindowHandles();
	// Using Iterator to iterate with in windows
	Iterator<String> itr= set.iterator();
	while(itr.hasNext()){
		String childWindow=itr.next();
	   	// Compare whether the main windows is not equal to child window. If not equal, we will close.
		if(!mainWindow.equals(childWindow)){
		driver.switchTo().window(childWindow);
		System.out.println(driver.switchTo().window(childWindow).getTitle());
		driver.close();
		}
	}
	// This is to switch to the main window
	driver.switchTo().window(mainWindow);
	Thread.sleep(6000);
	/*Alert alert = driver.switchTo().
	alert.dismiss();*/	
	String alertText = "Share your location with Naukri.com for more relevant jobs";
	WebDriverWait wait = new WebDriverWait(driver, 5);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("geoLocPopUp")));
	WebElement popup = driver.findElement(By.id("geoLocPopUp"));  
	alertText = popup.getText();
	System.out.println( alertText);
	driver.findElement(By.id("allow")).click();
	
	String alertText1 = "Share your location with Naukri.com for more relevant jobs";
	WebDriverWait wait1 = new WebDriverWait(driver, 5);
	wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("pushPopup")));
	WebElement popup1 = driver.findElement(By.id("pushPopup"));  
	alertText = popup1.getText();
	System.out.println( alertText1);
	driver.findElement(By.id("allow")).click();
	
	}

	
}