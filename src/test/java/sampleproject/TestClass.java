package sampleproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass {
	public static WebDriver driver;
	
	@Test
	public static void launch() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");

		WebDriver driver = new ChromeDriver(options);
//		driver.get("https://automateNow.io");
		driver.get("https://google.com");
		driver.quit();

	}

}
