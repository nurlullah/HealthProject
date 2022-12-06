package pages.patient;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PatientHomePage {
    public PatientHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(css = "svg[data-icon='th-list']")//patientde gözüküyor
    public WebElement myPagesPatientButton;

    @FindBy(xpath = "//input[@name='username']")
    public static WebElement patientUsernameBox;

    @FindBy(xpath = "//input[@name='password']")
    public static WebElement patientPasswordBox;

    @FindBy(xpath = "//div/button[@type='submit']")
    public static WebElement patientSignInSubmit;

    @FindBy(partialLinkText = "MY PAGES")
    public static WebElement myPagesDropDown;

    @FindBy(xpath = "//*[@id='entity-menu']/div/a[2]")
    public static WebElement makeAppoInDropDown;

    @FindBy(xpath = "//input[@id='phone']")
    public static WebElement phoneNumBox;

    @FindBy(id = "register-submit")
    public static WebElement sendRequestForAppo;

    @FindBy(xpath = "//div/button[@id='register-submit']")
    public static WebElement sendRequestForAppointment;

    @FindBy(xpath = "//div[@class='Toastify']")
    public static WebElement alertAfterSendAppoRequest;
    @FindBy(xpath = "//input[@name='username']")
    public static WebElement physicianUsernameBox;


}
