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

    @FindBy(xpath = "//*[(text()='Register')]")
    public WebElement register;


    @FindBy(xpath = "//*[(text()='Get Started')]")
    public WebElement getStarted;

    @FindBy(xpath = "//*[(text()=' Appointment')]")
    public WebElement makeAppointment;

    //make an appointmenta clickleyince çıkıyor. homepage in alt kısmında
    @FindBy(id = "firstName")
    public WebElement firstName;

    @FindBy(id = "lastName")
    public WebElement lastName;

    @FindBy(id = "ssn")
    public WebElement ssn;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "phone")
    public WebElement phoneNumber;

    @FindBy(id = "appoDate")
    public WebElement appointmentDateTime;

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
}
