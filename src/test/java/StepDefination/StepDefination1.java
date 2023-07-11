package StepDefination;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class StepDefination1 {
	@Given("^user is on landing on page$")
    public void user_is_on_landing_on_page() throws Throwable {
        
        System.out.println("Open browser");
    }

    @When("^user login to appliacation with \"([^\"]*)\" and password \"([^\"]*)\" $")
    public void user_login_to_appliacation_with_something_and_password_something(String strArg1, String strArg2) throws Throwable {
    	System.out.println("strArg1");
    	System.out.println("strArg2");
    }
    

    @Then("^home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	System.out.println("home page");
    }
    
    @Then("^user signup with following details$")
    public void user_signup_with_following_details(DataTable data) throws Throwable {
    	List<String> obj = data.asList();
    System.out.println(obj.get(0));
    System.out.println(obj.get(0));
    System.out.println(obj.get(0));
    	
    	
    }

    @And("^cards are displayed is \"([^\"]*)\"$")
    public void cards_are_displayed_is_something(String strArg1) throws Throwable {
    	System.out.println("strArg1");
    }
    

    @When("^user login to appliacation with (.+) and password (.+)$")
    public void user_login_to_appliacation_with_and_password(String username, String password) throws Throwable {
                               
   System.out.println(username);
   System.out.println(password);

	}

}
