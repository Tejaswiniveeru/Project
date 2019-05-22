package com.zephyr.stepdefinition;

import com.zephyr.common.AutomationConstants;
import com.zephyr.common.LaunchBrowser;
import com.zephyr.generic.Property_Lib;
import com.zephyr.reusablemethods.LoginPage;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC_1 extends LaunchBrowser{

	public LaunchBrowser l1;
@Given("^Tester is in the Phase of Test Repository Page$")
public void tester_is_in_the_Phase_of_Test_Repository_Page() throws Throwable {
   
	l1=new LaunchBrowser();
	l1.preCond();
	String url=Property_Lib.getPropertyValue(AutomationConstants.CONFIG_PATH+CONFIG_FILE, "URL");
	l1.getUrl(url);
	
	
			
}

@When("^Tester click on Add button$")
public void tester_click_on_Add_button() throws Throwable {
	LoginPage lp=new LoginPage(driver);
	lp.enterUname("raj");
	lp.enterPass("raj");
	lp.clickOnLogin();
}

@When("^Enters Multiple Tags$")
public void enters_Multiple_Tags() throws Throwable {
    
    throw new PendingException();
}

@Then("^New Test Case Should be Added With Multiple Tags$")
public void new_Test_Case_Should_be_Added_With_Multiple_Tags() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}


}
