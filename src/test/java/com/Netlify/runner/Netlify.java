package com.Netlify.runner;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(features =".\\src\\test\\java\\com\\Netlify\\feature\\Booking.feature",
glue="com.netlify1.stepdefinition")

public class Netlify {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void browserlaunch() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public static void browserclose() {
		driver.close();
	}

//	public static void main(String[] args) {	No need Main method for junit framework	
//	}

}
