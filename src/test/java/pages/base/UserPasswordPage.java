package pages.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserPasswordPage {
    public UserPasswordPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //Strength Bar Locator
    @FindBy(xpath ="//li[contains(@style,'background-color: rgb(255, 0, 0);')]")
    public WebElement redStrengthBar;

    @FindBy(xpath ="//li[contains(@style,'background-color: rgb(255, 153, 0);')]")
    public WebElement orangeStrengthBar;

    @FindBy(xpath ="//li[contains(@style,'background-color: rgb(153, 255, 0);')]")
    public WebElement fourGreenStrengthBar;

    @FindBy(xpath ="//li[contains(@style,'background-color: rgb(0, 255, 0);')]")
    public WebElement fullGreenStrengthBar;

    @FindBy(xpath = "//a[@href='#']")
    public WebElement userButton;

    @FindBy(xpath = "//input[@name='currentPassword']")
    public WebElement currentPassword;

    @FindBy(xpath = "//input[@name='newPassword']")
    public WebElement newPassword;

    @FindBy(id = "strengthBar")
    public WebElement passwordStrength;

    @FindBy(xpath ="//input[@name='confirmPassword']")
    public WebElement newPasswordConfirmation;

    @FindBy(xpath = "//*[.='Save']")
    public WebElement saveButton;

    @FindBy(xpath = "//strong[.='Password changed!']")
    public WebElement oldPasswordMessage;

    @FindBy(xpath = "//*[text()='Password changed!']")
    public WebElement successMessage;


}
