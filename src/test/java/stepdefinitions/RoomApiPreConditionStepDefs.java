package stepdefinitions;

import pages.admin.AdminHomePage;
import pages.admin.AdminRoomTablePage;
import pages.base.HomePage;
import pojos.Room;
import utilities.ConfigReader;
import utilities.Driver;

public class RoomApiPreConditionStepDefs {
    private static AdminHomePage adminHomePage=new AdminHomePage();
    private static AdminRoomTablePage adminRoomTablePage=new AdminRoomTablePage();
    private static HomePage homePage=new HomePage();
    public static void userFindTotalRoomNumber() {
        Driver.getDriver().get(ConfigReader.getProperty("medunna_url"));
        Driver.waitForPageToLoad(30);
        Driver.waitAndClick(homePage.signInAndAccountIcon);
        Driver.waitAndClick(homePage.signIn);
        Driver.waitAndSendText(homePage.usernameBox,(ConfigReader.getProperty("nesibeAdmin_username")),5);
        Driver.waitAndSendText(homePage.passwordBox,(ConfigReader.getProperty("nesibeAdmin_password")),5);
        Driver.waitAndClick(homePage.signInSubmitButton);
        Driver.waitAndClick(adminHomePage.itemsTitlesButton);
        Driver.waitAndClick(adminHomePage.roomButton);
        Driver.waitAndClick(adminRoomTablePage.lastPageArrow,5);
        String totalRoomNumberText=adminRoomTablePage.roomTotalNumberText.getText();
        String totalRoomNumberString=totalRoomNumberText.split(" ")[5];
        Room.setTotalRoomNumber(Integer.parseInt(totalRoomNumberString));
    }

}
