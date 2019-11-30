import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D5selQ2 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\rukku\\eclipse-workspace\\Sounder\\Selenium2\\driver\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.get("https://www.amazon.in/");
WebElement sel1 = driver.findElement(By.id("nav-hamburger-menu"));

sel1.click();
WebElement drop1 = driver.findElement(By.xpath("//a[@data-menu-id='7']"));
//Thread.sleep(10000);
drop1.click();



//Thread.sleep(10000);
WebElement drop2 = driver.findElement(By.xpath("href=\"/gp/browse.html?node=6612025031&ref_=nav_em_T1_0_4_NaN_5_sbc_mobcomp_powerbank"));
drop2.clear();




}
}
