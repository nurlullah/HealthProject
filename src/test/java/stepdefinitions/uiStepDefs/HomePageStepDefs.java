package stepdefinitions.uiStepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.base.HomePage;
import pages.physician.PhysicianMyAppointmentPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class HomePageStepDefs {
    HomePage homePage = new HomePage();
    Faker faker = new Faker();

    @Then("user click on the make an appointment icon")
    public void user_click_on_the_make_an_appointment_icon() {

        homePage.makeAppointment.click();
    }

    @Then("user clicks on enter button on firstname box on homepage")
    public void user_clicks_on_enter_button_on_firstname_box_on_homepage() {
        homePage.firstName.sendKeys(Keys.ENTER);
    }

    @Then("user types the firstname on homepage appointment")
    public void user_types_the_firstname_on_homepage_appointment() {
       homePage.firstName.sendKeys(faker.name().firstName());

       ReusableMethods.waitFor(3);
    }




    @Then("verify Your FirstName is required is displayed")
    public void verify_your_first_name_is_required_is_displayed() {
        Assert.assertTrue(homePage.requiredFirstName.isDisplayed());
    }

    @Then("user clicks on enter button on ssn box on homepage")
    public void user_clicks_on_enter_button_on_ssn_box_on_homepage() {
        homePage.ssn.sendKeys(Keys.ENTER);
    }

    @Then("verify that Your SSN is required alert is displayed")
    public void verify_that_your_ssn_is_required_alert_is_displayed() {
     Assert.assertTrue(homePage.requiredSsn.isDisplayed());
    }
    @Then("user types an invalid SSN")
    public void user_types_an_invalid_ssn() {

       homePage.ssn.sendKeys(faker.idNumber().invalidSvSeSsn());

    }
    @Then("verify your SSN is invalid alert is displayed")
    public void verify_your_ssn_is_invalid_alert_is_displayed() {
     Assert.assertTrue(homePage.invalidSsnAlert.isDisplayed());

    }


    @Then("user types valid SSN on homepage appointment.")
    public void user_types_valid_ssn_on_homepage_appointment() {
        homePage.ssn.clear();
       /*String ssn = faker.idNumber().ssnValid();
       //verify ssn is 9 digits
        int numOfdigits=ssn.replaceAll("[^0-9]","").length();
        Assert.assertEquals(numOfdigits, 9);
        //verify - between 3. and 5. digits
        Assert.assertEquals((char)ssn.charAt(3), '-');
        //verify - between 3. and 5. digits
        Assert.assertEquals((char)ssn.charAt(6), '-');
        homePage.ssn.sendKeys(ssn);*/

        homePage.ssn.sendKeys(faker.idNumber().ssnValid());
    }

    @Then("user clicks on enter button on lastname box on homepage")
    public void user_clicks_on_enter_button_on_lastname_box_on_homepage() {
        homePage.lastName.sendKeys(Keys.ENTER);
    }
    @Then("verify Your LastName is required is displayedName is required is displayed")
    public void verify_your_last_name_is_required_is_displayed_name_is_required_is_displayed() {
      Assert.assertTrue(homePage.requiredLastName.isDisplayed());
    }
    @Then("user types the lastname on homepage appointment")
    public void user_types_the_lastname_on_homepage_appointment() {
        homePage.lastName.sendKeys(faker.name().lastName());

    }
    @Then("user clicks on enter button on email box on homepage")
    public void user_clicks_on_enter_button_on_email_box_on_homepage() {
        homePage.email.sendKeys(Keys.ENTER);
    }
    @Then("verify that Your email is required alert is displayed")
    public void verify_that_your_email_is_required_alert_is_displayed() {
      Assert.assertTrue(homePage.requiredEmail.isDisplayed());
    }
    @Then("user types an invalid email")
    public void user_types_an_invalid_email() {
        homePage.email.sendKeys(faker.name().username());
    }
    @Then("verify this field is invalid alert is displayed")
    public void verify_this_field_is_invalid_alert_is_displayed() {
      Assert.assertTrue(homePage.invalidFieldAlert.isDisplayed());
    }
    @Then("user types valid email on homepage appointment.")
    public void user_types_valid_email_on_homepage_appointment() {
        homePage.email.sendKeys(faker.internet().emailAddress());
    }

    @Then("user clicks on enter button on phone box on homepage")
    public void user_clicks_on_enter_button_on_phone_box_on_homepage() {
        homePage.phoneNumber.sendKeys(Keys.ENTER);
    }
    @Then("verify that Your phone is required alert is displayed")
    public void verify_that_your_phone_is_required_alert_is_displayed() {
       Assert.assertTrue(homePage.requiredPhoneNumber.isDisplayed());
    }
    @Then("user types an invalid phone")
    public void user_types_an_invalid_phone() {
        homePage.phoneNumber.sendKeys(faker.number().digits(8));
    }
    @Then("verify your phone is invalid alert is displayed")
    public void verify_your_phone_is_invalid_alert_is_displayed() {
      Assert.assertTrue(homePage.invalidPhoneNumber.isDisplayed());
    }
    @Then("user types valid phone on homepage appointment.")
    public void user_types_valid_phone_on_homepage_appointment() {
      //  ReusableMethods.waitFor(1);
        homePage.phoneNumber.clear();

        homePage.phoneNumber.sendKeys(faker.number().digits(10));
    }



}
