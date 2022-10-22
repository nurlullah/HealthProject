package stepdefinitions.uiStepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.base.HomePage;
import pages.base.AccountPasswordPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class us08_passwordEdition_StepDef {
    AccountPasswordPage userPasswordPage= new AccountPasswordPage();
    HomePage homePage = new HomePage();


    @Given("user opens the URL {string}")
    public void user_opens_the_url(String url) {
        Driver.getDriver().get(url);
    }

    @When("user navigate to user icon")
    public void user_navigate_to_user_icon() {
        Driver.wait(1);
        homePage.signInAndAccountIcon.click();
    }


    @When("user click on Sign in button")
    public void user_click_on_sign_in_button() {
        Driver.wait(3);
       ReusableMethods.waitForClickablility(homePage.signIn, 3);
       homePage.signIn.click();
    }

    @When("user enters username as {string} and password as {string} and click on Sign in button")
    public void user_enters_username_as_and_password_as_and_click_on_sign_in_button(String username, String password) {
        homePage.usernameBox.sendKeys(username);
        homePage.passwordBox.sendKeys(password);
        homePage.signInSubmitButton.click();
        Driver.wait(3);
    }

    @When("navigate to userId")
    public void navigate_to_user_id() throws InterruptedException {
        Driver.wait(2);
     //ReusableMethods.waitForClickablility(userPasswordPage.userButton, 3);
     userPasswordPage.userButton.click();
        Driver.wait(2);
    }

    @When("click  password button")
    public void click_password_button() {
       // ReusableMethods.waitForClickablility(homePage.password, 3);
        Driver.wait(2);
        homePage.password.click();
    }

    @When("send current {string}")
    public void send_current(String password) {
        userPasswordPage.currentPassword.sendKeys(password);
    }

    @Then("Send {string} with one lowercase")
    public void send_with_one_lowercase(String newPassword) {
        userPasswordPage.newPassword.sendKeys(newPassword);
        Driver.wait(1);
    }

    @Then("verify the level chart change accordingly")
    public void verifyTheLevelChartChangeAccordingly() {
        Assert.assertTrue(userPasswordPage.orangeStrengthBar.isDisplayed());
        Driver.wait(1);
    }



    @Then("Send {string} with one uppercase")
    public void send_with_one_uppercase(String newPassword) {
        userPasswordPage.newPassword.sendKeys(newPassword);
    }

    @Then("Send {string} with one digit")
    public void send_with_one_digit(String newPassword) {
        userPasswordPage.newPassword.sendKeys(newPassword);
    }

    @Then("Send {string} with one special char")
    public void send_with_one_special_char(String newPassword) {
        userPasswordPage.newPassword.sendKeys(newPassword);
    }

    @Then("Send {string} with seven chars")
    public void send_with_seven_chars(String newPassword) {
        userPasswordPage.newPassword.sendKeys(newPassword);
    }


    @Then("Send  {string} as new Password")
    public void send_as_new_password(String oldPassword) {
        userPasswordPage.newPassword.sendKeys(oldPassword);
    }

    @Then("send {string} to confirmation and click save button")
    public void send_to_confirmation_and_click_save_button(String oldPassword) {
        userPasswordPage.newPasswordConfirmation.sendKeys(oldPassword);
        userPasswordPage.saveButton.click();
    }


    @Then("Send {string}")
    public void send(String newPassword) {
        userPasswordPage.newPassword.sendKeys(newPassword);
    }

    @Then("send {string} to confirm and click save button")
    public void send_to_confirm_and_click_save_button(String newPassword) throws InterruptedException {
        userPasswordPage.newPasswordConfirmation.sendKeys(newPassword);
        userPasswordPage.saveButton.click();
        Thread.sleep(1);
    }

    @Then("verify the error message")
    public void verify_the_error_message() throws InterruptedException {
        Driver.wait(1);
        String errorMessage =  userPasswordPage.oldPasswordMessage.getText();
        System.out.println("error massage" +errorMessage);
        Driver.wait(1);
        Assert.assertEquals("Old password can not be used", errorMessage);
        Driver.wait(1);
    }


    @Then("verify the confirmation message")
    public void verify_the_confirmation_message() throws InterruptedException {
        Driver.wait(1);
        String password = userPasswordPage.successMessage.getText();

        Driver.wait(1);
        Assert.assertEquals("Password changed!", password);
        Driver.wait(1);
    }

    @Then("verify the level chart change strongest")
    public void verifyTheLevelChartChangeStrongest() {
        Assert.assertTrue(userPasswordPage.fullGreenStrengthBar.isDisplayed());
    }

    @And("close the Page")
    public void closeThePage() {
        Driver.closeDriver();
    }
}

