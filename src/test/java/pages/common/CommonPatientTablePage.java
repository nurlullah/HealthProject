package pages.common;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CommonPatientTablePage {

    public CommonPatientTablePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[.='Patients']")
    public WebElement patientPageTitle;

    @FindBy(xpath = "//span[.='Create a new Patient']")
    public WebElement adminCreateAnewPatient;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement popUp;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement alertErrorText;  // visible i kullanmali cunku alert error

    /////////////      2.part tum Patients listesi ve page list        ///////////////
    // listeye bakip dogrulama ve oradaki locate ler
    // Patient List

    @FindBy(xpath = "//*[@class='page-link']")
    public WebElement pageLink_all;

    @FindBy(xpath = "(//*[@class='page-link'])[7]")
    public WebElement pageLink_single;

    @FindBy(xpath = "//*[@class='btn btn-link btn-sm']")
    public WebElement patientID_all;

    @FindBy(xpath = "(//*[@class='btn btn-link btn-sm'])[4]")
    public WebElement patientID_new;     //benim olusturdugum no  276204

    ////////////    3.part view--edit--delete        ////////////////

    @FindBy(xpath = "//*[@data-prefix='fas' and  @data-icon='eye']")
    public WebElement view;       //2o tane cikiyor

    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div[1]/div/table/tbody/tr[1]/td[16]/div/a[2]/span/span")
    public WebElement edit;  //ilk siradaki edit

    @FindBy(css = "svg[data-icon='trash'] ")
    public WebElement delete;    //2o tane cikiyor

    //Staff icin searchbox

    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement searchSsn;
}
