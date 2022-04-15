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
public class UniversalCreditClaimPage  extends Util {

    public UniversalCreditClaimPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(id = "label-yes")
    WebElement yes;

    @CacheLookup
    @FindBy(id = "label-no")
    WebElement no;

    @CacheLookup
    @FindBy(id = "next-button")
    WebElement btnStart;



    //As part of your joint Universal Credit, do you have any of these?
    public void selectYesOnJointUnivrsalCredit(){
        clickOnElement(yes);
    }

    //As part of your joint Universal Credit, do you have any of these?
    public void selectNoOnJointUnivrsalCredit(){
        clickOnElement(no);
    }

    //Next Button----Joint Universal
    public void clickNextButtonOnJointUnivrsalCredit(){
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
