import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.glass.events.KeyEvent;

public class D6selQ7 {
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rukku\\eclipse-workspace\\Sounder\\Selenium2\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	
	driver.get("http://greenstech.in/selenium-course-content.html");
	
	WebElement select1 = driver.findElement(By.xpath("//b[text()='Wrapper Classes:']"));
	
	Actions mse = new  Actions (driver);
	
	mse.doubleClick(select1).perform();
	
	Robot kbd  = new Robot();
	
	kbd.keyPress(KeyEvent.VK_SHIFT);

}}