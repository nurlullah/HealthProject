package stepdefinitions.uiStepDefs;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.base.HomePage;
import pages.physician.PhysicianHomePage;
import pages.physician.PhysicianMyInPatientPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class PhysicianViewEditInpatientsStepDefs {
    HomePage homePage=new HomePage();
    PhysicianHomePage physicianHomePage=new PhysicianHomePage();
    PhysicianMyInPatientPage physicianMyInPatientPage=new PhysicianMyInPatientPage();


    @When("Doctor clicks the sign in symbol")
    public void doctor_clicks_the_sign_in_symbol() {
        homePage.signInAndAccountIcon.click();
        Driver.wait(1);
    }
    @And("Doctor click Sign In dropdown button on HomePage")
    public void doctorClickSignInDropdownButtonOnHomePage() {
        homePage.signIn.click();
        Driver.wait(1);
    }

    @When("Doctor enters a valid username on Sign In Page")
    public void doctor_enters_a_valid_username_on_sign_in_page() {
     homePage.usernameBox.sendKeys(ConfigReader.getProperty("physician_username"), Keys.TAB);
     Driver.wait(1);
    }
    @When("Doctor enters a valid password on Sign In Page")
    public void doctor_enters_a_valid_password_on_sign_in_page() {
     homePage.passwordBox.sendKeys(ConfigReader.getProperty("physician_password"));
     Driver.wait(1);
    }
    @When("Doctor clicks the Sign In button on Sign In Page")
    public void doctor_clicks_the_sign_in_button_on_sign_in_page() {
        homePage.signInSubmitButton.click();
        Driver.wait(3);
    }
    @When("Doctor clicks on MY PAGES")
    public void doctor_clicks_on_my_pages() {
        Driver.waitForVisibility(physicianHomePage.myPagesIconAlternative,10);
        physicianHomePage.myPagesIconAlternative.click();

    }
    @Then("Doctor clicks on My inPatients")
    public void doctor_clicks_on_my_in_patients() throws InterruptedException {
        Driver.waitForVisibility(physicianHomePage.myInpatients,10);
        physicianHomePage.myInpatients.click();
        Thread.sleep(2000);

    }
    @Then("Doctor verifies the all items Inpatient is visible in Inpatient page")
    public void doctorVerifiesTheAllItemsInpatientIsVisibleInInpatientPage() throws IOException, InterruptedException {
        Driver.waitForVisibility(physicianMyInPatientPage.allItemsInMyPatientsPage,5);
        Assert.assertTrue(physicianMyInPatientPage.allItemsInMyPatientsPage.isDisplayed());
        ReusableMethods.getScreenshot("@DoctorViewAllItems");
        Thread.sleep(2000);
    }
    @Then("Doctor closes the application")
    public void doctor_closes_the_application() {
        Driver.closeDriver();
    }



}
