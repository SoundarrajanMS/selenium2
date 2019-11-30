import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D4selQ11 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\rukku\\eclipse-workspace\\Sounder\\Selenium2\\driver\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
	
	driver.get("https://www.snapdeal.com/");
	
	WebElement select1 = driver.findElement(By.xpath("(//div[@class='product_name'])[6]"));
	
	select1.click();
	 
	Thread.sleep(10000);
	
	WebElement add1 = driver.findElement(By.xpath("//div[@id='add-cart-button-id']"));
	add1.click();
	
	
}
}
