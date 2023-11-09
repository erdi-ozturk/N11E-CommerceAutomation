package StepDefinitions;

import Pages.DialogContent;
import Pages.PageContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchData {
    DialogContent dialogContent=new DialogContent();
    PageContent pageContent=new PageContent();

    @Given("Click HomePage")
    public void clickHomePage() {
        pageContent.myJsClick(pageContent.homePageButton);
    }

    @When("Send Samsung Data On Search Input")
    public void sendSamsungDataOnSearchInput() {
        pageContent.myJsClick(pageContent.searchData);
        pageContent.javaScriptSendKeys(pageContent.searchData,"samsung");
    }

    @Then("Click Search Button")
    public void clickSearchButton() {
        pageContent.myJsClick(pageContent.searchButton);
    }

    @And("Verify Results")
    public void verifyResults() {
        pageContent.verifyContainsTextFunction(pageContent.verifysearchResult,"Samsung");
    }


}
