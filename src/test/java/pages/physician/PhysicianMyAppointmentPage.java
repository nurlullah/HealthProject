package pages.physician;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PhysicianMyAppointmentPage {

    public PhysicianMyAppointmentPage(){
    PageFactory.initElements(Driver.getDriver(),this);

}
   @FindBy(xpath = "//h2[text()='Appointments']")
    public WebElement appointmentsHeading;

    @FindBy(css = "#fromDate")
    public WebElement fromDate;

    @FindBy(css = "#toDate")
    public WebElement toDate;

    @FindBy(xpath = "//div[text()='Days between begin date and end date must be max 15 days']")
    public WebElement daysBetweenFifteenDaysPopUp;

    @FindBy(xpath = "//a[@href='/patient-detail/276238']")
    public WebElement appointment276238;

}
