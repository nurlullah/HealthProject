package stepdefinitions.uiStepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.base.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class HomePageStepDefs {
    HomePage homePage = new HomePage();

    @Given("user is on the Medunna homepage")
    public void user_is_on_the_medunna_homepage() {
        Driver.getDriver().get(ConfigReader.getProperty("medunna_url"));
    }
    @When("user navigates on the login page")
    public void user_navigates_on_the_login_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user enters username as {string} and password as {string} and click on login button")
    public void user_enters_username_as_and_password_as_and_click_on_login_button(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("verify the login is successful")
    public void verify_the_login_is_successful() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
