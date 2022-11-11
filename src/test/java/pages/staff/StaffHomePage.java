package pages.staff;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class StaffHomePage {
    public StaffHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[(text()='MY PAGES')]")//staffda gözüküyor
    public WebElement myPagesButton;

    @FindBy(xpath = "//*[@data-icon='search']")
    public WebElement searchPatientDropdown;

    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement patientSSNSearchBox;

    @FindBy(linkText = "Show Appointments")
    public WebElement showAppoButton;

    @FindBy(xpath = "//*[@id='app-view-container']/div/div/div/div/div/table/tbody/tr[1]/td[13]/div/a[1]/span/span")
    public WebElement editButton;

    @FindBy(xpath = "//select[@id='appointment-status']")
    public WebElement statusDropDown;

    @FindBy(xpath = "//select[@name='physician.id']")
    public WebElement physicianAssignmentDropDownEle;

    @FindBy(xpath = "//*[@id='appointment-anamnesis']")
    public WebElement anamnesisTextBox;

    @FindBy(xpath = "//*[@id='appointment-treatment']")
    public WebElement treatmentTextBox;

    @FindBy(xpath = "//*[@id='appointment-diagnosis']")
    public WebElement diagnosisTextBox;

    @FindBy(xpath = "//*[@id='appointment-prescription']")
    public WebElement prescriptionTextBox;

    @FindBy(xpath = "//*[@id='appointment-description']")
    public WebElement descriptionTextBox;

    @FindBy(xpath = "//*[@id='save-entity']/span")
    public WebElement saveButtonOnAppoEditPage;



}
