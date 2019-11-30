import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class D5selQ7 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rukku\\eclipse-workspace\\Sounder\\Selenium2\\driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("http://greenstech.in/selenium-course-content.html");
	
	WebElement mova1 = driver.findElement(By.xpath("//a[@href='courses.html']"));
	Actions a =new Actions(driver);
	
	a.moveToElement(mova1).perform();
	
	Thread.sleep(10000);
	WebElement mova2 = driver.findElement(By.xpath("//span[text()='Software Testing Training']"));
	a.moveToElement(mova2).perform();
	
	Thread.sleep(10000);
	WebElement mova3 = driver.findElement(By.xpath("//span[text()='Selenium Training']"));
	a.click().perform();
	
	 Thread.sleep(10000);
	WebElement print = driver.findElement(By.xpath("//p[contains(text(),'Facebook ')]"));
	
	String para = print.getText();
	System.out.println(para);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
