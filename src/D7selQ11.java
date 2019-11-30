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

public class D7selQ11 {
public static void main(String[] args) throws Throwable {
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

WebElement click1 = driver.findElement(By.xpath("(//div[@class='_3wU53n'])[1]"));
click1.click();

Thread.sleep(10000);
driver.navigate().to("https://www.flipkart.com/apple-iphone-7-black-32-gb/p/itmen6daftcqwzeg?pid=MOBEMK62PN2HU7EE&srno=s_1_1&otracker=search&otracker1=search&lid=LSTMOBEMK62PN2HU7EEINTGNU&fm=SEARCH&iid=4afa048b-b33e-4ee4-857d-36d1e867cde3.MOBEMK62PN2HU7EE.SEARCH&ppt=sp&ppn=sp&ssid=oy89ej5a680000001573646866670&qH=0b3f45b266a97d70");

Thread.sleep(10000);

WebElement add1 = driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']"));


add1.click();

TakesScreenshot ts = (TakesScreenshot)driver;
Thread.sleep(10000);
File src = ts.getScreenshotAs(OutputType.FILE);
File dest = new File("C:\\Users\\rukku\\eclipse-workspace\\Sounder\\Selenium2\\Screensho\\moorthyks.png");
FileUtils.copyFile(src, dest);


}
}
