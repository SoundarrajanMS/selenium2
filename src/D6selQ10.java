import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.glass.events.KeyEvent;

public class D6selQ10 {
public static void main(String[] args) throws AWTException, Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\rukku\\eclipse-workspace\\Sounder\\Selenium2\\driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

driver.get("https://www.amazon.in/");

WebElement signin = driver.findElement(By.xpath("(//span[text()='Sign in'])[3]"));


signin.click();

WebElement inputmail = driver.findElement(By.id("ap_email"));
inputmail.sendKeys("9965105007");

Actions mse = new Actions(driver);
mse.doubleClick(inputmail).perform();

Robot r = new Robot();
r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_C);
r.keyRelease(KeyEvent.VK_C);
r.keyRelease(KeyEvent.VK_CONTROL);	


r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);

Thread.sleep(1000);
WebElement pass = driver.findElement(By.id("ap_password"));
pass.click();
r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_V);	
r.keyRelease(KeyEvent.VK_V);
r.keyRelease(KeyEvent.VK_CONTROL);















}
}
