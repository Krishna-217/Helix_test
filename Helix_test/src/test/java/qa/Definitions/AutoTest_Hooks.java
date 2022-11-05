package qa.Definitions;

import common.qa.config.DriverClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AutoTest_Hooks {

	@Before
	public void beforeScenario()
	{
		
		DriverClass.setUp();
	}
	@After
	public void afterScenario()
	{
		
		DriverClass.tearDown();
	}
}
