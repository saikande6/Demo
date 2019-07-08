package linktesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ramer\\Desktop\\selenium documents\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://gmail.com");
		driver.manage().window().maximize();
	//System.out.println( driver.getCurrentUrl());	
	//System.out.println( driver.getTitle());	
	//System.out.println( driver.getPageSource());
	//System.out.println( driver.getWindowHandle());
	//driver.close();
	
		driver.findElement(By.id("identifierId")).sendKeys("jyothsna@ramersoft.com");
		/*String classname = driver.findElement(By.id("identifierId")).getText();
		System.out.println(classname);*/
		

WebElement textIndiaWebElement= driver.findElement(By.id("identifierId"));
String innerText= textIndiaWebElement.getText();
System.out.println("Inner text is :"+innerText);

		/*driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("ramer@143");
	   // driver.findElement(By.linkText("Forgotten account?")).click();
		//driver.quit();
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"gb\"]/div[2]/div[3]/div/div[2]/div[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"gb_71\"]")).click();*/

	
	}

}
