package Utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GWD {
    public static WebDriver driver;

    public static WebDriver getDriver(){
        Locale.setDefault(new Locale("EN"));
        System.setProperty("user.language","EN");

        Logger logger=Logger.getLogger("");
        logger.setLevel(Level.SEVERE);
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");

        if (driver==null){
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--remote-allow-origins=*");
                driver = new ChromeDriver(options);
                driver.manage().window().maximize();


        }

        return driver;

    }

//    public static void clickShadowRoot(){
//        JavascriptExecutor js=(JavascriptExecutor)driver;
//        WebElement shadowRoot=(WebElement) js.executeScript("return document.querySelector(\"efilli-layout-dynamic\").shadowRoot.querySelector(\"div > div > div~div\")");
//        ((JavascriptExecutor)driver).executeScript("arguments[0].click();",shadowRoot);
//    }

    public static void quitDriver(){
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        if (driver!=null){
            driver.quit();
            driver=null;
        }
    }
}
