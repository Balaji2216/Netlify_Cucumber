package com.Netlify.runner;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.BaseClassMethods.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaNetlify extends BaseClass {

	public static void main(String[] args) throws InterruptedException  {

//		WebDriverManager.chromedriver().setup();
//		
//		WebDriver driver=new ChromeDriver();
//		
//		driver.manage().window().maximize();
		
		browserlaunch("chrome");

		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		 
		driver.get("https://commercejs-demo-store.netlify.app");
		
//		driver.findElement(By.xpath("(//div[contains(@class,'hero-slide d-flex align-items')]//a[contains(text(),'Shop now')])[1]")).click();
		
		driver.findElement(By.linkText("Shop now")).click();
		
		driver.findElement(By.xpath("(//p[contains(@class,'mb-2 ')])[2]")).click();		
		
		driver.findElement(By.xpath("//p[contains(text(),'Hair Beauty Bath')]")).click();
				
		driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		
//		WebElement element2 = driver.findElement(By.xpath("//div[@class='cart-animation']"));
//		wait.until(ExpectedConditions.visibilityOf(element2));
//		element2.click();
		
		WebElement until = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='cart-animation']")));
		
		until.click();
		
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Checkout')]")).click();
		
		WebElement element = driver.findElement(By.xpath("//select[@name='fulfillment[shipping_method]']"));
		
		element.click();
		
		Select s=new Select(element);
		
		s.selectByValue("ship_8XxzoB4AglPQAZ");	
		
		driver.findElement(By.xpath("//button[contains(text(),'Make payment')]")).click();
		
		WebElement element3 = driver.findElement(By.xpath("//p[@class='font-color-light mb-2']"));
		
		String text = element3.getText();
		
		System.out.println(text);
		
		driver.close();
		
	}

}
