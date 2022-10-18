package pages.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ResetPasswordPage {
    public ResetPasswordPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "email")//forget password e basınca çıkıyor
    public WebElement resetPasswordEmail;

    @FindBy(xpath = "//*[@type='submit']")//forget password e basınca çıkıyor
    public WebElement resetPasswordButton;

    @FindBy(className = "Toastify")//forget password e basınca çıkıyor
    public WebElement resetPasswordAlert;
}
