package dropdowns;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropdownTesting2 {

	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\latestdrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://amazon.in");
	}
	
	
	
	@Test
	public void amazonDropDown()
	{
		WebElement drop=driver.findElement(By.id("searchDropdownBox"));
		List<WebElement> dropdown=drop.findElements(By.tagName("option"));
		
		
		System.out.println(dropdown.size());
		for(int i=0;i<dropdown.size();i++)
		{
			System.out.println(dropdown.get(i).getText());
	    }
	}
		
		
	@Test
	public void amazonDropDown1() throws InterruptedException
	{
		WebElement drop=driver.findElement(By.id("searchDropdownBox"));
		Select sel=new Select(drop);		
		List<WebElement> items=sel.getOptions();
			
		
		System.out.println(items.size());
		for(int i=0;i<items.size();i++)
		{			
			System.out.println(items.get(i).getText());
		}
	}
	
	
		
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
}
