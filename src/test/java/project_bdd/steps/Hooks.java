package project_bdd.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import project_bdd.utility.SeleniumUtilities;

public class Hooks extends SeleniumUtilities {

    @Before
    public void beforeScenarios() {
        //We need to open browser and navigate
        setupBrowser();
    }
    @After
    public void afterScenarios(Scenario scenario){
        if (scenario.isFailed()) {
            //Selenium utility to take Screenshot
            TakesScreenshot takesScreenshot = (TakesScreenshot) getDriver();
            byte[] screenshot = takesScreenshot.getScreenshotAs(OutputType.BYTES);
            //Append Screen shot to report.
            scenario.attach(screenshot, "image/png", "screenshot");
        }
        getDriver().quit();
    }
}
