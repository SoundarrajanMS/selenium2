import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.glass.events.KeyEvent;

public class D6selQ9 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\rukku\\eclipse-workspace\\Sounder\\Selenium2\\driver\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.get("https://www.flipkart.com/");

//WebElement btn1 = driver.findElement(By.xpath("//a[text()='Login & Signup']"));
//btn1.click();
Thread.sleep(5000);
WebElement pass = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
pass.sendKeys("9965105007");
Robot kbd = new Robot();
kbd.keyPress(KeyEvent.VK_SHIFT);
for(int i=0;i<10;i++) {
	kbd.keyPress(KeyEvent.VK_LEFT);
	kbd.keyRelease(KeyEvent.VK_LEFT);

}
kbd.keyRelease(KeyEvent.VK_SHIFT);
kbd.keyPress(KeyEvent.VK_CONTROL);
kbd.keyPress(KeyEvent.VK_X);
kbd.keyRelease(KeyEvent.VK_X);
kbd.keyRelease(KeyEvent.VK_CONTROL);
WebElement pass1 = driver.findElement(By.xpath("//input[@type='password']"));
pass1.click();

kbd.keyPress(KeyEvent.VK_CONTROL);
kbd.keyPress(KeyEvent.VK_V);
kbd.keyRelease(KeyEvent.VK_V);
kbd.keyRelease(KeyEvent.VK_CONTROL);










}
}
