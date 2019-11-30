import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class D6selQ3 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\rukku\\eclipse-workspace\\Sounder\\Selenium2\\driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://www.greenstechnologys.com/");
	
	WebElement para2 = driver.findElement(By.xpath("//p[contains(text(),'corporate exposure')]"));
   Actions a = new Actions(driver);
   a.doubleClick(para2).perform();
    a.click(para2).perform();





}
}
