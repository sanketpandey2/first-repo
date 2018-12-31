package proj1;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.event.KeyEvent;	





public class Class1 {
	
	public static void main(String[] args) throws AWTException  {
		
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
	
	WebDriver  driver=new ChromeDriver();
	Robot robot = new Robot();
	
	driver.get("https://www.google.com");
	
	driver.findElement(By.name("q")).sendKeys("123");
	robot.keyPress(KeyEvent.VK_ENTER);
	//driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	
	//driver.findElement(By.id("gsr")).click(); 
	
	//driver.close();
	
	
	
	}


}


