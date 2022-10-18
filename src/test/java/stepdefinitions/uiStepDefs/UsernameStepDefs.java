package stepdefinitions.uiStepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.base.HomePage;
import pages.base.RegistrationPage;
import utilities.ConfigReader;
import utilities.Driver;

public class UsernameStepDefs {
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    Faker faker = new Faker();

    @Given("Open the URL {string}")
    public void open_the_url(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("medunna_url"));
    }


    @Then("Verify the page title contains MEDUNNA")
    public void verify_the_page_title_contains_medunna() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("MEDUNNA"));
    }

    @When("Click on the sign in and account icon")
    public void click_on_the_sign_in_and_account_icon() {
        homePage.signInAndAccountIcon.click();



    }
    @When("Click on Register Button")
    public void click_on_register_button() {
        homePage.register.click();



    }
    @Then("Verify Registration text")
    public void verify_registration_text() {
        Assert.assertTrue(registrationPage.registrationText.isDisplayed());



    }
    @Given("Click on the SSN box")
    public void click_on_the_ssn_box() {
        registrationPage.ssn.click();


    }
    @When("Enter SSN number")
    public void enter_ssn_number() {


    }
    @When("Click on the First Name box")
    public void click_on_the_first_name_box() {

    }
    @When("Enter First Name")
    public void enter_first_name() {

    }
    @When("Click on the  Last Name box")
    public void click_on_the_last_name_box() {

    }
    @When("Enter Last Name")
    public void enter_last_name() {

    }
    @When("Click on the username box and click  Enter")
    public void click_on_the_username_box_and_click_enter() {

    }
    @Then("Verify Your username is required.")
    public void verify_your_username_is_required() {

    }
    @When("Enter any any chars on the username")
    public void enter_any_any_chars_on_the_username() {

    }
    @Then("Verify Your username is required. is not displayed")
    public void verify_your_username_is_required_is_not_displayed() {

    }

}
