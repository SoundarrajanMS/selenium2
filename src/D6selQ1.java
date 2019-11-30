import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.glass.events.KeyEvent;

public class D6selQ1 {
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\rukku\\eclipse-workspace\\Sounder\\Selenium2\\driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	Thread.sleep(5000);
	WebElement inputemail = driver.findElement(By.xpath("//input[@id='email']"));
	
	inputemail.sendKeys("123355");
	Actions mouse = new Actions(driver);
	mouse.doubleClick(inputemail).contextClick(inputemail).build().perform();
	
	Robot kbd = new Robot();
	
	kbd.keyPress(KeyEvent.VK_DOWN);
	kbd.keyRelease(KeyEvent.VK_DOWN);
	
	//kbd.keyPress(KeyEvent.VK_DOWN);
	//kbd.keyRelease(KeyEvent.VK_DOWN);
	
	kbd.keyPress(KeyEvent.VK_ENTER);
	kbd.keyRelease(KeyEvent.VK_ENTER);
	
	kbd.keyPress(KeyEvent.VK_TAB);
	kbd.keyRelease(KeyEvent.VK_TAB);
	
	kbd.keyPress(KeyEvent.VK_CONTROL);
	kbd.keyPress(KeyEvent.VK_V);
	
	kbd.keyRelease(KeyEvent.VK_CONTROL);
	kbd.keyRelease(KeyEvent.VK_V);
	
	
	
}
}
