package pages.common;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CommonAppointmentTablePage {
    public CommonAppointmentTablePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "svg[data-icon='eye']")
    public WebElement viewButton;

    @FindBy (css = "svg[data-icon='pencil-alt']")//direk edit için ve
    public WebElement editButton;                //viewe tıkladıktan sonraki edit için

    @FindBy (css = "svg[data-icon='trash']")
    public WebElement deleteButton;

    @FindBy (css = "svg[data-icon='ban']") //delete e tıkladıktan sonra
    public WebElement confirmDeleteOperationPopupCANCEL;

    @FindBy(css = "#jhi-confirm-delete-appointment") //delete e tıkladıktan sonra
    public WebElement confirmDeleteOperationPopupDELETE;

    @FindBy(css = ".Toastify")  //Delete e tıkladıktan sonrası için
    public WebElement alert;    //Save e tıkladıktan sonrası için

    @FindBy (css = "svg[data-icon='plus']")
    public WebElement createNewAppointmentButton;

    //Table eklenecek
}
