package stepdefinitions.uiStepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.base.HomePage;
import pojos.AppointmentRequest;
import pages.physician.PhysicianMyAppointmentPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.ReusableMethods;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class HomePageStepDefs {
    HomePage homePage = new HomePage();
    Faker faker = new Faker();
    AppointmentRequest appointmentRequest = new AppointmentRequest();

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
        appointmentRequest.setFirstName(faker.name().firstName());
        homePage.firstName.sendKeys(appointmentRequest.getFirstName());

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
        System.out.println(homePage.email.getText());
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


    @When("Click on the Appointment Date Time slot and enter current and future valid date and then Appointment date can not be past date! should be wiped out")
    public void click_on_the_appointment_date_time_slot_and_enter_current_and_future_valid_date_and_then_appointment_date_can_not_be_past_date_should_be_wiped_out() {

        //bugunun tarihi icin
        Date today = new Date();
        //Gelecekteki tarih icin faker between kullaniyoruz
        //faker.between e bugunun tarihini ve kac gun sonrasina kadar tarih istedigimizi soyluyoruz
        //ben bugunden itibaren 1000 gun icinde yazdim siz degisebilirsiniz
        Date futureDate = Faker.instance().date().between(today,Faker.instance().date().future(1, TimeUnit.DAYS));

        //Date in formati cok uzun ve bize kisa bir format lazım o yüzden simpleDateFormat kullanip istedigimiz formati yaziyoruz
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        appointmentRequest.setStartDate(formatter.format(futureDate));
        //bu fornati tarihleri kullanirken kullanmak lazim
        homePage.appointmentDateTime.sendKeys(appointmentRequest.getStartDate());

    }

    @When("Click on the Send an Appointment Request button")
    public void click_on_the_send_an_appointment_request_button() {
        ReusableMethods.waitFor(3);
        Driver.waitForClickablility(homePage.sendAnAppointmentRequest,5);
        homePage.sendAnAppointmentRequest.click();

    }
    @Then("Verify the Appointment registration saved. We will call you as soon as possible alert")
    public void verify_the_appointment_registration_saved_we_will_call_you_as_soon_as_possible_alert() {

        ReusableMethods.waitFor(3);
        Assert.assertTrue(homePage.AppointmentRegistrationSavedPopUp.isDisplayed());
    }
    @When("user enters old date")
    public void user_enters_old_date() {


        Date oldDate = Faker.instance().date().past(1000,TimeUnit.DAYS);
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        homePage.appointmentDateTime.sendKeys(formatter.format(oldDate));
        Assert.assertTrue(homePage.pastAppointmentTime.isDisplayed());
    }
    @Then("verify appointment date can not be past date message")
    public void verify_appointment_date_can_not_be_past_date_message() {

        Assert.assertTrue(homePage.pastAppointmentTime.isDisplayed());
    }
    @Then("verify that send appointment request button is unclickable")
    public void verify_that_send_appointment_request_button_is_unclickable() {

        Assert.assertFalse(homePage.sendAnAppointmentRequest.isEnabled());
    }
    @Then("user  types current date on home page appointment")
    public void user_types_current_date_on_home_page_appointment() {

        Date today = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");

        homePage.appointmentDateTime.sendKeys(formatter.format(today));
    }
    @Then("Verify calender format is day mm year")
    public void verify_calender_format_is_day_mm_year() {

        String date = appointmentRequest.getStartDate();

       Assert.assertTrue(ReusableMethods.isValidFormat("dd.mm.yyyy",date));
    }

}
