package baseMainTests;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import yunuso.Maven01.LandingPage;

@RunWith(Cucumber.class)
public class MainTest{
	
		@Given("Visiting the {string} first")
		public void visiting_the_first(String string) {
			
			
	    }

	    @When("^Logging in with credentials of \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void logging_in_with_credentials_of_something_and_something(String strArg1, String strArg2) throws Throwable {
	    	System.out.println("Success logged in");
	    }

	    @Then("^Verify the login$")
	    public void verify_the_login() throws Throwable {
	    	System.out.println("Success verification");
	    }

	    @And("^close all browsers$")
	    public void close_all_browsers() throws Throwable {
	    	System.out.println("Success closing all pages");
	    }
	

}
