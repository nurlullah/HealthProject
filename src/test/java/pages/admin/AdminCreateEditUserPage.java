package pages.admin;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class AdminCreateEditUserPage {
    public AdminCreateEditUserPage(){
        PageFactory.initElements(Driver.getDriver(),this);

}

    @FindBy(xpath = "//span[.='Administration']")
    public WebElement administration;

    @FindBy(xpath ="//span[.='User management']")
    public WebElement userManagementPage;

    @FindBy(xpath ="//span[.='Create or edit a user']")
    public WebElement createOrEditAUser;

    @FindBy(xpath ="//div[text()='Your username is required.']")
    public WebElement YourUsernameIsRequiredText;

    //    @FindBy(xpath ="//input[@name='login']")
    //    public WebElement login;

    @FindBy(css="#login")
    public WebElement login;

    //    @FindBy(xpath ="//input[@name='firstName']")
    //    public WebElement firstName;

    @FindBy(css = "#firstName")
    public WebElement firstName;

    //    @FindBy(xpath ="//input[@name='lastName']" )
    //    public WebElement lastName;

    @FindBy(css = "#lastName")
    public WebElement lastName;

    //    @FindBy(xpath = "//input[@name='email']")
    //    public WebElement email;

    @FindBy(css = "#email")
    public WebElement email;

    @FindBy(xpath = "//div[text()='Your email is required.']")
    public WebElement YourEmailIsRequired;

    //    @FindBy(xpath = "//input[@name='ssn']")
    //    public WebElement ssn;

    @FindBy(css = "#ssn")
    public WebElement ssn;

    @FindBy(xpath = "//div[text()='Your SSN is required.']")
    public WebElement YourSSNIsRequired;

    //    @FindBy(xpath = "//div[@class='form-check']")
    //    public WebElement activated;

    @FindBy(css = "div[class='form-check']")
    public WebElement activated;

    //    @FindBy(xpath = "//select[@name='langKey']")
    //    public WebElement language;

    @FindBy(css = "#langKey")
    public WebElement language;

    //    @FindBy(xpath = "//select[@id='authorities']")
    //    public WebElement profiles;

    @FindBy(css = "#authorities")
    public WebElement profiles;

    @FindBy(xpath = "//span[@class='d-none d-md-inline']")
    public WebElement back;

    @FindBy(xpath = "//span[.='Save']")
    public WebElement save;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButton;


    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement savedTextMessage;


    @FindBy(css = "i[class='bi bi-arrow-up-short']")
    public WebElement arrowUp;

    @FindBy(xpath = "//*[text()='ID']")
    public WebElement ID;

    @FindBy(xpath = "//*[text()='Created date']")
    public WebElement createdDate;

    @FindBy(xpath = "//*[@href='/admin/user-management/new']")
    public WebElement createANewUserButton;

    @FindBy(xpath = "//*[@aria-label='Next']/following::a")
    public WebElement lastPage;

    @FindBy(xpath = "(//td/following-sibling::td[10]/div/a[1])[1]")
    public WebElement adminViewUserButton;

    @FindBy(xpath = "(//td/following-sibling::td[10]/div/a[2])[1]")
    public WebElement adminEditUserButton;

    @FindBy(xpath = "(//*[@data-icon='trash'])[last()]")
    public WebElement lastDeleteButton;
/*
    @FindBy(xpath = "//*[text()='Confirm delete operation']")
    public WebElement confirmDeleteOperationPopUp;

 */
    @FindBy(xpath = "//*[@class='modal-title']")
    public WebElement confirmDeleteOperationPopup;

    @FindBy(xpath = "(//*[@data-icon='trash'])[last()]")
    public WebElement confirmDeleteAlertButton;

    @FindBy(xpath = "//*[contains(text(), 'A user is deleted')]")
    public WebElement userDeletedMessage;

    @FindBy(xpath = "//*[@data-icon='ban']")
    public WebElement cancelButton;





}
