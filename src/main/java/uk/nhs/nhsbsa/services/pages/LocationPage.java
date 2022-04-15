package uk.nhs.nhsbsa.services.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.nhs.nhsbsa.services.utility.Util;

/**
 * By Laxmi
 **/
public class LocationPage extends Util {
     public LocationPage(){
     PageFactory.initElements(driver, this);
     }

    //Which country do you live in?
    @CacheLookup
    @FindBy(xpath = "//input[@id='radio-wales']")
    WebElement radioWales;

//    @CacheLookup
//    @FindBy(id = "label-england")
//    private WebElement locationEngland;

    @CacheLookup
    @FindBy(id = "next-button")
    private WebElement btnStart;

    //select wales
    public void selectRadioWalesButton(){
        clickOnElement(radioWales);
    }

    //Click on next
    public void clickOnNextButtonAfterCountry(){
        clickOnElement(btnStart);
    }


}
