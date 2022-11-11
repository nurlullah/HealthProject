package pages.physician;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PhysicianHomePage {

    public PhysicianHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//a[@href='#']")
    public WebElement myPagesIcon;

    @FindBy(xpath = "//a[.='MY PAGES']")
    public WebElement myPagesIconn;

    @FindBy(xpath = "//a[.='My Appointments']")
    public WebElement myAppointments;

    @FindBy(xpath = "(//a[@href='/ps-in-patient'])[1]")
    public WebElement myInpatients;







}
