package stepdefinitions;

import io.cucumber.java.en.*;
import utilities.ConfigReader;
import utilities.Driver;

public class BackgroundStepDefs {

    @Given("User goes to URL {string}")
    public void userGoesToURL(String arg0) {
        Driver.getDriver().get(ConfigReader.getProperty("medunna_url"));
    }

    @Then("verify the page title contains {string}")
    public void verify_the_page_title_contains(String string) {

    }

}
