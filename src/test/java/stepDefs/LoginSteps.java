package stepDefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	WebDriver driver = BaseClass.driver;
	
	@Given("I have opened the application in browser")
	public void i_have_opened_the_application_in_browser() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.get("https://www.simplilearn.com/");
		Thread.sleep(2000);
	    
	}

	@When("I click on the Login link")
	public void i_click_on_the_login_link() {
	    // Write code here that turns the phrase above into concrete actions
		
		WebElement LoginLink = driver.findElement(By.linkText("Log in"));
		LoginLink.click();
	    
	}

	@When("I enter username")
	public void i_enter_username() {
	    // Write code here that turns the phrase above into concrete actions
		
		WebElement UserName = driver.findElement(By.name("user_login"));
		UserName.sendKeys("fgfdgfd@fgf.com");
	    
	}

	@When("I enter password")
	public void i_enter_password() {
	    // Write code here that turns the phrase above into concrete actions
		
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("Abcd@1234");
	    
	}

	@When("I click on the login Button")
	public void i_click_on_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		
		WebElement LoginButton = driver.findElement(By.name("btn_login"));
		LoginButton.click();
	    
	}

	@Then("I should be Landed on the home page")
	public void i_should_be_landed_on_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		
		System.out.println("Inside home page");
	    
	}

	@When("I enter username {string}")
	public void i_enter_username(String UserNameVal) {
	    // Write code here that turns the phrase above into concrete actions
		
		WebElement UserName = driver.findElement(By.name("user_login"));
		UserName.sendKeys(UserNameVal);
	    
	}

	@When("I enter password {string}")
	public void i_enter_password(String PasswordVal) {
	    // Write code here that turns the phrase above into concrete actions
		
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys(PasswordVal);
	    
	}
	
	@Then("I should get the error message as {string}")
	public void i_should_get_the_error_message_as(String ExpMsg) {
	    // Write code here that turns the phrase above into concrete actions
		
		WebElement ErrorMessage = driver.findElement(By.id("msg_box"));
		String ActualMsg = ErrorMessage.getText();
	    
		Assert.assertEquals(ExpMsg,ActualMsg);
	}
	
}
