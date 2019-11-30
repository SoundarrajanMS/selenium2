import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.glass.events.KeyEvent;

public class D7selQ7 {
public static void main(String[] args) throws AWTException, Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rukku\\eclipse-workspace\\Sounder\\Selenium2\\driver\\chromedriver.exe");

WebDriver driver = new ChromeDriver();
driver.navigate().to("https://www.flipkart.com/");
WebElement close = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
close.click();
WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
search.sendKeys("iphone");

Thread.sleep(2000);

Robot kbd = new Robot();

kbd.keyPress(KeyEvent.VK_ENTER);
kbd.keyRelease(KeyEvent.VK_ENTER);

driver.manage().window().maximize();

Thread.sleep(5000);
TakesScreenshot ts = (TakesScreenshot)driver;

File src = ts.getScreenshotAs(OutputType.FILE);
File dest = new File("C:\\Users\\rukku\\eclipse-workspace\\Sounder\\Selenium2\\Screenshot1.png");
FileUtils.copyFile(src, dest);
driver.navigate().refresh();


















}
}
