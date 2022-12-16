package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AfterSignIn {
	WebDriver driver;
	public AfterSignIn(WebDriver driver1) {
		this.driver = driver1;
	}
	
	By userProfile = By.xpath("//button[@qaattr='userProfile']");
	By accountDetails = By.xpath("//a[@qaattr='details']");
	By orderHistory = By.xpath("//a[@qaattr='orderHistory']");
	By paymentMethods =  By.xpath("//a[@qaattr='payMethod']");
	By giftCards = By.xpath("//a[@qaattr='giftCards']");
	By logOutBtn = By.xpath("//button[@qaattr='logout']");
	
	public WebElement UserProfile() {
		return driver.findElement(userProfile);
	}
	
	public WebElement AccountDetails() {
		 driver.findElement(userProfile).click();;
		 return driver.findElement(accountDetails);
	}
	
	public WebElement OrderHistory() {
		 driver.findElement(userProfile).click();;
		 return driver.findElement(orderHistory);
	}
	
	public WebElement PaymentMethods() {
		 driver.findElement(userProfile).click();;
		 return driver.findElement(paymentMethods);
	}
	
	public WebElement GiftCards() {
		 driver.findElement(userProfile).click();;
		 return driver.findElement(giftCards);
	}
	
	public WebElement LogOutBtn() {
		 driver.findElement(userProfile).click();;
		 return driver.findElement(logOutBtn);
	}
	
} 
