package stepdefinitions.uiStepDefs;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.admin.AdminCreateEditUserPage;
import pages.admin.AdminUserDetailsPage;
import pages.base.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

import java.io.IOException;

public class UserManagementPageByAdmin {

    HomePage homePage=new HomePage();
    AdminUserDetailsPage adminUserDetailsPage=new AdminUserDetailsPage();
    AdminCreateEditUserPage adminCreateEditUserPage=new AdminCreateEditUserPage();

    @When("Admin clicks the sign in symbol")
    public void admin_clicks_the_sign_in_symbol() {
       homePage.signInAndAccountIcon.click();
    }
    @When("Admin click Sign In dropdown button on HomePage")
    public void admin_click_sign_in_dropdown_button_on_home_page() {
       homePage.signIn.click();
       Driver.wait(1);
    }
    @When("Admin enters a valid username on Sign In Page")
    public void admin_enters_a_valid_username_on_sign_in_page() {
      homePage.usernameBox.sendKeys(ConfigReader.getProperty("admin1_username"));

    }

    @When("Admin enters a valid password on Sign In Page")
    public void admin_enters_a_valid_password_on_sign_in_page() {
    homePage.passwordBox.sendKeys(ConfigReader.getProperty("admin1_password"));

    }
    @When("Admin clicks the Sign In button on Sign In Page")
    public void admin_clicks_the_sign_in_button_on_sign_in_page() {
        homePage.signInSubmitButton.click();

    }
    @When("Admin clicks on Administration sign")
    public void admin_clicks_on_administration_sign() {
        ReusableMethods.waitForVisibility(adminCreateEditUserPage.administration,5).click();
    }
    @When("Admin clicks on User Management drop down")
    public void admin_clicks_on_user_management_drop_down() {
        ReusableMethods.waitForVisibility(adminCreateEditUserPage.userManagementPage,3).click();
    }

    @Given("Admin clicks view button on User Management Page")
    public void adminClicksViewButtonOnUserManagementPage() throws InterruptedException {
        JSUtils.clickElementByJS(adminUserDetailsPage.adminViewUserButton);
        Thread.sleep(2000);
    }


    @Then("Admin verifies first name, last name, email and other credentials in view page")
    public void admin_verifies_first_name_last_name_email_and_other_credentials_in_view_page() throws IOException {
        Driver.waitForVisibility(adminUserDetailsPage.firstNameText,5);
        Assert.assertTrue(adminUserDetailsPage.firstNameText.isDisplayed());
        Driver.waitForVisibility(adminUserDetailsPage.lastNameText,5);
        Assert.assertTrue(adminUserDetailsPage.lastNameText.isDisplayed());
        Driver.waitForVisibility(adminUserDetailsPage.emailText,5);
        Assert.assertTrue(adminUserDetailsPage.emailText.isDisplayed());
        ReusableMethods.getScreenshot("@AdminViewInformationOfUsers");
    }

    @Given("Admin clicks edit button on User Management Page")
    public void adminClicksEditButtonOnUserManagementPage() throws InterruptedException {
        JSUtils.clickElementByJS(adminUserDetailsPage.adminEditUserButton);
        Thread.sleep(2000);
    }

    @And("Admin assigns role to the user")
    public void adminAssignsRoleToTheUser() throws InterruptedException {
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(2000);
        Select select=new Select(adminUserDetailsPage.profiles);
        select.selectByVisibleText("ROLE_USER");
        select.selectByVisibleText("ROLE_PATIENT");
        select.selectByVisibleText("ROLE_STAFF");
        select.selectByVisibleText("ROLE_ADMIN");
        select.selectByVisibleText("ROLE_PHYSICIAN");

    }
    @And("Admin clicks on Save button")
    public void adminClicksOnSaveButton() {
        Driver.wait(3);
        Driver.clickWithJS(Driver.waitForVisibility(adminCreateEditUserPage.saveButton,5));
        Assert.assertTrue(Driver.waitForVisibility(adminCreateEditUserPage.savedTextMessage,5).isDisplayed());
    }

    @And("Admin activates user's status")
    public void adminActivatesUserSStatus() {
      Actions actions=new Actions(Driver.getDriver());
      actions.sendKeys(Keys.PAGE_DOWN).build().perform();
      Driver.waitForVisibility(adminCreateEditUserPage.activated,5);
      Driver.wait(1);
      actions.click(adminCreateEditUserPage.activated).perform();
    }

    @And("Admin deletes the user")
    public void adminDeletesTheUser() throws InterruptedException {
        Driver.waitAndClick(adminCreateEditUserPage.lastPage,5);
        Driver.waitForVisibility(adminCreateEditUserPage.lastDeleteButton,5);
        Driver.waitAndClick(adminCreateEditUserPage.lastDeleteButton);
        Driver.wait(3);
        //Driver.waitAndClick(adminCreateEditUserPage.cancelButton,5);
        Driver.waitForVisibility(adminCreateEditUserPage.confirmDeleteOperationPopup,5);
        adminCreateEditUserPage.confirmDeleteAlertButton.click();
        Assert.assertTrue(ReusableMethods.waitForVisibility(adminCreateEditUserPage.userDeletedMessage,5).isDisplayed());
    }

    @Then("Admin closes the application")
    public void admin_closes_the_application() {
        Driver.closeDriver();
    }



}
