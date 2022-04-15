package uk.nhs.nhsbsa.services.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.nhs.nhsbsa.services.utility.Util;

/**
 * By Laxmi
 **/
public class CreditTakeHomePage extends Util {

     public CreditTakeHomePage() {
        PageFactory.initElements(driver, this);
    }

     @FindBy(id = "label-yes")
     WebElement yes;

     @FindBy(id = "label-no")
     WebElement no;

     @FindBy(id = "next-button")
     WebElement btnStart;



    //Did you and your partner have a combined take-home pay of £935 or less in your last Universal Credit period?
    public void  setSelectYesForCombinedPay(){
        clickOnElement(yes);
    }

    public void  setSelectNoForCombinedPay(){
        clickOnElement(no);
    }

    //Next Button-----Combined Pay
    public void  clickOnNextButtonAfterCombinedPay(){
        clickOnElement(btnStart);
    }


    public void chooseTakeHome(boolean takehome){
        if(takehome)
            yes.click();
        else
            no.click();
        btnStart.click();
    }
}
