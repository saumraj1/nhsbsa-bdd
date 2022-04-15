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
public class ResultPage extends Util {

    public ResultPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(className = "done-panel")
    WebElement donePanel;

    // result
    public  String setResultYougetHelp(){
        String actual = getTextFromElement(donePanel);
        System.out.println(getTextFromElement(donePanel));
        return actual;

    }

    public boolean isResultsPageDisplayed(){
        return donePanel.isDisplayed();
    }
}
