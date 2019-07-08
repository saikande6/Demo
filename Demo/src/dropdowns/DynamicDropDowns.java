package dropdowns;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDowns {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ramer\\Desktop\\selenium documents\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.goindigo.in/?linkNav=home_header");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.name("passenger")).click();
		  
		/*int i=1;

		while(i<5)

		{

		driver.findElement(By.xpath("//*[@id=\"bookFlightTab\"]/form/div[5]/div[1]/div[2]/ul/li[1]/div/button[2]/span")).click();

		i++;

		}*/

		  
		   //driver.findElement(By.xpath("//*[@id=\"bookFlightTab\"]/form/div[5]/div[1]/div[2]/div/button").click();
		  
		   //System.out.println(driver.findElement(By.xpath("//*[@id=\"bookFlightTab\"]/form/div[5]/div[1]/div[2]/ul/li[1]/div/button[2]/span")).getText());
	
		for(int i1=1;i1<5;i1++)

		{

	           driver.findElement(By.xpath("//*[@id=\"bookFlightTab\"]/form/div[5]/div[1]/div[2]/ul/li[1]/div/button[2]/span")).click();

		}
	

	//	driver.findElement(By.cssSelector("#bookFlightTab > form > div.row.justify-content-around.bw-mobile.ie-justify-pass-cur > div.col-sm-5.col-5.padd-left.pax-selection-container > div.passenger-dropdown.pax-selection-row > div > button")).click();

}
}