package pages.admin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AdminRoomDetailsPage {
    public AdminRoomDetailsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBys(@FindBy(xpath = "//*[@class='jh-entity-details']/dt"))
    public List<WebElement> roomDetailsTitles;

    @FindBys(@FindBy(xpath = "//*[@class='jh-entity-details']/dd"))
    public List<WebElement> roomDetailsValues;

}
