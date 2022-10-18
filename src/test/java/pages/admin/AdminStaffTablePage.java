package pages.admin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminStaffTablePage {
    public AdminStaffTablePage() { PageFactory.initElements(Driver.getDriver(),this);}


    @FindBy(xpath = "//span[.='Items&Titles']")
    public WebElement items_titles;

    @FindBy(xpath = "(//span[.='Staff'])[1]")
    public WebElement patient;   //2. dropdown ogesi

    @FindBy(xpath = "(//span[.='Staff'])[2]")
    public WebElement textStaff;   //text verify icin

    @FindBy(xpath = "//span[.='Create a new Staff']")
    public WebElement createAnewPatient;   //bekle

    @FindBy(xpath = "//span[.='Create or edit a Patient']")
    public WebElement textCreateOrEditAPatient;   //text verify icin

    @FindBy(xpath = "//input[@name='useSSNSearch']")
    public WebElement useSearch;

    @FindBy(xpath = "//input[@name='searchSSN']")
    public WebElement SSN;

    @FindBy(xpath = "//button[@class='btn btn-secondary']")
    public WebElement searchUser;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement alertNotFound;   // visible i kullanmali cunku alert success

    /////////////////////////////////////////////////////////////////
    //found is success alert i eklenebilir

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstName;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement firstNameIsRequiredText;   //red text required

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lastName;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")
    public WebElement lastNameIsRequiredText;   //red text required

    @FindBy(xpath = "//input[@name='birthDate']")
    public WebElement birthDate;  //dropdown select class lazim

    @FindBy(xpath = "//input[@name='phone']")
    public WebElement phone;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[4]")
    public WebElement phoneIsRequiredText;   //red text required

    @FindBy(xpath = "//select[@name='gender']")
    public WebElement gender;   //dropdown select class lazim

    @FindBy(xpath = "//select[@name='bloodGroup']")
    public WebElement bloodGroup;   //dropdown select class lazim

    @FindBy(xpath = "//*[@name='adress']")
    public WebElement adress;   //typo  hali dogru degistirme

    @FindBy(xpath = "//input[@name='description']")
    public WebElement description;

    @FindBy(xpath = "//input[@name='createdDate']")
    public WebElement createdDate;

    @FindBy(xpath = "//select[@name='user.id']")
    public WebElement user;   //dropdown select class lazim

    @FindBy(xpath = "//select[@name='country.id']")
    public WebElement country;   //dropdown select class lazim

    @FindBy(xpath = "//select[@name='cstate.id']")
    public WebElement state;   //dropdown yok olunca select class lazim
    //not bug var manuel test yapilip kontrol edilmeli

    @FindBy(xpath = "(//span[.='Back'])[2]")
    public WebElement back;

    @FindBy(xpath = "//span[.='Save']")
    public WebElement save;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement alertErrorText;  // visible i kullanmali cunku alert error

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement alertSuccessText;   // visible i kullanmali cunku alert success

    /////////////      2.part tum Staff listesi ve page list        ///////////////
    //listeye bakip dogrulama ve oradaki locate ler
    // Staff List

//    @FindBy(xpath = "//*[@class='page-link']")
//    public WebElement pageLink_all;

    @FindBy(xpath = "(//*[@class='page-link'])[3]")
    public WebElement pageLink_single;

    @FindBy(xpath = "//*[@class='btn btn-link btn-sm']")
    public WebElement staffID_all;

    @FindBy(xpath = "(//*[@class='btn btn-link btn-sm'])[7]")
    public WebElement staffID_new;     //benim olusturdugum no  276153




    ////////////    3.part view--edit--delete        ////////////////

    @FindBy(xpath = "//*[@data-prefix='fas' and  @data-icon='eye']")
    public WebElement view;       //x tane cikiyor

    @FindBy(css = "svg[data-icon=\"pencil-alt\"]")
    public WebElement edit;  //x tane cikiyor

    @FindBy(css = "svg[data-icon='trash']")
    public WebElement delete;    //x tane cikiyor
}
