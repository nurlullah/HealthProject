package pages.admin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminRoomTablePage {
    public AdminRoomTablePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[.='Create or edit a Room']")
    public WebElement createEditRoomText;

    @FindBy(name = "roomNumber")
    public WebElement roomNumberBox;

    @FindBy(id = "room-roomType")
    public WebElement roomTypeDropDown;

    @FindBy(id = "room-status")
    public WebElement roomStatusCheckBox;

    @FindBy(id = "room-price")
    public WebElement roomPriceBox;

    @FindBy(id = "room-description")
    public WebElement roomDescriptionBox;

    @FindBy(id = "save-entity")
    public WebElement saveButton;
}
