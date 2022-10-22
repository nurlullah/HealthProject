package stepdefinitions.uiStepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import pages.admin.AdminHomePage;
import pages.common.CommonCreateEditPatientPage;
import pages.common.CommonPatientTablePage;
import utilities.ReusableMethods;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AdminPageStepDefs {

    AdminHomePage adminHomePage = new AdminHomePage();
    CommonPatientTablePage adminPatientPage = new CommonPatientTablePage();
    CommonCreateEditPatientPage adminCreatePatientPage = new CommonCreateEditPatientPage();
    Faker faker = new Faker();

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
        adminCreatePatientPage.firstNameTextBox.click();
        adminCreatePatientPage.firstNameTextBox.sendKeys(faker.name().firstName());
        //Assertion about alert missing
    }
    @Then("user enters the lastname")
    public void user_enters_the_lastname() {
        adminCreatePatientPage.lastNameTextBox.click();
        adminCreatePatientPage.lastNameTextBox.sendKeys(faker.name().lastName());

    }
    @Then("user enters the birthdate")
    public void user_enters_the_birthdate() {
        adminCreatePatientPage.birthDateTextBox.click();
        adminCreatePatientPage.birthDateTextBox.sendKeys(faker.date().birthday().toString());
    }
    @Then("user enters the email")
    public void user_enters_the_email() {
       adminCreatePatientPage.emailTextBox.click();
       adminCreatePatientPage.emailTextBox.sendKeys(faker.internet().emailAddress());
    }
    @Then("user enters the phone number")
    public void user_enters_the_phone_number() {
     adminCreatePatientPage.phoneTextBox.click();
     adminCreatePatientPage.phoneTextBox.sendKeys(faker.phoneNumber().cellPhone());
    }
    @Then("user select a gender")
    public void user_select_a_gender() {
       Select select = new Select(adminCreatePatientPage.genderDropDown);
        ReusableMethods.selectRandomTextFromDropdown(select);
    }
    @Then("user select a blood group")
    public void user_select_a_blood_group() {
        Select select = new Select(adminCreatePatientPage.bloodGroupDropDown);
        ReusableMethods.selectRandomTextFromDropdown(select);
    }
    @Then("user enters the address")
    public void user_enters_the_address() {
       adminCreatePatientPage.adressTextBox.click();
       adminCreatePatientPage.adressTextBox.sendKeys(faker.address().fullAddress());
    }
    @Then("user enters the description")
    public void user_enters_the_description() {
       adminCreatePatientPage.descriptionTextBox.click();
       adminCreatePatientPage.descriptionTextBox.sendKeys(faker.lorem().paragraph(3));
    }
    @Then("user select a user")
    public void user_select_a_user() {
        Select select = new Select(adminCreatePatientPage.userDropDown);
        ReusableMethods.selectRandomTextFromDropdown(select);
    }
    @Then("user select a country")
    public void user_select_a_country() {
        Select select = new Select(adminCreatePatientPage.countryDropDown);
        ReusableMethods.selectRandomTextFromDropdown(select);
    }
    @Then("user select a state")
    public void user_select_a_state() {
        Select select = new Select(adminCreatePatientPage.countryDropDown);
        ReusableMethods.selectRandomTextFromDropdown(select);
    }
    @When("user clicks on save button")
    public void user_clicks_on_save_button() {
        adminCreatePatientPage.saveButton.click();
    }
    @Then("verify A new patient is created pop up")
    public void verify_a_new_patient_is_created_pop_up() {
        Assert.assertTrue(adminPatientPage.popUp.getText().contains("A new Patient is created "));
    }
}
