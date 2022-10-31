package stepdefinitions.uiStepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.base.HomePage;
import pages.physician.PhysicianMyAppointmentPage;
import utilities.ConfigReader;
import utilities.Driver;

public class HomePageStepDefs {
    HomePage homePage = new HomePage();
    PhysicianMyAppointmentPage physicianMyAppointmentPage = new PhysicianMyAppointmentPage();
    Faker faker = new Faker();

    @Then("user click on the make an appointment icon")
    public void user_click_on_the_make_an_appointment_icon() {
        homePage.makeAppointment.click();
    }
    @When("user click on the first name box")
    public void user_click_on_the_first_name_box() {
        homePage.firstName.click();
    }
    @When("user click Enter button")
    public void user_click_enter_button() {
        homePage.sendAnAppointmentRequest.click();
    }
    @Then("verify Your FirstName is required is displayed")
    public void verify_your_first_name_is_required_is_displayed() {
        Assert.assertTrue(homePage.requiredFirstName.isDisplayed());
    }
    @And("user type the first name that contains any chars")
    public void userTypeTheFirstNameThatContainsAnyChars() {
        homePage.firstName.sendKeys(Faker.instance().name().firstName());
    }
    @Then("verify that \"Your FirstName is required\" is not displayed")
    public void verifyThatIsNotDisplayed(String arg0) {
        Assert.assertFalse(homePage.requiredFirstName.isDisplayed());
    }
    @When("user click on the SSN box")
    public void user_click_on_the_ssn_box() {
        homePage.ssn.click();
    }
    @When("user type the \"SSN ID\" that has \"-\" after 3rd and 5th digits, it should be {int} digits long and can not be blank")
    public void user_type_the_that_has_after_3rd_and_5th_digits_it_should_be_digits_long_and_can_not_be_blank(String string, String string2, Integer int1) {
        homePage.ssn.sendKeys("555-22-2345");
    }
    /* @Then("verify that SSN is invalid is not displayed")
     public void verifyThatIsNotDisplayed(String) {
       Assert.assertFalse(homePage.invalidSsnAlert.isDisplayed());
     }*/
    @When("user click on the last name box")
    public void user_click_on_the_last_name_box() {
        homePage.lastName.click();
    }
    @When("Click Enter button")
    public void click_enter_button() {
        homePage.sendAnAppointmentRequest.click();
    }
    @Then("verify \"Your LastName is required\" is displayed")
    public void verify_is_displayed(String string) {
        Assert.assertTrue(homePage.requiredLastName.isDisplayed());
    }
    @And("user type the \"last name\" that contains any chars")
    public void userTypeTheThatContainsAnyChars(String arg0) {
        homePage.lastName.sendKeys(Faker.instance().name().lastName());
    }

    @When("user click on the email box")
    public void user_click_on_the_email_box() {
        homePage.email.click();
    }
    @Then("user type invalid any emails")
    public void user_type_invalid_any_emails() {
        homePage.email.sendKeys(Faker.instance().internet().emailAddress());
    }
    @Then("verify \"This field is invalid\"")
    public void verify(String string) {
        Assert.assertTrue(homePage.invalidFieldAlert.isDisplayed());
    }
    @Then("user type valid any email")
    public void user_type_valid_any_email() {
        homePage.email.sendKeys("deniz_zengin@gmail.com");
    }
    /*@Then("verify \"This field is invalid\" is not displayed")
    public void verifyIsNotDisplayed(String) {
      Assert.assertFalse(homePage.invalidFieldAlert.isDisplayed());
    }*/
    @Then("clear Email box")
    public void clear_email_box() {
        homePage.email.clear();
    }

    @When("user click on the Phone box")
    public void user_click_on_the_phone_box() {
        homePage.phoneNumber.click();
    }
    @Then("verify that \"Phone number is required.\" is displayed")
    public void verifyThatIsDisplayed(String arg0) {
        Assert.assertTrue(homePage.requiredPhoneNumber.isDisplayed());
    }
    @Then("user type invalid Phone number")
    public void user_type_invalid_phone_number() {
        homePage.phoneNumber.sendKeys("546-965-2284a");
    }
    @Then("verify that Your SSN is invalid is displayed")
    public void verify_that_your_ssn_is_invalid_is_displayed() {
        Assert.assertTrue(homePage.invalidSsnAlert.isDisplayed());
    }
    @Then("user click valid Phone number that contains {string} after 3th and 6th digits and can not be blank")
    public void user_click_valid_phone_number_that_contains_after_3th_and_6th_digits_and_can_not_be_blank(String string) {
        homePage.phoneNumber.sendKeys("546-965-2284");
    }

    @When("user click on Sign in button")
    public void user_click_on_sign_in_button() {
        homePage.signInButton.click();
    }
    @When("user click on the Username box")
    public void user_click_on_the_username_box() {
        homePage.usernameBox.click();
    }
    @And("user type the Username")
    public void userTypeTheUsername() {
        homePage.usernameBox.sendKeys("team02_physician");
    }

    @When("user click on the Password box")
    public void user_click_on_the_password_box() {
        homePage.passwordBox.click();
    }
    @And("user type the \"<Password>\"")
    public void userTypeThe(String arg0) {
        homePage.passwordBox.sendKeys("bilge_dede");
    }
    @When("user click on the Sign In button")
    public void user_click_on_the_sign_in_button() {
        homePage.signInButton.click();
    }

    @Then("user click on the from box")
    public void user_click_on_the_from_box() {
        physicianMyAppointmentPage.fromDate.click();
    }

    @When("user click on the to box")
    public void user_click_on_the_to_box() {
        physicianMyAppointmentPage.toDate.click();
    }

    @Then("Verify the \"Days between begin date and end date must be max 15 days\" pop-up is displayed")
    public void verify_the_pop_up_is_displayed(String string) {
        Assert.assertTrue(physicianMyAppointmentPage.daysBetweenFifteenDaysPopUp.isDisplayed());
    }
/*
    @Then("user type a date earlier than appointment date")
    public void user_type_a_date_earlier_than_appointment_date() {
        physicianMyAppointmentPage.fromDate.sendKeys(Faker.instance().date().past());
    }
    @Then("user type a date later than appointment date")
    public void user_type_a_date_later_than_appointment_date() {
        physicianMyAppointmentPage.toDate.sendKeys(Faker.instance().date().future(30/10/22));
    }

 */
    @Then("hover over the name")
    public void hover_over_the_name() {
        physicianMyAppointmentPage.appointment276238.isSelected();
    }
    @Then("user click on the name")
    public void user_click_on_the_name() {
        physicianMyAppointmentPage.appointment276238.click();
    }
    @When("User clicks the sign in symbol and register dropdown button")
    public void user_clicks_the_sign_in_symbol_and_register_dropdown_button() {
        homePage.signInAndAccountIcon.click();
        Driver.wait(1);
        homePage.register.click();
    }
}
