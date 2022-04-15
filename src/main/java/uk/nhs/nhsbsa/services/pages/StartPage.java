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
public class StartPage  extends Util {

   public StartPage (){
       PageFactory.initElements(driver, this);
   }

    //Accept cookies
    @CacheLookup
    @FindBy(xpath = "//button[@id='nhsuk-cookie-banner__link_accept_analytics']")
    WebElement acceptCookies;


    //Start Now Button
    @CacheLookup
    @FindBy(xpath = "//input[@id='next-button']")
    WebElement clickOnStartButton;

    //Accept cookies
    public void setAcceptCookies(){
        clickOnElement(acceptCookies);
    }

    // Start Now Button
    public void setClickOnStartButton(){
        clickOnElement(clickOnStartButton);
    }
}







