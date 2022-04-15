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
public class GpPage extends Util {
    public GpPage(){
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(id = "label-yes")
    private WebElement yes;

    @CacheLookup
    @FindBy(id = "label-no")
    private WebElement no;

    @CacheLookup
    @FindBy(id = "next-button")
    private WebElement btnStart;


    //Is your GP practice in Scotland or Wales?
    public void selectGpPracticeRadio(){
        clickOnElement(yes);
    }
    //Is your GP practice in Scotland or Wales?
    public void selectGpPracticeRadi(){
        clickOnElement(no);
    }

    // Next Button Gp practice
    public void selectGpPracticeRadioNextbutton(){
        clickOnElement(btnStart);
    }





    public void chooseClaim(boolean claim){
        if(claim)
            yes.click();
        else
            no.click();
        btnStart.click();
    }
}
