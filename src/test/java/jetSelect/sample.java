package jetSelect;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sample {

	public static void main(String[] args) throws AWTException, MalformedURLException {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		option.addArguments("--Disable-notifications");
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://www.google.com");
		WebElement ele = driver.findElement(By.xpath("//a[.='Gmail']"));
		Actions act=new Actions(driver);
		act.contextClick(ele).perform();
		
		
//	
		
		
	}

}
