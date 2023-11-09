package StepDefinitions;

import Pages.DialogContent;
import Pages.PageContent;
import Pages.Parent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddItemFav {
    DialogContent dialogContent=new DialogContent();
    PageContent pageContent=new PageContent();

    @Given("Send Samsung Data in Search Input")
    public void sendSamsungDataInSearchInput() {
        pageContent.clickFuntions(pageContent.searchData);
        pageContent.sendKeysFunctions(pageContent.searchData,"samsung");
        pageContent.clickFuntions(pageContent.searchButton);
    }

    @Then("User Should Click Heart Button On Third Item")
    public void userShouldClickHeartButtonOnThirdItem() {
        pageContent.clickFuntions(pageContent.addFavThirdItem);
    }

    @And("Click My Favorite Button On Page")
    public void clickMyFavoriteButtonOnPage() {
        pageContent.clickFuntions(pageContent.myFavs);
    }

    @And("User Should Display Item That Chosen One On My Favorites Page")
    public void userShouldDisplayItemThatChosenOneOnMyFavoritesPage() {
        pageContent.verifyContainsTextFunction(pageContent.verifyItemInMyFavs,"Samsung");
    }


    @And("Click Remove Item Button From My Favorites")
    public void clickRemoveItemButtonFromMyFavorites() {
        pageContent.clickFuntions(pageContent.deleteFromMyFavs);
        WebDriverWait wait=new WebDriverWait(GWD.getDriver(),Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(pageContent.emptyFavs));
        pageContent.verifyContainsTextFunction(pageContent.emptyFavs,"Favori Ürünlerini");
    }

}
