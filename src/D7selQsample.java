import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D7selQsample {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rukku\\eclipse-workspace\\Sounder\\Selenium2\\driver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.google.com/");
		 
		 WebElement btn1 = driver.findElement(By.xpath("//a[text()='Gmail']"));
		btn1.click();
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.navigate().back();
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().back();
		driver.navigate().refresh();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
