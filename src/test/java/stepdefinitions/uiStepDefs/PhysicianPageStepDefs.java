package stepdefinitions.uiStepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.physician.PhysicianHomePage;
import pages.physician.PhysicianMyAppointmentPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class PhysicianPageStepDefs {

    PhysicianHomePage physicianHomePage = new PhysicianHomePage();
    PhysicianMyAppointmentPage physicianMyAppointmentPage = new PhysicianMyAppointmentPage();
    Faker faker = new Faker();




    @And("user click on the My Pages Patients icon")
    public void userClickOnTheMyPagesPatientsIcon() {
        ReusableMethods.waitFor(3);
        Driver.waitForClickablility(physicianHomePage.myPagesIcon, 3);
        physicianHomePage.myPagesIcon.click();
    }

    @When("user click on the My Appointments icon")
    public void user_click_on_the_my_appointments_icon() {

        physicianHomePage.myAppointments.click();
    }
    @Then("user click on the from box")
    public void user_click_on_the_from_box() {

        physicianMyAppointmentPage.fromDate.click();
    }

    @When("user click on the to box")
    public void user_click_on_the_to_box() {

        physicianMyAppointmentPage.toDate.click();
    }

    @Then("verify the Days between begin date and end date must be max 15 days pop-up is displayed")
    public void verify_the_pop_up_is_displayed(String string) {
        Assert.assertTrue(physicianMyAppointmentPage.daysBetweenFifteenDaysPopUp.isDisplayed());
    }

    @Then("user type a date earlier than appointment date")
    public void user_type_a_date_earlier_than_appointment_date() {
        Date oldDate = Faker.instance().date().past(1000, TimeUnit.DAYS);
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        physicianMyAppointmentPage.fromDate.sendKeys(formatter.format(oldDate));
        Assert.assertTrue(physicianMyAppointmentPage.fromDate.isDisplayed());
    }
    @Then("user type a date later than appointment date")
    public void user_type_a_date_later_than_appointment_date() {
        Date futureDate = Faker.instance().date().future(1000, TimeUnit.DAYS);
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        physicianMyAppointmentPage.toDate.sendKeys(formatter.format(futureDate));
        Assert.assertTrue(physicianMyAppointmentPage.toDate.isDisplayed());

    }
    /*@Then("hover over the name")
    public void hover_over_the_name() {

        physicianMyAppointmentPage.appointment276238.isSelected();
    }
    @Then("user click on the name")
    public void user_click_on_the_name() {

        physicianMyAppointmentPage.appointment276238.click();
    }*/

    /*
    @When("user click on the sign in and register icon")
    public void user_click_on_the_sign_in_and_register_icon() {
        physicianMyAppointmentPage.signInRegisterIcon.click();
    } Hata veriyor!!
    */




}
