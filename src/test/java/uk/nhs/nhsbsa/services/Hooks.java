package uk.nhs.nhsbsa.services;

import com.cucumber.listener.Reporter;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import sun.text.normalizer.Utility;
import uk.nhs.nhsbsa.services.propertyReader.PropertyReader;
import uk.nhs.nhsbsa.services.utility.Util;

import java.io.IOException;
/**
 * By Laxmi
 **/
public class Hooks extends Util {

    @Before
    public void setUp(){
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
        Reporter.assignAuthor("Laxmi");
    }
    @After
    public void tearDown(Scenario scenario){

        if(scenario.isFailed()){
            String screenShotPath = Util.getScreenshot(driver,scenario.getName().replace(" ", "_"));
            try {
                Reporter.addScreenCaptureFromPath(screenShotPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        closeBrowser();
    }
}
