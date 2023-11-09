package Pages;

import Utilities.GWD;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageContent extends Parent{
    public PageContent(){
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(css = "a[title='Hesabım']")
    public WebElement myProfile;
    @FindBy(xpath = "//div[text()='Merhaba, Erdi ']")
    public WebElement verifyLogin;
    @FindBy(css = "a[title='hayat sana gelir']")
    public WebElement homePageButton;
    @FindBy(css = "#searchData")
    public WebElement searchData;
    @FindBy(css = "a[title='ARA']")
    public WebElement searchButton;
    @FindBy(xpath = "(//h3[contains(text(),'Samsung Evo Plus MB-MC64KA/TR 64 GB Micro SD Hafız')])[1]")
    public WebElement verifysearchResult;
    @FindBy(css = "div[class='resultText '] strong")
    public WebElement howManyItemsFromSearch;
    @FindBy(xpath = "(//span[contains(@title,'Favorilere ekle')])[3]")
    public WebElement addFavThirdItem;
    @FindBy(css = ".iconFavoritesWhite")
    public WebElement myFavs;
    @FindBy(xpath = "(//h3[contains(text(), 'Samsung Galaxy A04S 64 GB (Samsung Türkiye Garantili)')])[1]")
    public WebElement verifyItemInMyFavs;
    @FindBy(css = ".deleteProFromFavorites")
    public WebElement deleteFromMyFavs;
    @FindBy(css = "(//h3[@class='productName'])[1]")
    public WebElement deletingWarning;
    @FindBy(xpath = "(//span[contains(text(), 'Favori Ürünlerini')])")
    public WebElement emptyFavs;
    @FindBy(xpath = "(//span[@class='btnBasket'][normalize-space()='+'])[1]")
    public WebElement addCartButtonOnItem;
    @FindBy(xpath = "(//a[normalize-space()='Sepete Git'])[1]")
    public WebElement goCartAlert;
    @FindBy(xpath = "(//a[contains(text(),'Lenovo V15 G4 AMN 82YU00QYTX R5-7520U 16 GB 512 GB')])[1]")
    public WebElement itemOnCart;
    @FindBy(css = "#js-goToPaymentBtn")
    public WebElement goToPayment;
    @FindBy(css = "#cardNumberNew")
    public WebElement cardNumberInput;
    @FindBy(css = "#cardOwnerName")
    public WebElement cardOwnerName;
    @FindBy(css = "#expireDate")
    public WebElement cardExpireDate;
    @FindBy(css = "#securityCode")
    public WebElement cardSecureCode;
    @FindBy(css = "label[for='threeDSecure']")
    public WebElement threeDSecure;
    @FindBy(css = "label[for='masterpassOption']")
    public WebElement masterPassOption;
    @FindBy(xpath = "//label[@for='acceptAgreement']")
    public WebElement acceptAgreement;
    @FindBy(css = "span[id='js-paymentBtn'] span")
    public WebElement paymentButton;

}
