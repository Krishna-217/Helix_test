package common.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn_Page_OR {

	
	@FindBy (xpath = "//a[@class='login']") public WebElement lnk_Login;
	@FindBy (xpath = "//input[@id='email']") public WebElement tf_Username;
	@FindBy (xpath = "//input[@id='passwd']") public WebElement tf_Password;
	@FindBy (xpath = "//button[@id='SubmitLogin']") public WebElement btn_Login;
	@FindBy (xpath = "//a[@class='logout']") public WebElement lnk_LogOut;

	
	
	public LogIn_Page_OR(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void fill_log_in()
	{
		
		tf_Username.sendKeys("autotest@helix-int.com");
		tf_Password.sendKeys("12345");
		btn_Login.click();
		
	}
}
