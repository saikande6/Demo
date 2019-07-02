package radiobutton;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\latestdrivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://echoecho.com/htmlforms10.htm");
		
		WebElement block=driver.findElement(By.xpath("(//td[@class='table5'])[2]"));
		for(int k=1;k<3;k++)
		{
			List<WebElement> radio=block.findElements(By.name("group"+k));
			for(int i=0;i<radio.size();i++)
			{
				radio.get(i).click();
				
				for(int j=0;j<radio.size();j++)
				{
					System.out.println(radio.get(j).getAttribute("value")+"--"+radio.get(j).getAttribute("checked"));
					//boolean s=radio.get(j).isSelected();
					//System.out.println(s);
					Thread.sleep(3000);
					
				}
			}
		}
	}
}
