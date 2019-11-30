import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class D5selQ3 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rukku\\eclipse-workspace\\Sounder\\Selenium2\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	driver.get("https://www.flipkart.com/");		
	
	WebElement close = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
	close.click();
	
	WebElement dgom1 = driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
	
		Actions a = new Actions(driver);
		
		a.moveToElement(dgom1).perform();
		
		WebElement cbtn = driver.findElement(By.xpath("(//a[text()='Chairs'])[1]"));
		cbtn.click();
		
		Thread.sleep(5000);
		
		WebElement click1 = driver.findElement(By.xpath("(//img[@class='_1Nyybr  _30XEf0'])[1]"));
		click1.click();
		
		Thread.sleep(10000);
		WebElement click2 = driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']"));
		click2.click();
		
		
	}

}
