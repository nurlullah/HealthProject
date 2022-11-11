package pages.admin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminCreateEditRoomPage {
    public AdminCreateEditRoomPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[.='Create or edit a Room']")
    public WebElement createEditRoomText;

    @FindBy(xpath = "//*[text()='Create or edit a Room']")
    public WebElement CreateEditRoomTextAlternative;

    @FindBy(name = "roomNumber")
    public WebElement roomNumberBox;

    @FindBy(xpath = "//*[@id='roomNumberLabel']//following::input")
    public WebElement roomNumberBoxAlternative;

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

    @FindBy(xpath = "//*[text()='This field is required.']")
    public WebElement thisFieldIsRequiredText;

    @FindBy(id = "room-createdDate")
    public WebElement createdDateBox;

    @FindBy(xpath = "//*[contains(text(),'A new Room is created')]")
    public WebElement createdAlert;
    @FindBy(xpath = "//*[contains(text(),'A Room is updated')]")
    public WebElement updatedAlert;


    @FindBy(xpath = "//*[contains(text(),'Room information is not consistent')]")
    public WebElement redAlert;

}
