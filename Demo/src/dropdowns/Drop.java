package dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drop 
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\latestdrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_1");
		
		driver.findElement(By.xpath("//button[@class='multiselect dropdown-toggle btn btn-default']")).click();
		WebElement header = driver.findElement(By.xpath("//ul[@class='multiselect-container dropdown-menu']"));
		List<WebElement> items = header.findElements(By.xpath("//label[@class='checkbox']"));
		for(int i=0;i<items.size();i++)
		{
			if(items.get(i).getText().equals("HTML"))
			{
				items.get(i).click();
				break;
			}
			
			
			
		}
		
	}

}
