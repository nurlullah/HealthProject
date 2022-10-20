package stepdefinitions.uiStepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.base.HomePage;
import pages.base.RegistrationPage;
import utilities.ConfigReader;
import utilities.Driver;

import utilities.JSUtils;

public class US03_RegistrationPagePassword {

    HomePage homePage=new HomePage();
    RegistrationPage registrationPage =new RegistrationPage();

    @Given("User goes to the medunna url")
    public void user_goes_to_the_medunna_url() {
        Driver.getDriver().get(ConfigReader.getProperty("medunna_url"));
    }
    @When("User clicks the sign in symbol and register dropdown button")
    public void user_clicks_the_sign_in_symbol_and_register_dropdown_button() {
        homePage.signInAndAccountIcon.click();
        Driver.wait(1);
        homePage.register.click();
    }
    @Then("User enters ssn {string}")
    public void userEntersSsn(String ssn) {
        Driver.sleep(1000);
      registrationPage.ssn.sendKeys(Faker.instance().idNumber().ssnValid());
    }

    @And("User enters firstname {string}")
    public void userEntersFirstname(String firstName) {
        Driver.sleep(1000);
       registrationPage.firstName.sendKeys(Faker.instance().name().firstName());

    }

    @And("User enters lastname {string}")
    public void userEntersLastname(String lastName) {
        registrationPage.lastName.sendKeys(Faker.instance().name().lastName());

    }

    @And("User enters username {string}")
    public void userEntersUsername(String username) {
        Driver.sleep(1000);
       registrationPage.userName.sendKeys(Faker.instance().name().username());
    }



    @And("User enters email {string}")
    public void userEntersEmail(String email) {
        Driver.sleep(1000);
        registrationPage.email.sendKeys(Faker.instance().internet().emailAddress());
    }

    @Given("User enters four chars password {string}")
    public void user_enters_four_chars_password(String password) {

        Driver.sleep(1000);
        Driver.waitAndSendText(registrationPage.newPassword,password,5);

    }


    @Then("User verifies password chart red color is {string}")
    public void user_verifies_password_chart_red_color_is(String level) {
        colorStrength(level);
        Driver.wait(1);
    }

    @Given("user enters seven chars that possibilities with two combination {string}")
    public void user_enters_seven_chars_that_possibilities_with_two_combination(String password) {

        Driver.sleep(1000);
        Driver.waitAndSendText(registrationPage.newPassword,password,5);

    }
    @Then("User verifies password chart orange color is {string}")
    public void user_verifies_password_chart_orange_color_is(String level) {
        colorStrength(level);
        Driver.wait(1);
    }
    @Given("user enters seven chars that possibilities with three combinations {string}")
    public void user_enters_seven_chars_that_possibilities_with_three_combinations(String password) {
        Driver.sleep(1000);
        Driver.waitAndSendText( registrationPage.newPassword,password,5);
    }
    @Then("User verifies password with four chart green color is {string}")
    public void user_verifies_password_with_four_chart_green_color_is(String level) {
        colorStrength(level);
        Driver.wait(1);
    }
    @Given("User enters seven chars that possibilities with four combinations {string}")
    public void user_enters_seven_chars_that_possibilities_with_four_combinations(String password) {
        Driver.sleep(1000);
        Driver.waitAndSendText(registrationPage.newPassword,password,5);

    }
    @Then("User verifies password with four chart green color with five bar is {string}")
    public void user_verifies_password_with_four_chart_green_color_with_five_bar_is(String level) {
        colorStrength(level);
        Driver.wait(1);
    }

    @Then("User enters the confirm {string}")
    public void user_enters_the_confirm(String confirmPassword) {
        Driver.sleep(1000);
        Driver.waitAndSendText(registrationPage.confirmPassword,confirmPassword,5);

    }


    @Given("User types into password {string}")
    public void user_types_into_password(String strengthPassword) {
        Driver.sleep(1000);
        Driver.waitAndSendText(registrationPage.newPassword,strengthPassword,5);

    }
    @Then("User confirms the password strength {string}")
    public void user_confirms_the_password_strength(String level) {
        colorStrength(level);
        Driver.wait(1);
    }
    //Register button
    @Then("User clicks the register button")
    public void user_clicks_the_register_button() {
        JSUtils.clickElementByJS(registrationPage.registerButton);
        Driver.wait(1);
        //FileWriterForData class ını kullanarak datalarımızı pojodaki tüm bilgilerle kaydetmiş oluyoruz
        //saveData(registrationPojo); sadece bu şekilde import ederek de kullanbiliriz. çünkü method static
        //FileWriterForData.saveData(registrationPojo);
    }
    @Then("verify the Registration Saved text")
    public void verifyTheRegistrationSavedText() {
        Assert.assertTrue(registrationPage.registrationText.isDisplayed());
    }

    //close the app
    @Then("User closes the application")
    public void user_closes_the_application() {
        Driver.closeDriver();
    }


    public void colorStrength(String level){

        if (1== Integer.parseInt(level)){
            Assert.assertTrue(registrationPage.redStrengthBar.isDisplayed());
            Driver.wait(1);
        } else if (2==Integer.parseInt(level)) {
            Assert.assertTrue(registrationPage.orangeStrengthBar.isDisplayed());
            Driver.wait(1);
        }else if (3==Integer.parseInt(level)){
            Assert.assertTrue(registrationPage.fourGreenStrengthBar.isDisplayed());
            Driver.wait(1);
        } else if (4==Integer.parseInt(level)) {
            Assert.assertTrue(registrationPage.fullGreenStrengthBar.isDisplayed());
        }
    }

}
