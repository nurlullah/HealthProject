package stepdefinitions.uiStepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.common.CommonCreateEditPatientPage;
import pages.common.CommonPatientDetailsPage;
import pages.common.CommonPatientTablePage;
import pages.staff.StaffHomePage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class PatientSearchViewEditStepDefs {
    CommonPatientTablePage patientTable=new CommonPatientTablePage();
    CommonPatientDetailsPage commonPatientDetails=new CommonPatientDetailsPage();
    StaffHomePage staffHomePage=new StaffHomePage();
    CommonCreateEditPatientPage createEditPatient=new CommonCreateEditPatientPage();
    Select select;
    Actions actions=new Actions(Driver.getDriver());

    @When("Click My Pages button and Search Patient dropdown")
    public void clickMyPagesButtonAndSearchPatientDropdown() {
        staffHomePage.myPagesButton.click();
        staffHomePage.searchPatientDropdown.click();
    }
    @And("Click ssn of patient and enter ssn number")
    public void clickSsnOfPatientAndEnterSsnNumber() {
        Driver.waitAndClick(patientTable.searchSsn,5);
        Driver.waitAndSendText(patientTable.searchSsn,"555-77-3333");
        Driver.wait(2);
    }

    @And("Click view button for patient")
    public void clickViewButtonForPatient() {
        patientTable.view.click();
    }
    @When("Verify all patient information displayed")
    public void verify_all_patient_information_displayed() {
        Assert.assertEquals(commonPatientDetails.patientInfoTitle.size(),commonPatientDetails.patientInfoValue.size());
    }
    @And("Click edit button for patient")
    public void clickEditButtonForPatient() {
        patientTable.editButton.click();
    }
    @Then("Verify the page title contains -Create or edit a Patient- text")
    public void verifyThePageTitleContainsCreateOrEditAPatientText() {
        Assert.assertEquals("Create or edit a Patient",createEditPatient.createPatientTitle.getText());
    }
    @When("Enter a new value to id box")
    public void enter_a_new_value_to_id_box() {
        createEditPatient.idTextBox.click();
        createEditPatient.idTextBox.clear();
        createEditPatient.idTextBox.sendKeys(Faker.instance().idNumber().ssnValid());
    }
       @When("Enter a new value to fistname box")
    public void enter_a_new_value_to_fistname_box() {
        Driver.waitAndClick(createEditPatient.firstNameTextBox);
        createEditPatient.firstNameTextBox.clear();
        Driver.waitAndSendText(createEditPatient.firstNameTextBox,Faker.instance().name().firstName(),5);
    }
    @When("Enter a new value to lastname box")
    public void enter_a_new_value_to_lastname_box() {
        Driver.waitAndClick(createEditPatient.lastNameTextBox);
        createEditPatient.lastNameTextBox.clear();
        createEditPatient.lastNameTextBox.sendKeys(Faker.instance().name().lastName());
      }
    @When("Enter a new value to birth date box")
    public void enter_a_new_value_to_birth_date_box() {
        createEditPatient.lastNameTextBox.sendKeys(Keys.TAB+"12122000000000");
        Driver.wait(2);
    }
    @When("Enter a new value to email box")
    public void enter_a_new_value_to_email_box() {
        Driver.waitAndClick(createEditPatient.emailTextBox);
        createEditPatient.emailTextBox.clear();
        createEditPatient.emailTextBox.sendKeys(Faker.instance().internet().emailAddress());
    }
    @When("Enter a new value to phone box")
    public void enter_a_new_value_to_phone_box() {
        Driver.waitAndClick(createEditPatient.phoneTextBox);
        createEditPatient.phoneTextBox.clear();
        createEditPatient.phoneTextBox.sendKeys(Faker.instance().phoneNumber().subscriberNumber(10));
    }
    @When("Enter a new value to gender box")
    public void enter_a_new_value_to_gender_box() {
        select=new Select(createEditPatient.genderDropDown);
        if(createEditPatient.genderDropDown1.isSelected()){
            select.selectByIndex(2);
        }else {
            select.selectByIndex(1);
        }
    }
    @When("Enter a new value to blood group box")
    public void enter_a_new_value_to_blood_group_box() {
        select=new Select(createEditPatient.bloodGroupDropDown);
        if(createEditPatient.bloodGroupDropDown1.isSelected()){
            select.selectByIndex(2);
        }else {
            select.selectByIndex(1);
        }
    }
    @When("Enter a new value to address box")
    public void enter_a_new_value_to_address_box() {
        Driver.waitAndClick(createEditPatient.adressTextBox);
        createEditPatient.adressTextBox.clear();
        createEditPatient.adressTextBox.sendKeys(Faker.instance().address().fullAddress());
    }
    @When("Enter a new value to description box")
    public void enter_a_new_value_to_description_box() {
        Driver.waitAndClick(createEditPatient.descriptionTextBox);
        createEditPatient.descriptionTextBox.clear();
        createEditPatient.descriptionTextBox.sendKeys("power headeche");
    }
    @When("Enter a new value to user box")
    public void enter_a_new_value_to_user_box() {
        select=new Select(createEditPatient.userDropDown);
        if(createEditPatient.userDropDown1.isSelected()){
            select.selectByIndex(2);
        }else {
            select.selectByIndex(1);
        }
    }
    @When("Enter a new value to country box")
    public void enter_a_new_value_to_country_box() {
        select=new Select(createEditPatient.countryDropDown);
        if(createEditPatient.countryDropDown1.isSelected()){
            select.selectByIndex(3);
        }else {
            select.selectByIndex(2);
        }
    }
    @When("Enter a new value to state-city box")
    public void enter_a_new_value_to_state_city_box() {
        select=new Select(createEditPatient.stateCityDropDown);
        if(createEditPatient.stateCityDropDown1.isSelected()){
            select.selectByIndex(2);
        }else {
            select.selectByIndex(1);
        }
    }
    @Then("Take the screenshot")
    public void take_the_screenshot() throws IOException {

        //Whenever we take screenshot we will call reusable step:
        //And capture the screenshot.
        ReusableMethods.getScreenshot("ScreenShot");

    }
    @And("Click save button")
    public void clickSaveButton() {
        Driver.waitAndClick(createEditPatient.saveButton,5);
    }
       @Then("Verify -A patient is updated with identifier- alert")
    public void verifyAPatientIsUpdatedWithIdentifierAlert() {
        Driver.waitForVisibility(createEditPatient.alert,5);
        createEditPatient.alert.isDisplayed();
            }



    @Then("Verify all patient info populated.")
    public void verifyAllPatientInfoPopulated() {
             for (int i = 0; i <createEditPatient.tableInfo.size() ; i++) {
            Assert.assertTrue(createEditPatient.tableInfo.get(i).isDisplayed());
        }
    }
}
