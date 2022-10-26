package stepdefinitions.uiStepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;
import pages.base.AccountSettingsPage;
import pages.base.AccountSignOutPage;
import pages.base.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class UserSettingsPageStepDefs {
    SoftAssert softAssert=new SoftAssert();
    HomePage homePage=new HomePage();
    AccountSettingsPage accountSettingsPage=new AccountSettingsPage();
     AccountSignOutPage accountSignOutPage=new AccountSignOutPage();
    @Given("User goes to url")
    public void user_goes_to_url() {
        Driver.getDriver().get(ConfigReader.getProperty("medunna_url"));
        Driver.waitForPageToLoad(30);
    }
    @Then("Verify the url title")
    public void verify_the_url_title() {
        Assert.assertEquals(Driver.getDriver().getTitle(),"MEDUNNA");
    }
    @When("Click the sign in link and sign in dropdown")
    public void click_the_sign_in_link_and_sign_in_dropdown() {
        Driver.waitAndClick(homePage.signInAndAccountIcon);
        Driver.waitAndClick(homePage.signIn);
    }
    @When("Sign in as {string}")
    public void sign_in_as(String account) {
        Driver.waitForClickablility(homePage.usernameBox,5);
        switch (account) {
            case "admin":
                homePage.usernameBox.sendKeys(ConfigReader.getProperty("nesibeAdmin_username"));
                homePage.passwordBox.sendKeys(ConfigReader.getProperty("nesibeAdmin_password"));
                break;
            case "user":
                homePage.usernameBox.sendKeys(ConfigReader.getProperty("nesibeUser_username"));
                homePage.passwordBox.sendKeys(ConfigReader.getProperty("nesibeUser_password"));
                break;
            case "staff":
                homePage.usernameBox.sendKeys(ConfigReader.getProperty("nesibeStaff_username"));
                homePage.passwordBox.sendKeys(ConfigReader.getProperty("nesibeStaff_password"));
                break;
            case "physician":
                homePage.usernameBox.sendKeys(ConfigReader.getProperty("nesibePhysician_username"));
                homePage.passwordBox.sendKeys(ConfigReader.getProperty("nesibePhysician_password"));
                break;
            case "patient":
                homePage.usernameBox.sendKeys(ConfigReader.getProperty("nesibePatient_username"));
                homePage.passwordBox.sendKeys(ConfigReader.getProperty("nesibePatient_password"));
                break;
        }
        Driver.waitAndClick(homePage.signInSubmitButton);
    }
    @Then("Verify account contains firstName and lastName of {string}")
    public void verifyAccountContainsFirstNameAndLastNameOf(String account) {
        String firstName;
        String lastName;
        ReusableMethods.waitForVisibility(homePage.accountText,5);
        switch (account) {
            case "admin":
                firstName=ConfigReader.getProperty("nesibeAdmin_firstname");
                lastName=ConfigReader.getProperty("nesibeAdmin_lastname");
                Assert.assertEquals(Driver.waitAndGetText(homePage.accountText,5),firstName+" "+lastName);
                break;
            case "user":
                firstName=ConfigReader.getProperty("nesibeUser_firstname");
                lastName=ConfigReader.getProperty("nesibeUser_lastname");
                Assert.assertEquals(Driver.waitAndGetText(homePage.accountText,15),firstName+" "+lastName);
                break;
            case "staff":
                firstName=ConfigReader.getProperty("nesibeStaff_firstname");
                lastName=ConfigReader.getProperty("nesibeStaff_lastname");
                Assert.assertEquals(Driver.waitAndGetText(homePage.accountText,15),firstName+" "+lastName);
                break;
            case "physician":
                firstName=ConfigReader.getProperty("nesibePhysician_firstname");
                lastName=ConfigReader.getProperty("nesibePhysician_lastname");
                Assert.assertEquals(Driver.waitAndGetText(homePage.accountText,15),firstName+" "+lastName);
                break;
            case "patient":
                firstName=ConfigReader.getProperty("nesibePatient_firstname");
                lastName=ConfigReader.getProperty("nesibePatient_lastname");
                Assert.assertEquals(Driver.waitAndGetText(homePage.accountText,15),firstName+" "+lastName);
                break;
        }
    }
    @When("Click account button and settings dropdown")
    public void click_account_button_and_settings_dropdown() {
        Driver.waitAndClick(homePage.accountClick);
        Driver.waitAndClick( homePage.settingsLink,5);
    }
    @Then("Verify page url is {string}")
    public void verify_page_url_is(String pageUrl) {
        Assert.assertEquals(pageUrl,Driver.getDriver().getCurrentUrl());
    }
    @And("Verify if firstNameBox is not empty")
    public void verifyIfFirstNameBoxIsNotEmpty() {
        Assert.assertFalse(accountSettingsPage.firstNameBox.getAttribute("value").isEmpty());
    }
    @And("Verify if lastNameBox is not empty")
    public void verifyIfLastNameBoxIsNotEmpty() {
        Assert.assertFalse(accountSettingsPage.lastNameBox.getAttribute("value").isEmpty());
    }
    @And("Verify if emailBox is not empty")
    public void verifyIfEmailBoxIsNotEmpty() {
        Assert.assertFalse(accountSettingsPage.emailBox.getAttribute("value").isEmpty());
    }
    @When("Send a new firstname to the firstname box and click save button")
    public void send_a_new_firstname_to_the_firstname_box_and_click_save_button() {
        accountSettingsPage.firstNameBox.clear();
        accountSettingsPage.firstNameBox.sendKeys(Faker.instance().name().firstName());
        accountSettingsPage.saveButton.click();
    }
    @When("Send a new lastname to the lastname box and click save button")
    public void send_a_new_lastname_to_the_lastname_box_and_click_save_button() {
        accountSettingsPage.lastNameBox.clear();
        accountSettingsPage.lastNameBox.sendKeys(Faker.instance().name().lastName());
        accountSettingsPage.saveButton.click();
    }
    @Then("Verify save alert")
    public void verify_save_alert() {
        Assert.assertEquals(accountSettingsPage.alert.getAttribute("innerHTML"),"Settings saved!");
    }
    @When("Click account and Click sign out dropdown")
    public void click_account_and_click_sign_out_dropdown() {
        homePage.accountClick.click();
        Driver.waitAndClick(homePage.signOut);
    }
    @Then("Verify -THANK YOU FOR CHOOSING US...- text")
    public void verifyTHANKYOUFORCHOOSINGUSText() {
        Driver.waitForPageToLoad(5);
        Assert.assertEquals(Driver.waitAndGetText(accountSignOutPage.thankYouForChoosingUsText,10),"THANK YOU FOR CHOOSING US...");
    }
    @Then("Close page")
    public void close_page() {
    }
    @Given("sign in as {string} fix firstname and lastname")
    public void signInAsFixFirstnameAndLastname(String account) {
        Driver.getDriver().get(ConfigReader.getProperty("medunna_url"));
        Driver.waitForPageToLoad(30);
        Driver.waitAndClick(homePage.signInAndAccountIcon);
        Driver.waitAndClick(homePage.signIn);
        Driver.waitForClickablility(homePage.usernameBox,5);
        switch (account) {
            case "admin":
                homePage.usernameBox.sendKeys(ConfigReader.getProperty("nesibeAdmin_username"));
                homePage.passwordBox.sendKeys(ConfigReader.getProperty("nesibeAdmin_password"));
                break;
            case "user":
                homePage.usernameBox.sendKeys(ConfigReader.getProperty("nesibeUser_username"));
                homePage.passwordBox.sendKeys(ConfigReader.getProperty("nesibeUser_password"));
                break;
            case "staff":
                homePage.usernameBox.sendKeys(ConfigReader.getProperty("nesibeStaff_username"));
                homePage.passwordBox.sendKeys(ConfigReader.getProperty("nesibeStaff_password"));
                break;
            case "physician":
                homePage.usernameBox.sendKeys(ConfigReader.getProperty("nesibePhysician_username"));
                homePage.passwordBox.sendKeys(ConfigReader.getProperty("nesibePhysician_password"));
                break;
            case "patient":
                homePage.usernameBox.sendKeys(ConfigReader.getProperty("nesibePatient_username"));
                homePage.passwordBox.sendKeys(ConfigReader.getProperty("nesibePatient_password"));
                break;
        }
        Driver.waitAndClick(homePage.signInSubmitButton);
        Driver.waitAndClick(homePage.accountClick);
        //  ReusableMethods.waitForClickablility(userSettings.settingsLink,10);
        Driver.waitAndClick( homePage.settingsLink,5);
        accountSettingsPage.firstNameBox.clear();
        accountSettingsPage.lastNameBox.clear();
        switch (account) {
            case "admin":
                accountSettingsPage.firstNameBox.sendKeys("Ruzgar");
                accountSettingsPage.lastNameBox.sendKeys("Efe");
                break;
            case "user":
                accountSettingsPage.firstNameBox.sendKeys("Irmak");
                accountSettingsPage.lastNameBox.sendKeys("Gider");
                break;
            case "staff":
                accountSettingsPage.firstNameBox.sendKeys("Damla");
                accountSettingsPage.lastNameBox.sendKeys("Dolar");
                break;
            case "physician":
                accountSettingsPage.firstNameBox.sendKeys("Nehir");
                accountSettingsPage.lastNameBox.sendKeys("Akar");
                break;
            case "patient":
                accountSettingsPage.firstNameBox.sendKeys("Yagmur");
                accountSettingsPage.lastNameBox.sendKeys("Bereket");
                break;
        }
        accountSettingsPage.saveButton.click();
        homePage.accountClick.click();
        Driver.waitAndClick(homePage.signOut);
    }
}
