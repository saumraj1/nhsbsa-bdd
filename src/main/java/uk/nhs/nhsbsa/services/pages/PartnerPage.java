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
public class PartnerPage extends Util {

    public PartnerPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "label-yes")
    private WebElement yes;

    @FindBy(id = "label-no")
    private WebElement no;

    @FindBy(id = "next-button")
    private WebElement btnStart;

    //Do You live with your Partner---Yes
    public void setClickOnYesForLiveWithPartner(){
        clickOnElement(yes);
    }

    //Do You live with your Partner---No
    public void setClickOnNoForLiveWithPartner(){
        clickOnElement(no);
    }

    //Click On Next Button
    public void setClickOnNextButtonAfterLiveWithPartner(){
        clickOnElement( btnStart);
    }





    public void chooseRelation(boolean withPartner){
        if(withPartner)
            yes.click();
        else
            no.click();
        btnStart.click();
    }
}
