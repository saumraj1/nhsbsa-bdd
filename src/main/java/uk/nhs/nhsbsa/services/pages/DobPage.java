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
public class DobPage extends Util {
    public DobPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(id = "dob-day")
     WebElement day;

    @CacheLookup
    @FindBy(id = "dob-month")
     WebElement month;

    @CacheLookup
    @FindBy(id = "dob-year")
    WebElement year;

    @CacheLookup
    @FindBy(id = "next-button")
    WebElement btnStart;

    //What is your date of birth?---day
    public void enterDayOfBirthday(String date) {
        sendTextToElement(day, date);
    }

    // What is your date of birth?---month
    public void enterMonthOfBirth(String Month) {
        sendTextToElement(month, Month);
    }

    //What is your date of birth?---year
    public void enterYearOfBirth(String Year) {
        sendTextToElement(year, Year);
    }

    //Next BUtton Birth Date
    public void clcikOnNextButtonBirthDate() {
        clickOnElement(btnStart);
    }

}
