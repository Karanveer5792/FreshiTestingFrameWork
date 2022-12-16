package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GiftCardsPage {
	WebDriver driver;
	public GiftCardsPage(WebDriver driver1) {
		this.driver=driver1;
	}
	
	By myGiftCards = By.xpath("//div[text()='My Gift Cards']");
	By sendGiftCard = By.xpath("//div[text()='Send Gift Card']");
	By addGiftCard = By.xpath("//button[text()='ADD GIFT CARD']");
	By enterGiftCardNumber = By.name("giftCardNumber");
	By addGiftCardBtn = By.xpath("//button[@qaattr='addGiftCard']");
	By addFunds = By.xpath("(//div[@role='tab'])[3]");
	By autoLoad = By.xpath("(//div[@role='tab'])[4]");
	
	
}
