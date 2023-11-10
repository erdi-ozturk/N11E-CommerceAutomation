package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class _Hooks {
    @After
    public void after(Scenario scenario){
        System.out.println("Scenario finished" );
        if (scenario.isFailed()){
            TakesScreenshot screenshot= (TakesScreenshot) GWD.getDriver();
            final byte[] scInMemory=screenshot.getScreenshotAs(OutputType.BYTES);
            scenario.attach(scInMemory,"image/png","screenshot");
        }

        GWD.quitDriver();
    }
}
