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

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "firstPassword")
    public WebElement newPassword;

    @FindBy(id = "strengthBar")
    public WebElement passwordStrength;

    @FindBy(xpath = "(//li[contains(@style,'background-color: rgb(255, 0, 0);')]")
    public WebElement redStrengthBar;

    @FindBy(xpath = "(//li[contains(@style,'background-color: rgb(255, 153, 0);')]")
    public WebElement orangeStrengthBar;

    @FindBy(xpath = "(//li[contains(@style,'background-color: rgb(153, 255, 0);')]")
    public WebElement fourGreenStrengthBar;

    @FindBy(xpath = "(//li[contains(@style,'background-color: rgb(0, 255, 0);')]")
    public WebElement fullGreenStrengthBar;

    @FindBy(id = "secondPassword")
    public WebElement confirmPassword;

    @FindBy(id = "register-submit")
    public WebElement registerButton;

    @FindBy(className = "Toastify")
    public WebElement alert;
}
