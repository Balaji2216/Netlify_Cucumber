package com.BaseClassMethods;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver browserlaunch(String browsername) {

		if (browsername.equalsIgnoreCase("Chrome")) {

			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();

		} else if (browsername.equalsIgnoreCase("firefox")) {

			WebDriverManager.firefoxdriver().setup();

			driver = new FirefoxDriver();

		}

		else if (browsername.equalsIgnoreCase("edge")) {

			WebDriverManager.edgedriver().setup();

			driver = new EdgeDriver();

		}

		driver.manage().window().maximize();

		return driver;
	}

	public static void geturl(String url) {

		driver.get(url);

		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);

	}
	
	public void toclick(WebElement element) {
		
		element.click();

	}
	
	public void gettext(WebElement element) {
		
		String text = element.getText();

	}
	
	public static void browserclose() {

		driver.close();
	}

}
