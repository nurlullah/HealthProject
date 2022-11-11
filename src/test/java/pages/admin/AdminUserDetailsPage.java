package pages.admin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminUserDetailsPage {

    public AdminUserDetailsPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//*[text()='First name']")
    public WebElement firstNameText;

    @FindBy(xpath = "//*[text()='Last name']")
    public WebElement lastNameText;

    @FindBy(xpath = "//*[text()='Email']")
    public WebElement emailText;

    @FindBy(xpath = "//*[text()='Language']")
    public WebElement language;

    @FindBy(xpath = "//*[text()='Created by']")
    public WebElement createdBy;

    @FindBy(xpath = "//*[text()='Created date']")
    public WebElement createdDate;

    @FindBy(xpath = "//span[text()='Modified by']")
    public WebElement modifiedBy;

    @FindBy(xpath = "//span[text()='Modified date']")
    public WebElement modifiedDate;

    @FindBy(css = "#authorities")
    public WebElement profiles;

    @FindBy(xpath = "(//td/following-sibling::td[10]/div/a[1])[1]")
    public WebElement adminViewUserButton;

    @FindBy(xpath = "(//td/following-sibling::td[10]/div/a[2])[1]")
    public WebElement adminEditUserButton;




}
