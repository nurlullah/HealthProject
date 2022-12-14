package stepdefinitions.uiStepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.base.HomePage;
import pages.base.RegistrationPage;
import pojos.User;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

public class RegistrationPageStepDefs {


    RegistrationPage registrationPage = new RegistrationPage();
    Faker faker = new Faker();
    User user = new User();

    @Then("Verify Registration text")
    public void verify_registration_text() {
        Driver.wait(1);
        Assert.assertTrue(registrationPage.registrationText.isDisplayed());

    }

    @When("Enter SSN number Faker")
    public void enter_ssn_number_Faker() {
        Driver.wait(1);
        user.setSsn(faker.idNumber().ssnValid());
        registrationPage.ssn.sendKeys(user.getSsn());

    }

    @When("Enter First Name Faker")
    public void enter_first_name_Faker() {
        Driver.wait(1);
        user.setFirstname(faker.name().firstName());
        registrationPage.firstName.sendKeys(user.getFirstname());

    }

    @When("Enter Last Name Faker")
    public void enter_last_name_Faker() {
        Driver.wait(1);
        user.setLastName(faker.name().lastName());
        registrationPage.lastName.sendKeys(user.getLastName());

    }

    @When("Click on the username box and click  Enter")
    public void click_on_the_username_box_and_click_enter() {
        Driver.wait(1);

        registrationPage.userName.sendKeys(Keys.ENTER);

    }

    @Then("Verify Your username is required.")
    public void verify_your_username_is_required() {
        Driver.wait(1);
        Assert.assertTrue(registrationPage.usernameisrequired.isDisplayed());

    }

    @When("Enter any chars on the {string}")
    public void enterAnyCharsOnThe(String username) {
        Driver.wait(1);
        user.setLogin(username);
        registrationPage.userName.sendKeys(user.getLogin());

    }

    @Given("User enters four chars password {string}")
    public void user_enters_four_chars_password(String password) {

        Driver.sleep(1000);
        Driver.waitAndSendText(registrationPage.newPassword, password, 5);
        user.setPassword(password);

    }

    @Then("User verifies password chart red color is {string}")
    public void user_verifies_password_chart_red_color_is(String level) {
        colorStrength(level);
        Driver.wait(1);
    }

    @Given("user enters seven chars that possibilities with two combination {string}")
    public void user_enters_seven_chars_that_possibilities_with_two_combination(String password) {

        Driver.sleep(1000);
        Driver.waitAndSendText(registrationPage.newPassword, password, 5);

    }

    @Then("User verifies password chart orange color is {string}")
    public void user_verifies_password_chart_orange_color_is(String level) {
        colorStrength(level);
        Driver.wait(1);
    }

    @Given("user enters seven chars that possibilities with three combinations {string}")
    public void user_enters_seven_chars_that_possibilities_with_three_combinations(String password) {
        Driver.sleep(1000);
        Driver.waitAndSendText(registrationPage.newPassword, password, 5);

    }

    @Then("User verifies password with four chart green color is {string}")
    public void user_verifies_password_with_four_chart_green_color_is(String level) {
        colorStrength(level);
        Driver.wait(1);
    }

    @Given("User enters seven chars that possibilities with four combinations {string}")
    public void user_enters_seven_chars_that_possibilities_with_four_combinations(String password) {
        Driver.sleep(1000);
        Driver.waitAndSendText(registrationPage.newPassword, password, 5);

    }

    @Then("User verifies password with four chart green color with five bar is {string}")
    public void user_verifies_password_with_four_chart_green_color_with_five_bar_is(String level) {
        colorStrength(level);
        Driver.wait(1);
    }

    @Then("User enters the confirm {string}")
    public void user_enters_the_confirm(String confirmPassword) {
        Driver.sleep(1000);
        Driver.waitAndSendText(registrationPage.confirmPassword, confirmPassword, 5);
        Driver.wait(2);

    }

    @Given("User types into password {string}")
    public void user_types_into_password(String strengthPassword) {
        Driver.sleep(1000);
        Driver.waitAndSendText(registrationPage.newPassword, strengthPassword, 5);

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
        Driver.wait(3);
        ReusableMethods.storeObjectInAFile(user);
        //FileWriterForData class ??n?? kullanarak datalar??m??z?? pojodaki t??m bilgilerle kaydetmi?? oluyoruz
        //saveData(registrationPojo); sadece bu ??ekilde import ederek de kullanbiliriz. ????nk?? method static
        //FileWriterForData.saveData(registrationPojo);
    }

    @Then("verify the Registration Saved text")
    public void verifyTheRegistrationSavedText() {
        Assert.assertTrue(registrationPage.registrationText.isDisplayed());
        Driver.wait(2);
    }

    //close the app
    @Then("User closes the application")
    public void user_closes_the_application() {
        Driver.wait(2);
        Driver.closeDriver();

    }


    //method
    public void colorStrength(String level) {

        if (1 == Integer.parseInt(level)) {
            Assert.assertTrue(registrationPage.redStrengthBar.isDisplayed());
            Driver.wait(1);
        } else if (2 == Integer.parseInt(level)) {
            Assert.assertTrue(registrationPage.orangeStrengthBar.isDisplayed());
            Driver.wait(1);
        } else if (3 == Integer.parseInt(level)) {
            Assert.assertTrue(registrationPage.fourGreenStrengthBar.isDisplayed());
            Driver.wait(1);
        } else if (4 == Integer.parseInt(level)) {
            Assert.assertTrue(registrationPage.fullGreenStrengthBar.isDisplayed());
        }
    }

    @When("Type the valid ssn as {string}")
    public void type_the_valid_ssn_as(String ssn) {
        registrationPage.ssn.sendKeys(ssn, Keys.ENTER);
    }

    @When("Type the multiple invalid ssn as {string}")
    public void typeTheMultipleInvalidSsnAs(String ssn) throws InterruptedException {
        registrationPage.ssn.sendKeys(ssn, Keys.ENTER);
        Thread.sleep(2000);
        Assert.assertTrue(registrationPage.textInvalidSSN.isDisplayed());
        System.out.println(registrationPage.textInvalidSSN.getText());

    }

    @When("Click on the ssn box and leave empty ssn")
    public void clickOnTheSsnBoxAndLeaveEmptySsn() {
        registrationPage.ssn.click();
    }

    @When("Click on the firstname box and leave empty firstname box")
    public void click_OnTheFirstnameBoxAndLeaveEmptyFirstnameBox() {
        registrationPage.firstName.click();
    }

    @And("Click on the lastname box and leave empty lastname box")
    public void click_OnTheLastnameBoxAndLeaveEmptyLastnameBox() {
        registrationPage.lastName.click();
    }

    @And("Enter a valid first name into the {string} box")
    public void enterAValidFirstNameIntoTheBox(String firstName) {
        registrationPage.firstName.sendKeys(firstName);
    }

    @And("Enter a valid last name into the {string}box")
    public void enterAValidLastNameIntoTheBox(String lastName) {
        registrationPage.lastName.sendKeys(lastName);
    }

    @And("Enter a valid user name into the {string} box")
    public void enterAValidUserNameIntoTheBox(String userName) {
        registrationPage.userName.sendKeys(userName);
    }

    @And("Enter a valid email into the {string}")
    public void enterAValidEmailIntoThe(String email) {
        registrationPage.email.sendKeys(email);
    }

    @And("Enter a valid password into the {string} box")
    public void enterAValidPasswordIntoTheBox(String password) {
        registrationPage.newPassword.sendKeys(password);
    }

    @And("Enter a confirming password into the {string} box")
    public void enterAConfirmingPasswordIntoTheBox(String confirmPassword) {

        registrationPage.confirmPassword.sendKeys(confirmPassword);

    }

    @Then("Verify text that {string} is displayed")
    public void verify_TextThatIsDisplayed(String text) throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(registrationPage.registrationText.getText().contains(text));
        System.out.println(registrationPage.registrationText.getText());

    }

    @Then("Verify text that contains {string}")
    public void verifyTextThatContains(String text) {
        Assert.assertTrue(registrationPage.textRequiredFirstName.getText().contains(text));
        System.out.println(registrationPage.textRequiredFirstName.getText());
    }

    @Then("Verify text that equals {string}")
    public void verify_TextThatEquals(String text) {
        Assert.assertTrue(registrationPage.textRequiredLastName.getText().contains(text));
        System.out.println(registrationPage.textRequiredLastName.getText());
    }

    @And("Click on the firstname box and click Enter")
    public void clickOnTheFirstnameBoxAndClickEnter() {
        registrationPage.firstName.sendKeys(Keys.ENTER);
    }

    @And("Click on the lastname box and Enter")
    public void clickOnTheLastnameBoxAndEnter() {
        registrationPage.lastName.sendKeys(Keys.ENTER);
    }

    @And("Enter Username Faker")
    public void enterUsernameFaker() {
        user.setLogin(faker.name().username());
        registrationPage.userName.sendKeys(user.getLogin());
    }

    @And("Enter Email Address Faker")
    public void enterEmailAddressFaker() {
        user.setEmail(faker.internet().emailAddress());
        registrationPage.email.sendKeys(user.getEmail());
    }

    @And("Enter {string} box without @ sign and .")
    public void enterBoxWithoutSignAnd(String email) {
        registrationPage.email.sendKeys(email, Keys.ENTER);
    }

    @Then("Verify the This field is invalid is displayed. text")
    public void verifyTheThisFieldIsInvalidIsDisplayedText() {
        Driver.wait(1);
        Assert.assertTrue(registrationPage.thisFileIsInvalidEmailText.isDisplayed());
 }
}