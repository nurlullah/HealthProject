package stepdefinitions.uiStepDefs;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.base.HomePage;
import pages.patient.PatientHomePage;
import pages.staff.StaffHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

import javax.swing.plaf.basic.BasicSliderUI;

import java.util.ArrayList;
import java.util.List;

import static pages.patient.PatientHomePage.*;

public class US023_PaymentInvoiceByStaff {

    HomePage homePage = new HomePage();

    PatientHomePage patientHomePage=new PatientHomePage();
    StaffHomePage staffHomePage=new StaffHomePage();
    Driver driver=new Driver();
    @When("user patient enters username and click on login button")
    public void user_patient_enters_username_and_click_on_login_button() {
      Driver.wait(2);
      PatientHomePage.patientUsernameBox.sendKeys("team02_patient");
      PatientHomePage.patientPasswordBox.sendKeys("deniz_zengin");
      ReusableMethods.waitFor(2);
      Driver.waitAndClick(patientSignInSubmit, 3);

    }
    @Then("user patient click on the My Pages from dropdown")
    public void user_patient_click_on_the_my_pages_from_dropdown() {
        Driver.wait(3);
        myPagesDropDown.click();
    }
    @Then("user clicks on the make an appointment icon")
    public void user_clicks_on_the_make_an_appointment_icon() {

        Driver.wait(2);
        PatientHomePage.makeAppoInDropDown.click();
        Driver.wait(2);
        PatientHomePage.phoneNumBox.sendKeys("123-333-4567");
        Driver.wait(3);

    }
    @Then("user clicks on send an appointment button")
    public void user_clicks_on_send_an_appointment_button() {

        Driver.waitAndClick(sendRequestForAppointment, 5);
        sendRequestForAppointment.click();
        Driver.wait(2);
        Assert.assertTrue(alertAfterSendAppoRequest.isDisplayed());
        Driver.closeDriver();

    }
    @When("user signs in as Staff")
    public void user_signs_in_as_staff() {

        Driver.waitAndSendText(homePage.usernameBox, "team02_staff", 10);
        Driver.waitAndSendText(homePage.passwordBox, "merve_mahir", 3);
        homePage.signInSubmitButton.click();

    }
    @Then("user staff clicks on MYPAGE dropdown")
    public void user_staff_clicks_on_mypage_dropdown() {

        Driver.waitAndClick(staffHomePage.myPagesButton, 3);


    }
    @Then("user staff clikcs on Search Patient button")
    public void user_staff_clikcs_on_search_patient_button() {
        Driver.waitAndClickElement(staffHomePage.searchPatientDropdown, 2);

    }
    @Then("user staff enters patients SSN box {string}")
    public void user_staff_enters_patients_ssn_box(String patientSsnBoxValue) {

        Driver.wait(3);
        Driver.waitAndClick(staffHomePage.patientSSNSearchBox, 3);
       Driver.getDriver().navigate().refresh();
        ReusableMethods.waitForVisibility(staffHomePage.patientSSNSearchBox, 3);
        Driver.waitAndClick(staffHomePage.patientSSNSearchBox);
        Driver.waitAndSendText(staffHomePage.patientSSNSearchBox, "555-22-2345");


    }
    @Then("user staff clicks on show appointments button")
    public void user_staff_clicks_on_show_appointments_button() {

        JSUtils.scrollIntoViewJS(staffHomePage.showAppoButton);
        ReusableMethods.waitForClickablility(staffHomePage.showAppoButton, 3);
        JSUtils.scrollAllUpByJS();
        ReusableMethods.waitFor(3);
        staffHomePage.showAppoButton.click();

    }
    @Then("user staff clicks on edit button for cretaed appointment")
    public void user_staff_clicks_on_edit_button_for_cretaed_appointment() {
        Driver.wait(2);
        staffHomePage.editButton.click();

    }
    @Then("user staff selects pending for appointment status")
    public void user_staff_selects_pending_for_appointment_status() {
        Select statusDD= new Select(staffHomePage.statusDropDown);
        statusDD.selectByVisibleText("PENDING");

    }
    @Then("user staff assigns the doctor for the patient as {string}")
    public void user_staff_assigns_the_doctor_for_the_patient_as(String selectPhysician) {

        Driver.wait(2);
        Driver.waitAndSendText(staffHomePage.anamnesisTextBox, "anamnesis");
        Driver.waitAndClick(staffHomePage.treatmentTextBox);
        Driver.waitAndSendText(staffHomePage.treatmentTextBox, "treatment");
        Driver.waitAndSendText(staffHomePage.diagnosisTextBox, "Mygren");
        Driver.waitAndSendText(staffHomePage.prescriptionTextBox, "Prescription");
        Driver.waitAndSendText(staffHomePage.descriptionTextBox, "Description");
        staffHomePage.physicianAssignmentDropDownEle.sendKeys(Keys.DOWN);
        Driver.wait(10);
        Select physicianAssignment= new Select(staffHomePage.physicianAssignmentDropDownEle);
        physicianAssignment.selectByVisibleText("277696:Bilge Dede:ALLERGY_IMMUNOLOGY");

    }
    @Then("user staff cliks on save button")
    public void user_staff_cliks_on_save_button() {

        Driver.waitAndClick(staffHomePage.saveButtonOnAppoEditPage, 3);
        staffHomePage.saveButtonOnAppoEditPage.click();

    }
}
