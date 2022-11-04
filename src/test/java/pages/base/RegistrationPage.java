package pages.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegistrationPage {
    public RegistrationPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "ssn")
    public WebElement ssn;

    @FindBy(id = "firstName")
    public WebElement firstName;

    @FindBy(id = "lastName")
    public WebElement lastName;

    @FindBy(id = "username")
    public WebElement userName;

    @FindBy(xpath = "//*[@id='register-form']/div[4]/div")
    public WebElement usernameisrequired;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "firstPassword")
    public WebElement newPassword;

    @FindBy(id = "strengthBar")
    public WebElement passwordStrength;

    @FindBy(xpath = "//*[@id='strengthBar']/li[1]")
    public WebElement redStrengthBar;


    @FindBy(xpath = "//*[@id='strengthBar']/li[2]")
    public WebElement orangeStrengthBar;


    @FindBy(xpath = "//*[@id='strengthBar']/li[4]")
    public WebElement fourGreenStrengthBar;


    @FindBy(xpath = "//*[@id='strengthBar']/li[5]")
    public WebElement fullGreenStrengthBar;

    @FindBy(id = "secondPassword")
    public WebElement confirmPassword;

    @FindBy(id = "register-submit")
    public WebElement registerButton;

    @FindBy(className = "Toastify")
    public WebElement alert;

    @FindBy(xpath = "//span[text()='Registration']")
    public WebElement registrationText;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]" )
    public WebElement textInvalidSSN;

    @FindBy(xpath = "//*[text()='Your FirstName is required.']" )
    public WebElement textRequiredFirstName;

    @FindBy(xpath = "//*[text()='Your LastName is required.']" )
    public WebElement textRequiredLastName;

    @FindBy(xpath = "//*[@id='register-form']/div[5]/div")
    public WebElement thisFileIsInvalidEmailText;


}