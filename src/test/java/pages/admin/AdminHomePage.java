package pages.admin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminHomePage {
    public AdminHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[.='Items&Titles']")//adminde gözüküyor
    public WebElement itemsTitlesButton;

    @FindBy(xpath = "//span[.='Administration']")//adminde gözüküyor
    public WebElement administrationButton;

    @FindBy(xpath = "//*[@href='/patient']")
    public WebElement patientButton;

    @FindBy(xpath = "//*[@href='/staff']")
    public WebElement staffButton;

    @FindBy(xpath = "//*[@href='/physician']")
    public WebElement physicianButton;

    @FindBy(xpath = "//*[@href='/appointment']")
    public WebElement appointmentButton;

    @FindBy(xpath = "//*[@href='/c-test-item']")
    public WebElement testItemButton;

    @FindBy(xpath = "//span[.='Room']")
    public WebElement roomButton;

    @FindBy(css = "a[href='/country']")
    public WebElement countryButton;

    @FindBy(css = "a[href='/c-state']")
    public WebElement stateButton;

    @FindBy(css = "a[href='/c-message']")
    public WebElement messageButton;
}
