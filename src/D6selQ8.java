import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D6selQ8 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\rukku\\eclipse-workspace\\Sounder\\Selenium2\\driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

driver.get("http://greenstech.in/selenium-course-content.html");
WebElement btn1 = driver.findElement(By.xpath("//a[text()='Download Links click here']"));
btn1.click();







}
}
