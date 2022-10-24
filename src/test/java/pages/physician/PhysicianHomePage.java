package pages.physician;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PhysicianHomePage {

    public PhysicianHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement myPagesIcon;

    /*@FindBy(xpath = "//a[.='MY PAGES']")
    public WebElement myPagesIcon;
*/
    @FindBy(xpath = "//a[.='My Appointments']")
    public WebElement myAppointments;
}
