package pages.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserSignOutPage {
    public UserSignOutPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "a[href='/logout']")
    public WebElement signOutLink;
}
