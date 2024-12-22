package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
		WebDriver driver ;
		public Homepage(WebDriver driver){
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		    @FindBy(xpath = "//li[@class='nav-item active']//a[@class='nav-link']")
		    WebElement homepageNavigationLink;
		
		    @FindBy(xpath = "//span[@class='carousel-control-next-icon']")
		    WebElement homepageCursor;
		    public void clickHomepageNavigationLink() {
		        homepageNavigationLink.click();
		    }
		    public void clickHomepageCursor() {
		        homepageCursor.click();
		    }
}
