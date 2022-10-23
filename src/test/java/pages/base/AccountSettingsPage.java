package pages.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AccountSettingsPage {
    public AccountSettingsPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "input#firstName']")
    public WebElement firstNameBox;

    @FindBy(css = "input#lastName")
    public WebElement lastNameBox;

    @FindBy(css = "input#email]")
    public WebElement emailBox;

    @FindBy(css = "button[type='submit']")
    public WebElement saveButton;

    @FindBy(className = "Toastify")
    public WebElement alert;
}