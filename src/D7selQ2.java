import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D7selQ2 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rukku\\eclipse-workspace\\Sounder\\Selenium2\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://greenstech.in/selenium-course-content.html");

		WebElement fstpge = driver.findElement(By.xpath("//a[text()='HTC Global Services']"));

		Thread.sleep(5000);
		fstpge.click();
		Thread.sleep(5000);

		driver.manage().window().maximize();

		Thread.sleep(5000);

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\rukku\\eclipse-workspace\\Sounder\\Selenium2\\Screenshot11.png");

		FileUtils.copyFile(src, dest);
		driver.navigate().refresh();

	}

}
