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

    @FindBy(id = "login-item")
    public WebElement signIn;

    // locators after clicking on sign in
    @FindBy(xpath = "(//span[.='Sign in'])[2]")
    public WebElement singInTitleText;


    //Sign in Pop Up locators
    @FindBy(name = "username")
    public WebElement usernameBox;

    @FindBy(xpath = "//div[text()='Username cannot be empty!']" )
    public WebElement usernameCannotBeEmptyMessage;

    @FindBy(name = "password")
    public WebElement passwordBox;

    @FindBy(xpath = "//div[text()='Password cannot be empty!']" )
    public WebElement passwordCannotBeEmptyMessage;


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

    @FindBy(xpath = "(//a[@class='d-flex align-items-center dropdown-toggle nav-link'])[3]/span")
    public WebElement singedInPersonName;
    // end of sign in pop up locators

    @FindBy(xpath = "//*[(text()='Register')]")
    public WebElement register;

    //Sıradaki 3 locator signIn olduktan sonra çıkan locaterlar
    @FindBy(css = "a[href='/account/settings']")
    public WebElement settingsLink;

    @FindBy(xpath = "//span[text()='Sign out']")
    public WebElement signOut;

    @FindBy(xpath = "//span[text()='Fatih Sakin']")
    public WebElement trueSignIn;

    @FindBy(xpath = "//strong[text()='Failed to sign in!']")
    public WebElement failedToSignInText;

    @FindBy(xpath = "//*[(text()='Get Started')]")
    public WebElement getStarted;

    @FindBy(xpath = "//*[(text()=' Appointment')]")
    public WebElement makeAppointment;

    //make an appointmenta clickleyince çıkıyor. homepage in alt kısmında
    @FindBy(xpath = "//input[@id='firstName']")
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

    @FindBy(xpath = "//div[.='Your SSN is required.']")
    public WebElement requiredSsn;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(xpath = "//div[text()='Your email is required.']")
    public WebElement requiredEmail;

    @FindBy(id = "phone")
    public WebElement phoneNumber;

    @FindBy(xpath = "//div[text()='Phone number is required.']")
    public WebElement requiredPhoneNumber;

    @FindBy(xpath = "//div[text()='Phone number is invalid']")
    public WebElement invalidPhoneNumber;

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

    @FindBy(xpath = "//div[text()='This field is invalid']")
    public WebElement invalidFieldAlert;

    @FindBy(xpath = "//span[.='Sign in']")
    public WebElement signInButton;

   /* @FindBy(id = "register-submit")
    public WebElement sendAppointmentRequest;*/

    @FindBy(xpath = " //*[@id='account-menu']/a/span")
    public WebElement accountText;

    @FindBy(xpath = " //*[@id='account-menu']/a")
    public WebElement accountClick;

   }
