package uk.nhs.nhsbsa.services.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.nhs.nhsbsa.services.utility.Util;

/**
 * By Laxmi
 **/
public class DentalPracticePage extends Util {
    public DentalPracticePage() {
        PageFactory.initElements(driver, this);
    }

    //Which country is your dental practice in?
    @CacheLookup
    @FindBy(xpath = "//input[@id='radio-wales']")
    WebElement dentalPracticeOption;

    //Next Button ----Dental Practice

    @CacheLookup
    @FindBy(xpath = "//input[@id='next-button']")
    WebElement clickOnNextDentalPractice;

    //Which country is your dental practice in?
    public void selectDentalPracticeCountry() {
        clickOnElement(dentalPracticeOption);
    }

    // Next Button ----Dental Practice
    public void clickOnDentalPracticeNextButton() {
        clickOnElement(clickOnNextDentalPractice);

    }
}
