package common.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Page_OR {

	@FindBy (xpath = "//a[contains(text(),'Women')]") public WebElement lnk_women;
	@FindBy (xpath = "//a[contains(text(),'T-shirts')]") public WebElement lnk_Sub_TShirts;
	@FindBy (xpath = "//a[contains(text(),'Evening Dresses')]") public WebElement lnk_Sub_Even_Dresses;
	@FindBy (xpath = "(//a[contains(text(),'Dresses')])[5]") public WebElement lnk_Dresses;
	@FindBy (xpath = "(//a[contains(text(),'Summer Dresses')])[2]") public WebElement lnk_Sub_Summer_Dresses;
	@FindBy (xpath = "(//a[contains(text(),'T-shirts')])[2]") public WebElement lnk_TShirts;

	
	public Search_Page_OR(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
