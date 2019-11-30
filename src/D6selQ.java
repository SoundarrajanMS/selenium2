import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.glass.events.KeyEvent;

public class D6selQ {
public static void main(String[] args) throws AWTException, Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\rukku\\eclipse-workspace\\Sounder\\Selenium2\\driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

driver.get("http://greenstech.in/selenium-course-content.html");



WebElement selwhole = driver.findElement(By.xpath("//div[@id='pageHeader']"));



Actions mse = new Actions(driver);


mse.contextClick(selwhole).perform();

Robot kbd = new Robot();
for(int i=0;i<3;i++) {
kbd.keyPress(KeyEvent.VK_DOWN);
kbd.keyRelease(KeyEvent.VK_DOWN);
}
kbd.keyPress(KeyEvent.VK_ENTER);






















}
}
