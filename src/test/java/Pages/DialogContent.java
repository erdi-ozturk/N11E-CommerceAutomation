package Pages;

import Utilities.GWD;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.XMLFormatter;

public class DialogContent extends Parent {

    //Locators

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
    @FindBy(xpath = "//div[@class='dn-slide-buttons horizontal']//button[text()='Daha Sonra']")
    public WebElement denyBtn;
    @FindBy(css = ".btnSignUp")
    public WebElement singUp;
    @FindBy(css = ".btnPrimary.agreement-button")
    public WebElement agreePrivacy;
    @FindBy(xpath = "//span[text()='Merhaba!']")
    public WebElement verifySignUpPage;
    @FindBy(css = "#firstName")
    public WebElement firstName;
    @FindBy(css = "#lastName")
    public WebElement lastName;
    @FindBy(css = "#registrationEmail")
    public WebElement registrationEmail;
    @FindBy(css = "#countryCode")
    public WebElement countryCode;
    @FindBy(xpath = " //input[@id='phoneNumber']")
    public WebElement phoneNumber;
    @FindBy(css = "#password")
    public WebElement password;
    @FindBy(xpath = "//div[@class='errorMessage']//div[text()='Şifreniz en az 1 rakam ve 1 harf içermelidir.']")
    public WebElement invalidPassword;
    @FindBy(css = "label[for='genderMale'] div[class='genderInputBox']")
    public WebElement selectGenderMan;
    @FindBy(xpath = "//label[@for='acceptContract']")
    public WebElement acceptContract;
    @FindBy(css = "label[for='sendPromotionalMailAndSms']")
    public WebElement sendPromotionalMailAndSms;
    @FindBy(xpath = "//a[contains(text(),'Giriş Yap')]")
    public WebElement loginButtonHomePage;
    @FindBy(xpath = "//span[normalize-space()='Merhaba!']")
    public WebElement verifyLoginForm;
    @FindBy(xpath = "//input[@id='email']")
    public WebElement loginEmail;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement loginPassword;
    @FindBy(xpath = "//div[@id='loginButton']")
    public WebElement loginButtonForm;
    @FindBy(css = "a[title='Elektronik'] span")
    public WebElement hoverElectronic;
    @FindBy(css = "a[title='Bilgisayar']>span")
    public WebElement subMenuComputerLinkOfElectronics;

    public WebElement getWebElement(String strButton) {
        switch (strButton) {
            case "loginEmail":return loginEmail;
            case "loginPassword":return loginPassword;
        }
        return null;
    }
}
