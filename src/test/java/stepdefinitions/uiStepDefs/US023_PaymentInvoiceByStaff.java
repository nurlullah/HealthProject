package stepdefinitions.uiStepDefs;

import io.cucumber.java.en.*;
import io.restassured.response.Response;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import pages.base.HomePage;
import pages.patient.PatientHomePage;
import pages.physician.PhysicianHomePage;
import pages.staff.StaffHomePage;
import pojos.IdForPatient;
import pojos.IdForPatientPut;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;
import static pages.patient.PatientHomePage.*;

public class US023_PaymentInvoiceByStaff {
    HomePage homePage = new HomePage();

    PatientHomePage patientHomePage=new PatientHomePage();
    StaffHomePage staffHomePage=new StaffHomePage();
    PhysicianHomePage physicianHomePage = new PhysicianHomePage();
    Driver driver=new Driver();
    PatientPageStepDefs expectedID=new PatientPageStepDefs();
    IdForPatient expectedPatientPost = new IdForPatient();
    IdForPatientPut expectedPatientPut=new IdForPatientPut();
    private static int patientId;
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
        Driver.getDriver().navigate().   refresh();
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
    //03

    @When("user physician signs in as physician")
    public void user_physician_signs_in_as_physician() {
        Driver.wait(2);
        physicianUsernameBox.sendKeys("team02_physician");
        homePage.passwordBox.sendKeys("bilge_dede");
        Driver.waitAndClick(homePage.signInSubmitButton, 3);

    }
    @Then("user physician clicks on MyPages dropdown button")
    public void user_physician_clicks_on_my_pages_dropdown_button() {
        ReusableMethods.waitFor(3);

        Driver.waitForClickablility(physicianHomePage.myPagesIconAlternative, 3);
        physicianHomePage.myPagesIconAlternative.click();

    }
    @Then("user physician selects My Appointments from dropdown")
    public void user_physician_selects_my_appointments_from_dropdown() {


    }

    @Then("user physician clicks on edit button for the assigned appointment")
    public void user_physician_clicks_on_edit_button_for_the_assigned_appointment() {

    }
    @Then("user physician clicks on Request A Test button")
    public void user_physician_clicks_on_request_a_test_button() {

    }
    @Then("user physician selects cccs, Sodium and Urea tests")
    public void user_physician_selects_cccs_sodium_and_urea_tests() {

    }
    @Then("user physician clicks on save button on test list section")
    public void user_physician_clicks_on_save_button_on_test_list_section() {

    }
    @Then("user physician selects completed option from status dropdown")
    public void user_physician_selects_completed_option_from_status_dropdown() {

    }
    @Then("user physician selects anamneis, treatment, diagnosis checkboxes")
    public void user_physician_selects_anamneis_treatment_diagnosis_checkboxes() {

    }
    @Then("user physician clicks on save button in the Create or Edit an Appointment section")
    public void user_physician_clicks_on_save_button_in_the_create_or_edit_an_appointment_section() {

    }

    //04
    @Then("user staff clicks on payment/invoice process button for the patient")
    public void user_staff_clicks_on_payment_invoice_process_button_for_the_patient() {

    }
    @Then("user staff clicks on create invoice button")
    public void user_staff_clicks_on_create_invoice_button() {

    }
    @Then("user Staff clicks on save button on create or edit payment button")
    public void user_staff_clicks_on_save_button_on_create_or_edit_payment_button() {

    }
    @Then("user staff clicks on payment button for the patient")
    public void user_staff_clicks_on_payment_button_for_the_patient() {

    }
    @Then("user staff clicks on show invoice button")
    public void user_staff_clicks_on_show_invoice_button() {

    }
    @Then("user staff verifies that invoice is created")
    public void user_staff_verifies_that_invoice_is_created() {

    }










}
