package pages.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    public HomePage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[(text()='HOME')]")
    public WebElement homeLink;

    @FindBy(xpath = "//*[(text()='ABOUT')]")
    public WebElement aboutLink;

    @FindBy(xpath = "//*[(text()='SERVICES')]")
    public WebElement servicesLink;

    @FindBy(xpath = "//*[(text()='DEPARTMENTS')]")
    public WebElement departmentsLink;

    @FindBy(xpath = "//*[(text()='DOCTORS')]")
    public WebElement doctorsLink;

    @FindBy(xpath = "//*[(text()='CONTACT')]")
    public WebElement contactLink;

    @FindBy(css = "#account-menu")//signin olmak ve sonrasında acoount işlemleri için
    public WebElement signInAndAccountIcon;

    @FindBy(xpath = "//span[text()='Fatih Sakin']")
    public WebElement trueSignIn;

    @FindBy(xpath = "//strong[text()='Failed to sign in!']")
    public WebElement failedToSignInText;

    @FindBy(id = "login-item")
    public WebElement signIn;

    @FindBy(xpath = "//*[(text()='Register')]")
    public WebElement register;


    @FindBy(xpath = "//*[(text()='Get Started')]")
    public WebElement getStarted;

    @FindBy(xpath = "//*[(text()=' Appointment')]")
    public WebElement makeAppointment;

    //make an appointmenta clickleyince çıkıyor. homepage in alt kısmında
    @FindBy(id = "firstName")
    public WebElement firstName;

    @FindBy(xpath = "//div[text()='Your FirstName is required.']")
    public WebElement requiredFirstName;

    @FindBy(id = "lastName")
    public WebElement lastName;

    @FindBy(xpath = "//div[text()='Your LastName is required.']")
    public WebElement requiredLastName;

    @FindBy(id = "ssn")
    public WebElement ssn;

    @FindBy(xpath = "//div[text()='Your SSN is invalid']")
    public WebElement invalidSsnAlert;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(xpath = "//div[text()='Your email is required.']")
    public WebElement requiredEmail;

    @FindBy(id = "phone")
    public WebElement phoneNumber;

    @FindBy(xpath = "//div[text()='Phone number is required.']")
    public WebElement requiredPhoneNumber;

    @FindBy(id = "appoDate")
    public WebElement appointmentDateTime;

    @FindBy(css = "span[style='color: red; font-size: 12px; border-color: red;']")
    public WebElement pastAppointmentTime;

    @FindBy(xpath = "//span[.='Send an Appointment Request']")
    public WebElement sendAnAppointmentRequest;

    //pop-up
    @FindBy(xpath = "//strong[.='Appointment registration saved!']")
    public WebElement AppointmentRegistrationSavedPopUp;

    @FindBy(id = "register-submit")
    public WebElement sendAppointmentRequest;

    //Sign in Pop Up locators
    @FindBy(name = "username")
    public WebElement usernameBox;

    @FindBy(name = "password")
    public WebElement passwordBox;

    @FindBy(css = "input#rememberMe")
    public WebElement rememberMeCheckbox;

    @FindBy(xpath = "//*[(text()='Did you forget your password?')]")
    public WebElement forgetPasswordButton;

    @FindBy(xpath = "//*[(text()='Register a new account')]")
    public WebElement registerNewAccountButton;

    @FindBy(xpath = "//*[(text()='Cancel')]")
    public WebElement cancelButton;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInSubmitButton;

    @FindBy(xpath = "//*[.='Password']")
    public WebElement password;
}
