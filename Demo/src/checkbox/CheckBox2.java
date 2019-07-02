package checkbox;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class CheckBox2 {
	
WebDriver driver;
@BeforeMethod
	public void beforeMethod() 
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\latestdrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://echoecho.com/htmlforms09.htm");
	}



  @Test
  public void checkboxTest()
	{
		 List<WebElement> check = driver.findElements(By.xpath("//td[@class='table5']/input[@type='checkbox']"));
		for(int i=0;i<check.size();i++)
		{
			if(!check.get(i).isSelected())
			{
				check.get(i).click();
			}
		}
	}
  

  @AfterMethod
  public void afterMethod() 
  {
	  //driver.quit();
  }

}
