package jetSelect;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class walmart {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
//		driver.get("https://google.co.in");
//		driver.manage().window().maximize();
//		driver.findElement(By.name("q")).sendKeys("walmart.com", Keys.ENTER);
//		driver.findElement(By.xpath("//a[@href='https://www.walmart.com/']")).click();
//		
		
		driver.get("https://www.walmart.com");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.xpath("//div[@aria-label='Press & Hold']//p[.='Press & Hold']"));
		String text = ele.getText();
		System.out.println(text);
//		Actions actions = new Actions(driver);
//		actions.moveToElement(ele);
//		actions.clickAndHold().perform();
//		Thread.sleep(6000);
		driver.close();
	}
}
