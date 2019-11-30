import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.glass.events.KeyEvent;

public class D6selQ2 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\rukku\\eclipse-workspace\\Sounder\\Selenium2\\driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.google.co.in/webhp");
	
	WebElement button1 = driver.findElement(By.xpath("//a[@title='Google apps']"));
     button1.click();
     Robot kbd = new Robot ();
     
     Thread.sleep(10000);
     
     for(int i=0;i<6;i++) {
     
     kbd.keyPress(KeyEvent.VK_TAB);
     kbd.keyRelease(KeyEvent.VK_TAB);
     }
     
     kbd.keyPress(KeyEvent.VK_ENTER);
  
    		 
     
     
	
	
}
}
