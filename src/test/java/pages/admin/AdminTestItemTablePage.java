package pages.admin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminTestItemTablePage {
    public AdminTestItemTablePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "svg[data-icon='eye']")
    public WebElement viewButton;

    @FindBy (css = "svg[data-icon='arrow-left']")//viewe tıkladıktan sonra
    public WebElement backButton;

    @FindBy (css = "svg[data-icon='pencil-alt']")//direk edit için ve
    public WebElement editButton;                //viewe tıkladıktan sonraki edit için

    @FindBy (css = "svg[data-icon='trash']")
    public WebElement deleteButton;

    @FindBy (css = "svg[data-icon='ban']") //delete e tıkladıktan sonra
    public WebElement confirmDeleteOperationPopupCANCEL;

    @FindBy(css = "#jhi-confirm-delete-cTestItem") //delete e tıkladıktan sonra
    public WebElement confirmDeleteOperationPopupDELETE;

    @FindBy(css = ".Toastify")  //Delete e tıkladıktan sonrası için
    public WebElement alert;    //Save e tıkladıktan sonrası için

    @FindBy(css = "a#jh-create-entity")
    public WebElement createNewTestItemButton;

    //aşağıdaki locatorlar Create a new test item a click ledikten sonrası için
//                       Edit e tıkladıktan sonrası için
//                       view-->Edit e tıkladıktan sonrası için
    @FindBy(css = "#c-test-item-name")
    public WebElement nameBox;

    @FindBy(css = "#c-test-item-description")
    public WebElement descriptionBox;

    @FindBy(css = "#c-test-item-price")
    public WebElement priceBox;

    @FindBy(css = "#c-test-item-defaultValMin")
    public WebElement defaultMinValueBox;

    @FindBy(css = "#c-test-item-defaultValMax")
    public WebElement defaultMaxValueBox;

    @FindBy(css = "#c-test-item-createdDate")
    public WebElement createdDateBox;

    @FindBy(css = "#cancel-save")
    public WebElement cancelButton;

    @FindBy(css = "#save-entity")
    public WebElement saveButton;
}
