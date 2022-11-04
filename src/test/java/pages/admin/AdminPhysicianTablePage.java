package pages.admin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminPhysicianTablePage {
    public AdminPhysicianTablePage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//span[.='Items&Titles']")
    public WebElement items_titles;

    @FindBy(xpath = "//span[.='Physician']")
    public WebElement physician;

    @FindBy(xpath = "//span[.='Physicians']")
    public WebElement textPhysician; //verifying

    @FindBy(xpath = "//span[.='Create a new Physician']")
    public WebElement createANewPhysician;

    @FindBy(xpath = "//span[.='Create or edit a Physician']")
    public WebElement textCreateOrEditAPhysician;

    @FindBy(css = "input#useSSNSearch")
    public WebElement useSearch;

    @FindBy(css = "input#searchSSN")
    public WebElement SSN;

    @FindBy(xpath = "//button[@class='btn btn-secondary']")
    public WebElement searchUser;

    @FindBy(css = "input#physician-firstName")
    public WebElement firstName;

    @FindBy(css = "input#physician-lastName")
    public WebElement lastName;

    @FindBy(css = "input#physician1-birthDate")
    public WebElement birthDate;

    //Date must be between 10/12/1822 and 10/12/2002
    @FindBy(css = "div[class='invalid-feedback']")
    public WebElement invalidDate;

    @FindBy(css = "input#physician-phone")
    public WebElement phone;

    @FindBy(css = "input#physician-adress")
    public WebElement address;

    @FindBy(css = "select#physician-gender")
    public WebElement gender;

    @FindBy(css = "select#physician-speciality")
    public WebElement speciality;

    @FindBy(css = "select#physician-bloodGroup")
    public WebElement bloodGroup;

    @FindBy(css = "input#physician-description")
    public WebElement description;

    @FindBy(css = "input#file_image")
    public WebElement chooseFile;

    @FindBy(css = "input#physician-examFee")
    public WebElement examFee;

    @FindBy(css = "select#physician-user")
    public WebElement user;

    @FindBy(css = "select#physician-country")
    public WebElement country;

    @FindBy(css = "select#physician-cstate")
    public WebElement stateCity;

    @FindBy(css = "a#cancel-save")
    public WebElement back;

    @FindBy(xpath = "//span[.='Save']")
    public WebElement save;

    @FindBy(css = "i[class='bi bi-arrow-up-short']")
    public WebElement arrowUp;

    @FindBy(css = "div[class='Toastify__toast-body']")
    public WebElement ınternalServerError;

    //VİEW-EDİT-DELETE BUTTONS

    @FindBy(css = "a[class='btn btn-info btn-sm']")
    public WebElement view;

    @FindBy(css = "a[href='/physician/276283/edit?page=1&sort=id,desc']")
    public WebElement edit;

    @FindBy(xpath = "(//span[.='Edit'])[1]")
    public WebElement delete; //ID 276296

    @FindBy(xpath = "//a[@href='/physician/3651/edit?page=1&sort=id,asc']")
    public WebElement edit_id;

    @FindBy(xpath ="//a[@href='/country/1202']")
    public WebElement moveTurkey;

    @FindBy(xpath = "//input[@name='examFee']")
    public WebElement editExamFee;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement editSaveButton;

    @FindBy(xpath = "//a[@href='/physician/\" + id + \"/delete?page=1&sort=id,desc']")
    public WebElement deleteButton;

    @FindBy(xpath = "//div/h2[.]")
    public WebElement unexpectedErrorMessage;

    @FindBy(xpath = "//div[.='A Physician is updated with identifier 3651']")
    public WebElement editConfirmationMessage;









}
