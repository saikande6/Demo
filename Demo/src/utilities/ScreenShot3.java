package utilities;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot3 {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\latestdrivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//driver.get("http://newtours.demoaut.com");
		driver.get("https://www.theguardian.com/technology/2008/mar/09/blogs");
		//driver.get("http://google.com");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++)
		{
			if(!links.get(i).getText().isEmpty())
			{
			   String linkname=links.get(i).getText();
			   links.get(i).click();
			   File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			   FileUtils.copyFile(srcFile,new File("C:\\Users\\ramer\\Desktop\\Screenshots\\"+linkname+".jpeg"));
			   driver.navigate().back();
			   links=driver.findElements(By.tagName("a"));
		    }
		}
	}
}
