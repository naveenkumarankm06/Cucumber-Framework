package StepDefinitions;

import java.util.List;

import io.cucumber.java.en.*;

public class Mainsteps {

	@Given("User is on NetBanking landing page")
	public void user_is_on_net_banking_landing_page() {
		System.out.println("User is on NetBanking landing page");
	}

	@Then("Home Page is displayed")
	public void home_page_is_displayed() {
		System.out.println("Home Page is displayed");
	}

	@Then("Cards are displayed")
	public void cards_are_displayed() {
		System.out.println("Cards are displayed");
	}
//	@When("User login into application with user {string} and password {string}")
//	public void user_login_into_application_with_user_and_password(String string, String string2) {
//		System.out.println("User login into application with "+string+" " +string2);
//	}

	@When("^User login into application with user (.+) and password (.+)$")
	public void user_login_into_application_with_user_and_password(String string, String string2) {
		System.out.println("User login into application with " + string + " " + string2);
	}

	@When("User login into application")
	public void user_login_into_application(List<String> Data) {
		System.out.println("User login into application");
		System.out.println(Data.get(0));
		System.out.println(Data.get(1));
		System.out.println(Data.get(2));
		System.out.println(Data.get(3));
	}

	@Given("setup the entries in database")
	public void setupEntries() {
		System.out.println("**********************");
		System.out.println("setup the entries in database");

	}

	@When("launch the browser from config variables")
	public void launchBrowser() {
		System.out.println("launch the browser from config variables");
	}

	@When("hit the home page url of banking site")
	public void hitUrl() {
		System.out.println("hit the home page url of banking site");
	}

}
