package qa.Definitions;

import static org.testng.Assert.assertEquals;


import org.openqa.selenium.interactions.Actions;

import common.qa.config.DriverClass;
import common.qa.pages.Search_Page_OR;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search_Defini extends DriverClass {

	Actions action=new Actions(driver);
	Search_Page_OR searchRepo=new Search_Page_OR(driver);

	@When("Srearch for main as Categories Women and SubCategories as T-shirts")
	public void srearch_for_main_as_categories_women_and_sub_categories_as_t_shirts() {
		
		action.moveToElement(searchRepo.lnk_women).perform();
		searchRepo.lnk_Sub_TShirts.click();
	   
	}

	@When("Srearch for main as Categories Women and SubCategories as Evening Dresses")
	public void srearch_for_main_as_categories_women_and_sub_categories_as_evening_dresses() {

		action.moveToElement(searchRepo.lnk_women).perform();
		searchRepo.lnk_Sub_Even_Dresses.click();

	}

	@When("Srearch for main as Categories Dresses and SubCategories as Summer Dresses")
	public void srearch_for_main_as_categories_dresses_and_sub_categories_as_summer_dresses() {
		
		action.moveToElement(searchRepo.lnk_Dresses).perform();
		searchRepo.lnk_Sub_Summer_Dresses.click();

	}

	@When("Srearch for main as Categories T-shirts and")
	public void srearch_for_main_as_categories_t_shirts_and() {
		
		searchRepo.lnk_TShirts.click();
        
	}
	
	
	@Then("Verify page Title {string}")
	public void verify_page_title(String title) {
		System.out.println(driver.getTitle());
		assertEquals(driver.getTitle(), title); 
	    
	}
}
