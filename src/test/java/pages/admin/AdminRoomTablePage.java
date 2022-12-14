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

    @FindBy(xpath = "//*[@aria-label='Next']/following::a")
    public WebElement lastPageArrow;

    @FindBy(xpath = "//*[contains(@class,'jhi-item-count')]")
    public WebElement roomTotalNumberText;

    @FindBy(xpath = "//*[@id='jh-create-entity']")
    public WebElement createANewRoomButtonAlternative;

    @FindBy(xpath = "(//*[@id='app-view-container']//td[7])[last()]")
    public WebElement createdDateOfLastRoom;

    @FindBy(css = "svg[data-icon='eye']")
    public WebElement viewButton;

    @FindBy (css = "svg[data-icon='pencil-alt']")//direk edit için ve
    public WebElement editButton;                //viewe tıkladıktan sonraki edit için

    @FindBy (xpath = "(//*[@data-icon='trash'])[last()]")
    public WebElement lastDeleteButton;

    @FindBy(xpath = "//*[@class='modal-title']")
    public WebElement confirmDeleteOperationPopup;

    @FindBy (xpath = "(//*[@data-icon='trash'])[last()]")
    public WebElement popupDeleteButton;

    @FindBy(xpath = "//*[contains(text(),'A Room is deleted')]")
    public WebElement deletedAlert;

}
