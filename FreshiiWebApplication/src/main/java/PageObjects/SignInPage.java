package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage {
	
	public WebDriver driver;
	public SignInPage(WebDriver driver1) {
		this.driver = driver1;
	}
	
	By emailBox = By.name("email");
	By passwordBox = By.name("password");
	By forgotPasswordLink = By.xpath("//a[@qaattr='forgotPass']");
	By signInBtn = By.xpath("//button[@qaattr='commonButtonsSignIn']");
	By signUpBtn = By.xpath("//button[@qaattr='signup']");
	By googleBtn = By.xpath("//button/picture/img[@alt='Google']");
	
	public WebElement EmailBox() {
		return driver.findElement(emailBox);
	}
	
	public WebElement PasswordBox() {
		return driver.findElement(passwordBox);
	}
	
	public WebElement ForgotPasswordLink() {
		return driver.findElement(forgotPasswordLink);
	}
	
	public WebElement SignInBtn() {
		return driver.findElement(signInBtn);
	}
	
	public WebElement SignUpBtn() {
		return driver.findElement(signUpBtn);
	}
	
	public WebElement GoogleBtn() {
		return driver.findElement(googleBtn);
	}
	
	
}
