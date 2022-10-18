package pages.patient;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PatientHomePage {
    public PatientHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(css = "svg[data-icon='th-list']")//patientde gözüküyor
    public WebElement myPagesPatientButton;
}
