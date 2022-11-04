package stepdefinitions.uiStepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.base.AccountSignOutPage;
import pages.base.HomePage;
import pages.base.RegistrationPage;
import pages.base.ResetPasswordPage;
import utilities.ConfigReader;
import utilities.Driver;

public class SignInStepDefs {

    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    AccountSignOutPage accountSignOutPage = new AccountSignOutPage();
    ResetPasswordPage resetPasswordPage = new ResetPasswordPage();


    //positive_scenario

    @Given("user opens the url {string}")
    public void user_opens_the_url(String string) {

        Driver.getDriver().get(ConfigReader.getProperty("medunna_url"));

    }
    @When("click the sign in symbol and sign in button")
    public void click_the_sign_in_symbol_and_sign_in_button() {

        homePage.signInAndAccountIcon.click();
        homePage.signIn.click();

    }

    @When("enter the valid username as {string}")
    public void enter_the_valid_username_as(String string) {

        homePage.usernameBox.sendKeys(string);

    }

    @When("enter the valid password as {string}")
    public void enter_the_valid_password_as(String string) {

        homePage.passwordBox.sendKeys(string);

    }

    @When("user click the sign in button")
    public void user_click_the_sign_in_button() {

        homePage.signInSubmitButton.click();

    }


    @Then("verify the sign in successfully")
    public void verify_the_sign_in_successfully() {

        Assert.assertTrue(homePage.trueSignIn.isEnabled());

    }


    @Then("click the sign out button")
    public void click_the_sign_out_button() {

        homePage.trueSignIn.click();
        homePage.signOut.click();

    }


    @Then("verify the sign out successfully")
    public void verify_the_sign_out_successfully() {

        Assert.assertTrue("Thank you for choosing us.. text is not displayed",accountSignOutPage.thankYouForChoosingUsText.isDisplayed());

    }


    //negative_scenario

    @When("enter the invalid username as {string}")
    public void enter_the_invalid_username_as(String string) {

        homePage.usernameBox.sendKeys(string);



        Faker.instance().number().randomDigitNotZero();

    }

    @When("enter the invalid password as {string}")
    public void enter_the_invalid_password_as(String string) {

        homePage.passwordBox.sendKeys(string);
    }

    @Then("verify the unsuccessful test case")
    public void verify_the_unsuccessful_test_case() {
        homePage.failedToSignInText.isDisplayed();

    }


    //remember_me_box
    @Then("verify the remember me option is enabled")
    public void verify_the_remember_me_option_is_enabled() {

        Assert.assertTrue("Remember me box is not enabled!!", homePage.rememberMeCheckbox.isEnabled());

    }



    //forget_password_button
    @Then("verify the {string} button is enabled and clickable")
    public void verify_the_button_is_enabled_and_clickable(String string) {

        Assert.assertTrue( "Did you forget button is not enabled!!", homePage.forgetPasswordButton.isEnabled());

    }

    @Then("click the forget password button")
    public void click_the_forget_password_button() {

        homePage.forgetPasswordButton.click();

    }

    @Then("verify the forget password page")
    public void verify_the_forget_password_page() {

        resetPasswordPage.resetPasswordButton.isDisplayed();

    }

    //registration_page
    @Then("verify the registration button is enabled and clickable")
    public void verify_the_registration_button_is_enabled_and_clickable(){

        Assert.assertTrue(Driver.waitForVisibility(homePage.registerNewAccountButton,5).isDisplayed());


    }

    @Then("click the registration button")
    public void click_the_registration_button() {

        homePage.registerNewAccountButton.click();
        homePage.registerNewAccountButton.click();
    }

    @Then("verify the registration page")
    public void verify_the_registration_page() throws InterruptedException {
        Thread.sleep(2000);
        registrationPage.registrationText.isDisplayed();

    }


    //cancel_button
    @Then("verify the cancel button is enabled")
    public void verify_the_cancel_button_is_enabled() {

        Assert.assertTrue("Cancel button is not enabled!!", homePage.cancelButton.isEnabled());

    }

    @Then("close the application")
    public void close_the_application() {

        Driver.closeDriver();

    }

}
