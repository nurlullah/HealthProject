package pages.common;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CommonCreateEditAppointmentPage {
    public CommonCreateEditAppointmentPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "input[name='startDate']")
    public WebElement startDateBox;

    @FindBy(css = "input[name='endDate']")
    public WebElement endDateBox;

    @FindBy(css = "select[name='status']")
    public WebElement statusBox;

    @FindBy(css = "#appointment-anamnesis")
    public WebElement anemnesisBox;

    @FindBy(css = "#appointment-treatment")
    public WebElement treatmentBox;

    @FindBy(css = "@appointment-diagnosis")
    public WebElement diagnosisBox;

    @FindBy(css = "#appointment-prescription")
    public WebElement prescriptionBox;

    @FindBy(css = "#appointment-description")
    public WebElement descriptionBox;

    @FindBy(css = "select[name='physician.id']")
    public WebElement physicianBox;

    @FindBy(css = "select[name='patient.id']")
    public WebElement patientBox;

    @FindBy(css = "#save-entity")
    public WebElement saveButton;

    @FindBy (css = "svg[data-icon='arrow-left']")//viewe tıkladıktan sonra
    public WebElement backButton;                //Create and Edit an Appointment a tıkladıktan sonra
}
