package stepdefinitions.uiStepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import pages.admin.AdminCreateEditRoomPage;
import pages.admin.AdminHomePage;
import pages.admin.AdminRoomDetailsPage;
import pages.admin.AdminRoomTablePage;
import pages.base.HomePage;
import utilities.Driver;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;


public class RoomManipulationStepDefs {
    AdminHomePage adminHomePage=new AdminHomePage();
   AdminRoomTablePage adminRoomTablePage=new AdminRoomTablePage();
    AdminCreateEditRoomPage adminCreateEditRoomPage=new AdminCreateEditRoomPage();
    AdminRoomDetailsPage adminRoomDetailsPage=new AdminRoomDetailsPage();
    HomePage homePage=new HomePage();
    Select select;
    String oldDate;
    String futureDate;

    @When("Click on ItemsTitles")
    public void click_on_items_titles() {
        Driver.waitAndClick(adminHomePage.itemTitlesButtonAlternative,15);
    }

    @When("Click on Room button")
    public void click_on_room_button() {
        Driver.waitAndClick(adminHomePage.roomButton,15);
    }

    @When("Click Create a new room button")
    public void click_create_a_new_room_button() {
        Driver.waitForPageToLoad(10);
        Driver.waitAndClick(adminRoomTablePage.createANewRoomButtonAlternative,15);
    }

    @Then("Verify that Create or edit a Room is displayed")
    public void verify_that_create_or_edit_a_room_is_displayed() {
        Driver.waitForPageToLoad(10);
        Assert.assertTrue(adminCreateEditRoomPage.CreateEditRoomTextAlternative.isDisplayed());

    }

    @When("Enter room number")
    public void enterRoomNumber() {
     Driver.waitAndSendText(adminCreateEditRoomPage.roomNumberBoxAlternative,Faker.instance().number().digits(6));
  }

    @When("Clear room number")
    public void clear_room_number() {
        adminCreateEditRoomPage.roomNumberBoxAlternative.clear();
        adminCreateEditRoomPage.roomNumberBoxAlternative.sendKeys(Keys.ENTER);
    }

    @Then("Verify This field is required.")
    public void verify_this_field_is_required() {
    Driver.waitForVisibility(adminCreateEditRoomPage.thisFieldIsRequiredText,5);
    Assert.assertTrue(adminCreateEditRoomPage.thisFieldIsRequiredText.isDisplayed());
    }

    @Then("Verify all Room Types are selectable.")
    public void verify_all_room_types_are_selectable() {
    select=new Select(adminCreateEditRoomPage.roomTypeDropDown);
    select.selectByVisibleText("TWIN");
    select.selectByVisibleText("DELUXE");
    select.selectByVisibleText("PREMIUM_DELUXE");
    select.selectByVisibleText("SUITE");
    select.selectByVisibleText("DAYCARE");
    }

    @When("Click on Status checkbox")
    public void click_on_status_checkbox() {
    Driver.waitAndClick(adminCreateEditRoomPage.roomStatusCheckBox,5);
    }

    @Then("Verify that checkbox is selected")
    public void verify_that_checkbox_is_selected() {
    Assert.assertTrue(adminCreateEditRoomPage.roomStatusCheckBox.isSelected());
    }

    @When("Send price to price box")
    public void sendPriceToPriceBox() {
    Driver.waitAndSendText(adminCreateEditRoomPage.roomPriceBox,Faker.instance().number().digits(3),5);
    }

    @When("clear the price")
    public void clearThePrice() {
        adminCreateEditRoomPage.roomPriceBox.clear();
        adminCreateEditRoomPage.roomPriceBox.sendKeys(Keys.ENTER);
    }

    @When("Send description to the description box")
    public void send_description_to_the_description_box() {
    Driver.waitAndSendText(adminCreateEditRoomPage.roomDescriptionBox,"For ortopedic patients",5);
    }

    @And("clear the description")
    public void clearTheDescription() {
        adminCreateEditRoomPage.roomDescriptionBox.clear();
    }

       @When("user clicks on save button on room creation page")
    public void user_clicks_on_save_button_on_room_creation_page() {
        Driver.waitAndClick(adminCreateEditRoomPage.saveButton,5);
    }

    @Then("Verify -A new Room is created- alert")
    public void verifyANewRoomIsCreatedAlert() {
      Driver.waitForVisibility(adminCreateEditRoomPage.createdAlert,5);
      Assert.assertTrue(adminCreateEditRoomPage.createdAlert.isDisplayed());
    }

    @When("send a past date to the date box")
    public void sendDateToTheDateBox() {
        SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yyyy");
        Date oldDateTime=Faker.instance().date().past(365,TimeUnit.DAYS);
        oldDate=formatter.format(oldDateTime);
        System.out.println(oldDate);
        adminCreateEditRoomPage.createdDateBox.sendKeys(oldDate+Keys.TAB+"12:15");
    Driver.wait(5);
    }

    @Then("Verify created date is not the past date.")
    public void verifyCreatedDateIsNotThePastDate() {
        Driver.waitAndClick(adminRoomTablePage.lastPageArrow);
        Driver.wait(1);
        Assert.assertEquals(oldDate+" 12:15",adminRoomTablePage.createdDateOfLastRoom.getText());
    }

    @When("send a future date to the date box")
    public void sendAFutureDateToTheDateBox() {
        SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yyyy");
        Date futureDateTime=Faker.instance().date().future(365,TimeUnit.DAYS);
        futureDate=formatter.format(futureDateTime).toString();
        adminCreateEditRoomPage.createdDateBox.sendKeys(futureDate+Keys.TAB+"12:15");
        Driver.wait(5);
    }

    @Then("Verify created date is not the future date.")
    public void verifyCreatedDateIsNotTheFutureDate() {
        Driver.waitAndClick(adminRoomTablePage.lastPageArrow);
        Driver.wait(1);
       Assert.assertEquals(futureDate+" 12:15",adminRoomTablePage.createdDateOfLastRoom.getText());
   }

    @When("Click on View button on Rooms page")
    public void click_on_view_button_on_rooms_page() {
        Driver.waitAndClickElement(adminRoomTablePage.viewButton,5);
    }

    @Then("Verify that you can view all items.")
    public void verify_that_you_can_view_all_items() {
    Assert.assertEquals(adminRoomDetailsPage.roomDetailsTitles.size(),adminRoomDetailsPage.roomDetailsValues.size());
    }

    @When("Click on Edit button")
    public void click_on_edit_button() {
    Driver.waitAndClickElement(adminRoomTablePage.editButton,5);
    }

    @When("Change the room number")
    public void change_the_room_number() {
    adminCreateEditRoomPage.roomNumberBoxAlternative.clear();
    Driver.waitAndSendText(adminCreateEditRoomPage.roomNumberBoxAlternative, Faker.instance().number().digits(5));
    }


    @Then("Verify -A Room is updated- alert")
    public void verifyARoomIsUpdatedAlert() {
      adminCreateEditRoomPage.updatedAlert.isDisplayed();
    }

    @When("Create a new room")
    public void createANewRoom() {
        do {Driver.waitAndClick(adminRoomTablePage.createANewRoomButtonAlternative);
            Driver.waitAndSendText(adminCreateEditRoomPage.roomNumberBoxAlternative,Faker.instance().number().digits(6));
            Driver.waitAndClick(adminCreateEditRoomPage.roomStatusCheckBox,5);
            Driver.waitAndSendText(adminCreateEditRoomPage.roomPriceBox,Faker.instance().number().digits(3),5);
            Driver.waitAndClick(adminCreateEditRoomPage.saveButton,5);
            Driver.waitForVisibility(adminCreateEditRoomPage.createdAlert,2);
        }while(!adminCreateEditRoomPage.createdAlert.isDisplayed());
    }
    @When("Navigate to the last page")
    public void navigateToTheLastPage() {
       Driver.waitAndClick(adminRoomTablePage.lastPageArrow,5);
       Driver.wait(1);
    }
       @And("Click on last Delete button")
    public void clickOnLastDeleteButton() {
        Driver.waitAndClick(adminRoomTablePage.lastDeleteButton,5);
    }
    @When("Click on Delete as confirm on the alert")
    public void click_on_delete_as_confirm_on_the_alert() {
        Driver.waitForVisibility(adminRoomTablePage.confirmDeleteOperationPopup,5);
        Driver.waitAndClick(adminRoomTablePage.popupDeleteButton,5);
    }

    @Then("Verify -A Room is deleted- alert")
    public void verify_a_room_is_deleted_alert() {
        Driver.waitForVisibility(adminRoomTablePage.deletedAlert,5);
        Assert.assertTrue(adminRoomTablePage.deletedAlert.isDisplayed());
    }
}
