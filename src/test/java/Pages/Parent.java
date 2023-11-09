package Pages;


import Utilities.GWD;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Parent {
    WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));

    public void verifyContainsTextFunction(WebElement element, String value){
        wait.until(ExpectedConditions.textToBePresentInElement(element,value));
        Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()),"No Such Text");
    }

    public void scroolToElement(WebElement element){
        JavascriptExecutor js=(JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView(false);",element);
    }


    public void waitUntilVisible(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitUntilClickable(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void sendKeysFunctions(WebElement element,String text){
        waitUntilVisible(element);
        waitUntilClickable(element);
        //scroolToElement(element);
        element.clear();
        element.sendKeys(text);
    }

    public void clickFuntions(WebElement element){
        waitUntilClickable(element);
        scroolToElement(element);
        element.click();
    }

    public void hoverFunction(WebElement element){
        waitUntilClickable(element);
        Actions actions=new Actions(GWD.getDriver());
        Action action=actions.moveToElement(element).build();
        waitUntilClickable(element);
        action.perform();

    }
    public void myJsClick(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        scroolToElement(element);
        JavascriptExecutor js=(JavascriptExecutor)GWD.getDriver();
        js.executeScript("arguments[0].click();", element);
    }

    public void javaScriptSendKeys(WebElement element, String text){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        scroolToElement(element);
        JavascriptExecutor js=(JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].value= arguments[1];",element,text);
    }

    public void scrollToElementVisible(WebElement element){
        JavascriptExecutor js=(JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);",element);
    }

}
