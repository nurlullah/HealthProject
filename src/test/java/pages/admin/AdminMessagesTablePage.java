package pages.admin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AdminMessagesTablePage {
    public AdminMessagesTablePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//a[@id='jh-create-entity']")
    public WebElement createMessageButton;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement name;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement email;

    @FindBy(xpath = "//input[@name='subject']")
    public WebElement subject;

    @FindBy(xpath = "//input[@name='message']")
    public WebElement message;

    @FindBy(xpath = "//a[@id='cancel-save']")
    public WebElement backButton;

    @FindBy(xpath = "//a[@id='save-entity']")
    public WebElement saveButton;

    @FindBy(xpath = "//table[@class='table']//tbody")   // All messages as table
    public WebElement messageTable;


    @FindBy(xpath = "//table[@class='table']//tbody//tr")   // All messages as list
    public List<WebElement> messageTableList;
}
