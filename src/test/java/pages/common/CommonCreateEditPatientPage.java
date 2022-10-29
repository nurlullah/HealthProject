package pages.common;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class CommonCreateEditPatientPage {

    public CommonCreateEditPatientPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[.='Create or edit a Patient']")
    public WebElement createPatientTitle;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstNameTextBox;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement firstNameIsRequiredText;   //red text required

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lastNameTextBox;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")
    public WebElement lastNameIsRequiredText;   //red text required

    @FindBy(xpath = "//input[@name='birthDate']")
    public WebElement birthDateTextBox;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailTextBox;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[3]")
    public WebElement emailIsRequiredText;   //red text required

    @FindBy(xpath = "//input[@name='phone']")
    public WebElement phoneTextBox;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[4]")
    public WebElement phoneIsRequiredText;   //red text required

    @FindBy(xpath = "//select[@name='gender']")
    public WebElement genderDropDown;

    @FindBy(xpath = "//select[@name='bloodGroup']")
    public WebElement bloodGroupDropDown;

    @FindBy(xpath = "//input[@name='adress']")
    public WebElement adressTextBox;

    @FindBy(xpath = "//textarea[@name='description']")
    public WebElement descriptionTextBox;

    @FindBy(xpath = "//select[@name='user.id']")
    public WebElement userDropDown;

    @FindBy(xpath = "//select[@name='country.id']")
    public WebElement countryDropDown;

    @FindBy(xpath = "//select[@name='cstate.id']")
    public WebElement stateCityDropDown;

    @FindBy(xpath = "//a[@id='cancel-save']")
    public WebElement backButton;

    @FindBy(xpath = "//button[@id='save-entity']")
    public WebElement saveButton;
    @FindBy(xpath = "//input[@name='id']")
    public WebElement idTextBox;
    @FindBy(xpath = "//select[@name='gender']//option")
    public WebElement genderDropDown1;
    @FindBy(xpath = "//select[@name='bloodGroup']//option")
    public WebElement bloodGroupDropDown1;
    @FindBy(xpath = "//select[@name='user.id']//option")
    public WebElement userDropDown1;
    @FindBy(xpath = "//select[@name='country.id']//option[2]")
    public WebElement countryDropDown1;
    @FindBy(xpath = "//select[@name='cstate.id']//option")
    public WebElement stateCityDropDown1;

    @FindBy(xpath = "//*[@role='alert']")
    public WebElement alert;
    @FindBys(@FindBy(xpath = "//*[@id='app-view-container']//table/tbody/tr"))
    public List<WebElement> tableInfo;

}
