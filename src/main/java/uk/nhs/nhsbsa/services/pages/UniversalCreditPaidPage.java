package uk.nhs.nhsbsa.services.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.nhs.nhsbsa.services.utility.Util;

/**
 * By Laxmi
 **/

public class UniversalCreditPaidPage extends Util {

    public UniversalCreditPaidPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[for='yes-universal']")
    WebElement yesUniversal;

    @FindBy(css = "[for='not-yet']")
     WebElement notYet;

    @FindBy(css = "[for='different-benefit']")
    WebElement diffBenefit;

    @FindBy(id = "next-button")
   WebElement btnStart;



    //Do you or your partner get paid Universal Credit?
    public void doYouGetUniversalCredit(){
        clickOnElement(yesUniversal);
    }

    //Do you or your partner get paid Universal Credit?
    public void notYetButWeHaveApplied(){
        clickOnElement(notYet);
    }

    //Do you or your partner get paid Universal Credit?
    public void noWeGetdifferentBenefit(){
        clickOnElement(diffBenefit);
    }

    //Next Button ----Universal Credit options
    public void setClickOnNextButtonUniversalCredit(){
        clickOnElement(btnStart);
    }

    public void chooseCredit(String credit){
        switch (credit){
            case "UNIVERSAL":
                yesUniversal.click();
                break;
            case "NOTYET":
                notYet.click();
                break;
            default:
                diffBenefit.click();
                break;
        }
        btnStart.click();
    }

}
