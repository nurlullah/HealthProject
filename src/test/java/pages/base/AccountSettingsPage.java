package pages.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AccountSettingsPage {
    public AccountSettingsPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement firstNameBox;

    @FindBy(xpath = "//input[@id='lastName']")
    public WebElement lastNameBox;

    @FindBy(id = "email")
    public WebElement emailBox;

    @FindBy(css = "button[type='submit']")
    public WebElement saveButton;

    @FindBy(xpath = "//*[(text()='Settings saved!')]")
    public WebElement alert;
}
