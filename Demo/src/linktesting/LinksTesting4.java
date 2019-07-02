package linktesting;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksTesting4 {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\latestdrivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://bbc.com");
		
		
		WebElement header=driver.findElement(By.xpath(".//*[@id='page']/section[6]/div/div/div[2]"));
		List<WebElement> links=header.findElements(By.tagName("a"));
		
		for(int i=0;i<links.size();i++)
		{
			//((RemoteWebDriver)driver).executeScript("window.scrollBy(0,2500)");
			System.out.println(links.get(i).getText());
			links.get(i).click();
			System.out.println(driver.getCurrentUrl());
			
			driver.navigate().back();
			Thread.sleep(5000);
			
			header=driver.findElement(By.xpath(".//*[@id='page']/section[6]/div/div/div[2]"));
			links=header.findElements(By.tagName("a"));
		}
		driver.quit();
	}
}
