import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class D5selQ1 {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\rukku\\eclipse-workspace\\Sounder\\Selenium2\\driver\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
	
	driver.get("http://demo.guru99.com/test/drag_drop.html ");
	
	WebElement src1 = driver.findElement(By.id("credit2"));
	
	WebElement dest1 = driver.findElement(By.xpath("//ol[@id='bank']"));
	
	Actions a = new Actions(driver);
	
	a.dragAndDrop(src1, dest1).perform();
	
	WebElement src2 = driver.findElement(By.xpath("(//li[@class='block13 ui-draggable'])[1]"));
	
	WebElement dest2 = driver.findElement(By.id("amt7"));
	
	a.dragAndDrop(src2, dest2).perform();
	
	WebElement src3 = driver.findElement(By.id("credit1"));
	
	WebElement dest3 = driver.findElement(By.id("loan"));

    a.dragAndDrop(src3, dest3).perform();
    
    
    WebElement src4 = driver.findElement(By.xpath("(//li[@class='block13 ui-draggable'])[2]"));
    WebElement dest4 = driver.findElement(By.id("amt8"));

    a.dragAndDrop(src4, dest4).perform();
    
    
    
    


}

}
