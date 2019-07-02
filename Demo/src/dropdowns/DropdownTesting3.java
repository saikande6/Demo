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

public class DropdownTesting3 {

WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\latestdrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com");
	}
	
	
	
	@Test (priority = 0)
	public void itemSelection()
	{
		
		driver.findElement(By.linkText("REGISTER")).click();
		WebElement drop=driver.findElement(By.name("country"));
		
	    List<WebElement> dropdown=drop.findElements(By.tagName("option"));
	    for(int i=0;i<dropdown.size();i++)
	    {
		   dropdown.get(i).click();
		   if(dropdown.get(i).isSelected())
		   {
			   System.out.println(dropdown.get(i).getText()+" --> is Active");
		   }
		   else
		   {
			   System.out.println(dropdown.get(i).getText()+" --> is Inactive");
		   }
	   }  
	}
	
	
	
	
	@Test (priority = 1)
	public void itemSelection1()
	{
		driver.findElement(By.linkText("REGISTER")).click();
		WebElement drop=driver.findElement(By.name("country"));
		
		Select sel=new Select(drop);
		List<WebElement> items=sel.getOptions();
		for(int j=0;j<items.size();j++)
		{
			items.get(j).click();
			if(items.get(j).isSelected())
			   {
				   System.out.println(items.get(j).getText()+" --> is Active");
			   }
			   else
			   {
				   System.out.println(items.get(j).getText()+" --> is Inactive");
			   }
		}
	}
	
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	
}
