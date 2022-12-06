package pages.physician;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PhysicianMyInPatientPage {

    public PhysicianMyInPatientPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //My Inpatients Page
    @FindBy(xpath = "//thead")
    public WebElement allItemsInMyPatientsPage;

    @FindBy(xpath = "(//tbody/tr/td)[1]")
    public WebElement ID;

    @FindBy(xpath = "(//tbody/tr/td)[2]")
    public WebElement startDate;

    @FindBy(xpath = "(//tbody/tr/td)[3]")
    public WebElement endDate;

    @FindBy(xpath = "(//tbody/tr/td)[4]")
    public WebElement status;

    @FindBy(xpath = "(//tbody/tr/td)[5]")
    public WebElement description;

    @FindBy(xpath = "(//tbody/tr/td)[6]")
    public WebElement createdDate;

    @FindBy(xpath = "(//tbody/tr/td)[7]")
    public WebElement room;

    @FindBy(xpath = "(//tbody/tr/td)[8]")
    public WebElement appointment;

    @FindBy(xpath = "(//tbody/tr/td)[9]")
    public WebElement patient;

    @FindBy(xpath = "//a[@href='/in-patient/235241/edit']")
    public WebElement editButton;


}
