package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.base.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;
import java.util.Map;

public class BackgroundStepDefs {

    HomePage homePage = new HomePage();

    @Given("user goes to URL {string}")
    public void userGoesToURL(String arg0) {
        Driver.getDriver().get(ConfigReader.getProperty("medunna_url"));
    }

    @Then("verify the page title contains {string}")
    public void verify_the_page_title_contains(String title) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(title));
    }
    @When("user navigates on the login page")
    public void user_navigates_on_the_login_page() {
        homePage.signInAndAccountIcon.click();
        homePage.signIn.click();
        ReusableMethods.waitFor(3);
        Assert.assertTrue(homePage.singInTitleText.isDisplayed());
    }
    @When("user enters username and password  and click on login button")
    public void user_enters_username_and_password_and_click_on_login_button(DataTable credentials) {
        List<Map<String, String>> customerCredentials = credentials.asMaps(String.class, String.class);
        for (Map<String, String> each : customerCredentials) {
            homePage.passwordBox.click();
            Assert.assertTrue(homePage.usernameCannotBeEmptyMessage.isDisplayed());
            homePage.usernameBox.click();
            Assert.assertTrue(homePage.passwordCannotBeEmptyMessage.isDisplayed());
            homePage.usernameBox.clear();
            homePage.usernameBox.sendKeys(each.get("username") + Keys.ENTER);
            homePage.passwordBox.clear();
            homePage.passwordBox.sendKeys(each.get("password") + Keys.ENTER);
            homePage.signInSubmitButton.click();
        }
    }

    @Then("verify the login is successful")
    public void verify_the_login_is_successful(DataTable credentials) {
        ReusableMethods.waitFor(3);
        String username = homePage.singedInPersonName.getText();
        List<Map<String, String>> customerCredentials = credentials.asMaps(String.class, String.class);
        for (Map<String, String> each : customerCredentials) {
            Assert.assertEquals(username, each.get("firstname") + " " + each.get("lastname"));
        }

    }
}
