package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='loginusername']")
	WebElement Username;
	
	@FindBy(xpath = "//input[@id='loginpassword']")
	WebElement password;
	
	@FindBy(xpath = "//button[normalize-space()='Log in']")
	WebElement loginbtn;
	
	public void setUsername(String str) {
	Username.sendKeys(str);
	}
	public void setPassword(String str) {
	password.sendKeys(str);
	}

	public void clickOnLogin() {
	loginbtn.click();
}
	
}