package stepDefinitions;


import static org.testng.Assert.assertTrue;
import java.time.Duration;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageObject.Homepage;
import pageObject.LoginPage;


public class LoginStep {

	WebDriver driver;
	
	LoginPage login;
	Homepage homepage;
	
	@Before
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		login = new LoginPage(driver);
		homepage = new Homepage(driver);
		
	}

	@After
	public void tearDown() {
		
		driver.quit();
		
	}
	@Given("I launch browser and navigate to the login page")
	public void i_launch_browser_and_navigate_to_the_login_page() {
		driver.get("https://www.demoblaze.com/index.html");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	@When("I enter valid username {string} into username field")
	public void i_enter_valid_username_into_username_field(String string) {	     
	    login.setUsername(string);
	}

	@And("I enter valid password {string} into password field")
	public void i_enter_valid_password_into_password_field(String string) {
		login.setPassword(string);
	}

	@And("I click on login button")
	public void i_click_on_login_button() {
		login.clickOnLogin();
	}

	@Then("i successfully login")
	public void i_successfully_login() {
	    Assert.assertTrue(driver.getCurrentUrl().contains("index.html"));
	}
	
	
	@When("I enter invalid username {string} into username field")
	public void i_enter_invalid_username_into_username_field(String string) {
		login.setUsername(string);
	}

	@When("I enter invalid password {string} into password field")
	public void i_enter_invalid_password_into_password_field(String string) {
		login.setPassword(string);
	}

	@When("I click on login  button to login")
	public void i_click_on_login_button_to_login() {
		login.clickOnLogin();
		
	}

	@Then("i should not be successfully login and get an error")
	public void i_should_not_be_successfully_login_and_get_an_error() {
		Alert alert = driver.switchTo().alert();
        alert.accept();
		
	}
	
	@When("I click the homepage navigation link")
    public void i_Click_The_Homepage_Navigation_Link() {
        homepage.clickHomepageNavigationLink();
    }

    @When("I click the homepage cursor")
    public void iClickTheHomepageCursor() {
        homepage.clickHomepageCursor();
    }

    @Then("all functionality should work properly")
    public void allFunctionalityShouldWorkProperly() {
        String currentUrl = driver.getCurrentUrl();
        //assertTrue(currentUrl.contains("index.html"), "Homepage navigation failed.");
        Assert.assertTrue(currentUrl.contains("index.html"));
    }
	

//		
	}
