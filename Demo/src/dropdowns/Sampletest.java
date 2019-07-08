package dropdowns;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sampletest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ramer\\Desktop\\selenium documents\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Select d =new Select(driver.findElement(By.id("day")));
	//	d.selectByValue("5");
		d.selectByIndex(8);
		d.selectByVisibleText("10");
		driver.findElement(By.id("day")).sendKeys("5");
		Select m =new Select(driver.findElement(By.id("month")));
		m.selectByIndex(2);
}
}