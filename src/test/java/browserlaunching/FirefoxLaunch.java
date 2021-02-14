package browserlaunching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxLaunch {
	public static void main(String[] args) {
//		System.setProperty("webdriver.gecko.driver", "E:\\Drivers\\geckodriver-v0.27.0-win64\\geckodriver.exe");
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
//		driver.get("https://www.facebook.com/");
		driver.get("https://www.goibibo.com/");

		driver.findElement(By.id("get_sign_in")).click();

		driver.switchTo().frame("authiframe");

		driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("7845126898");
	}

}
