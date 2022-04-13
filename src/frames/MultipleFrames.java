package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleFrames {
	@Test

	public void FramesDemo() {
		
		System.setProperty("webdriver.chrome.driver","D:\\DXC Selenium Class\\Locators In Selenium\\SeleniumBrowserJars4\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/91620/Downloads/frame.html");
		
		int totalnoframes = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Number of Frames....." + totalnoframes);
		
		driver.switchTo().frame("easycalculation");
		driver.get("https://www.login.hiox.com/login?referrer=easycalculation.com");
		
		driver.findElement(By.id("log_email")).sendKeys("6205843976");
		driver.findElement(By.id("log_password")).sendKeys("saurabh123");
		driver.findElement(By.xpath("//*[@id=\"log_frm\"]/div[4]/input[1]"));
		
}
}
