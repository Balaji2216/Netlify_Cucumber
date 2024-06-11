package com.netlify1.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Netlify.runner.Netlify;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition {
	
	WebDriver driver = Netlify.driver;
	
	@Given("User needs to launch the Netlifybrowser.")
	public void user_needs_to_launch_the_netlifybrowser() {
		driver.get("https://commercejs-demo-store.netlify.app");
	}

	@When("User selects Shopnow option")
	public void user_selects_shopnow_option() {
		driver.findElement(By.linkText("Shop now")).click();	    
	}

	@When("Select Products under Hair Products options")
	public void select_products_under_hair_products_options() {
		driver.findElement(By.xpath("(//p[contains(@class,'mb-2 ')])[2]")).click();		
	}

	@When("Select Hair beauty bath product")
	public void select_hair_beauty_bath_product() {
		driver.findElement(By.xpath("//p[contains(text(),'Hair Beauty Bath')]")).click();
	}

	@When("Click on Add to Cart button")
	public void click_on_add_to_cart_button() {
		driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
	}

	@When("Click on cart button once product visible after selecting")
	public void click_on_cart_button_once_product_visible_after_selecting() {
WebDriverWait wait=new WebDriverWait(driver,10);
WebElement until = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='cart-animation']")));
		until.click();
	}

	@When("Click on Checkout button")
	public void click_on_checkout_button() {
		driver.findElement(By.xpath("//a[contains(text(),'Checkout')]")).click();
	}

	@When("Select Shipping button on Cart checkout page")
	public void select_shipping_button_on_cart_checkout_page() {
WebElement element = driver.findElement(By.xpath("//select[@name='fulfillment[shipping_method]']"));
		element.click();
		Select s=new Select(element);
		s.selectByValue("ship_8XxzoB4AglPQAZ");	
	}

	@When("Click on Make payment option once visibled")
	public void click_on_make_payment_option_once_visibled() {
		driver.findElement(By.xpath("//button[contains(text(),'Make payment')]")).click();
	}

	@Then("Print the receipt number for the selected product.")
	public void print_the_receipt_number_for_the_selected_product() {
WebElement element3 = driver.findElement(By.xpath("//p[@class='font-color-light mb-2']"));
		String text = element3.getText();
		System.out.println(text);
	}

}


