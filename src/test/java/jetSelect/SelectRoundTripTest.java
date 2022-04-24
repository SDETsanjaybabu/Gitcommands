package jetSelect;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectRoundTripTest {

	public static void main(String[] args) throws Throwable 
	{
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//div[@data-testid='round-trip-radio-button']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Bengaluru')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Belagavi Airport')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-testid='departure-date-dropdown-label-test-id']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-testid='undefined-month-April-2022']//descendant::div[@data-testid='undefined-calendar-day-29']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-testid='return-date-dropdown-label-test-id']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-testid='undefined-month-May-2022']//descendant::div[@data-testid='undefined-calendar-day-29']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']/*[name()='svg']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Currency')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='INR' and @class='css-76zvg2 r-homxoj r-ubezar']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Family & Friends')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta']")).click();
		Thread.sleep(5000);
		driver.close();
		
		
	}

}
