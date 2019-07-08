package dropdowns;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdowns {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ramer\\Desktop\\selenium documents\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Select adult = new Select(driver.findElement(By.id("adult-travelers")));
		//adult.selectByVisibleText("");
		//adult.selectByIndex(4);
		Select d =new Select(driver.findElement(By.id("day")));
		d.selectByValue("5");
		Select m =new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
		m.selectByIndex(5);
	//	m.selectByValue("6");
		Select y =new Select(driver.findElement(By.xpath("//*[@id=\"year\"]")));
		y.selectByIndex(8);
	
	}
	
	
}