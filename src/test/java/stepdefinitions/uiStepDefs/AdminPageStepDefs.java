package stepdefinitions.uiStepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import pages.admin.AdminHomePage;
import pages.common.CommonCreateEditPatientPage;
import pages.common.CommonPatientTablePage;
import pojos.Country;
import pojos.Patient;
import pojos.StateCity;
import pojos.User;
import utilities.Driver;
import utilities.ReusableMethods;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static utilities.FileWriterForData.saveUIAdminPatientData;

public class AdminPageStepDefs {

    AdminHomePage adminHomePage = new AdminHomePage();
    CommonPatientTablePage adminPatientPage = new CommonPatientTablePage();
    CommonCreateEditPatientPage adminCreatePatientPage = new CommonCreateEditPatientPage();
    Faker faker = new Faker();
    Patient patient = new Patient();
    User user = new User();
    Country country = new Country();
    StateCity city = new StateCity();


    @When("user navigates to patients page")
    public void user_navigates_to_patients_page() {
        adminHomePage.itemsTitlesButton.click();
        adminHomePage.patientButton.click();
        Assert.assertEquals(adminPatientPage.patientPageTitle.getText(),"Patients");
    }
    @Then("click on create new patient")
    public void click_on_create_new_patient() {
       Assert.assertTrue(adminPatientPage.adminCreateAnewPatient.isDisplayed());
       adminPatientPage.adminCreateAnewPatient.click();
       Assert.assertEquals(adminCreatePatientPage.createPatientTitle.getText(),"Create or edit a Patient");
    }
    @Then("user enters the firstname")
    public void user_enters_the_firstname() {
        patient.setFirstName(faker.name().firstName());
        Driver.waitAndSendText(adminCreatePatientPage.firstNameTextBox,patient.getFirstName());

        //Assertion about alert missing
    }
    @Then("user enters the lastname")
    public void user_enters_the_lastname() {
        patient.setLastName(faker.name().lastName());
        Driver.waitAndSendText(adminCreatePatientPage.lastNameTextBox,patient.getLastName());
    }
    @Then("user enters the birthdate")
    public void user_enters_the_birthdate() {
        patient.setBirthDate(faker.date().birthday());
        Driver.waitAndSendText(adminCreatePatientPage.birthDateTextBox,patient.getBirthDate().toString());

    }
    @Then("user enters the email")
    public void user_enters_the_email() {
        patient.setEmail(faker.internet().emailAddress());
        Driver.waitAndSendText(adminCreatePatientPage.emailTextBox,patient.getEmail());

    }
    @Then("user enters the phone number")
    public void user_enters_the_phone_number() {
     patient.setPhone(faker.phoneNumber().cellPhone());
     Driver.waitAndSendText(adminCreatePatientPage.phoneTextBox,patient.getPhone());

    }
    @Then("user select a gender")
    public void user_select_a_gender() {

        Select select = new Select(adminCreatePatientPage.genderDropDown);
        patient.setGender(ReusableMethods.selectRandomTextFromDropdown(select).getText());
        Driver.waitAndSendText(adminCreatePatientPage.genderDropDown,patient.getGender());


    }
    @Then("user select a blood group")
    public void user_select_a_blood_group() {
        Select select = new Select(adminCreatePatientPage.bloodGroupDropDown);
        patient.setBloodGroup(ReusableMethods.selectRandomTextFromDropdown(select).getText());
        Driver.waitAndSendText(adminCreatePatientPage.bloodGroupDropDown,patient.getBloodGroup());

    }
    @Then("user enters the address")
    public void user_enters_the_address() {
        patient.setAdress(faker.address().fullAddress());
        Driver.waitAndSendText(adminCreatePatientPage.adressTextBox,patient.getAdress());

    }
    @Then("user enters the description")
    public void user_enters_the_description() {
        patient.setDescription(faker.lorem().paragraph(3));
        Driver.waitAndSendText(adminCreatePatientPage.descriptionTextBox,patient.getDescription());

    }
    @Then("user select a user")
    public void user_select_a_user() {
        Select select = new Select(adminCreatePatientPage.userDropDown);
        user.setFirstname(ReusableMethods.selectRandomTextFromDropdown(select).getText());
        patient.setUser(user);
        Driver.waitAndSendText(adminCreatePatientPage.userDropDown,patient.getUser().toString());

    }
    @Then("user select a country")
    public void user_select_a_country() {
        Select select = new Select(adminCreatePatientPage.countryDropDown);
        country.setName(ReusableMethods.selectRandomTextFromDropdown(select).getText());
        patient.setCountry(country);
        Driver.waitAndSendText(adminCreatePatientPage.countryDropDown,patient.getCountry().toString());

    }
    @Then("user select a state")
    public void user_select_a_state() {
        Select select = new Select(adminCreatePatientPage.countryDropDown);
        city.setName(ReusableMethods.selectRandomTextFromDropdown(select).getText());
        patient.setCstate(city);
        Driver.waitAndSendText(adminCreatePatientPage.stateCityDropDown,patient.getCstate().toString());

    }
    @When("user clicks on save button")
    public void user_clicks_on_save_button() {
        adminCreatePatientPage.saveButton.click();

    }
    @Then("verify A new patient is created pop up")
    public void verify_a_new_patient_is_created_pop_up() {
        ReusableMethods.waitForVisibility(adminPatientPage.popUp,4);
        Assert.assertTrue(adminPatientPage.popUp.isDisplayed());
        saveUIAdminPatientData(patient);
    }
}
