package qa.Definitions;

import common.qa.config.DriverClass;
import common.qa.pages.LogIn_Page_OR;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogIn_Defin extends DriverClass {

	LogIn_Page_OR logIn_OR = new LogIn_Page_OR(driver);

	@Given("User on web page as {string}")
	public void user_on_web_page_as(String url) {
		driver.get(url);
	}
	
	

	@When("User Click on Log_in Link")
	public void user_click_on_log_in_link() {

		logIn_OR.lnk_Login.click();
	}

	@When("User enter valid Credentials")
	public void user_enter_valid_credentials() {
		logIn_OR.fill_log_in();
	}

	@Then("Verify user able to logged-in.")
	public void verify_user_able_to_logged_in() {

		if (logIn_OR.lnk_LogOut.isEnabled()) {
			System.out.println("User successfully logged in");
		}
	}

}
