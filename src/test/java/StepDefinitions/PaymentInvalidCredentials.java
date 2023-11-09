package StepDefinitions;

import Pages.PageContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PaymentInvalidCredentials {
    PageContent pageContent=new PageContent();
    @Given("Click Checkout Button")
    public void clickCheckoutButton() {
        pageContent.myJsClick(pageContent.goToPayment);

    }

    @When("Enter Invalid User Card Informations")
    public void enterInvalidUserCardInformations() {
        pageContent.clickFuntions(pageContent.cardNumberInput);
        pageContent.sendKeysFunctions(pageContent.cardNumberInput,"2222444455552345");

        pageContent.clickFuntions(pageContent.cardOwnerName);
        pageContent.sendKeysFunctions(pageContent.cardOwnerName,"Erdi");

        pageContent.clickFuntions(pageContent.cardExpireDate);
        pageContent.sendKeysFunctions(pageContent.cardExpireDate,"1226");

        pageContent.clickFuntions(pageContent.cardSecureCode);
        pageContent.sendKeysFunctions(pageContent.cardSecureCode, "222");
    }

    @Then("Click MasterPass Checkbox")
    public void clickMasterPassCheckbox() {
        pageContent.clickFuntions(pageContent.masterPassOption);
    }

    @And("Click Agreement Checkbox")
    public void clickAgreementCheckbox() {
        pageContent.myJsClick(pageContent.acceptAgreement);
    }

    @And("Click Pay Now Button")
    public void clickPayNowButton() {
        pageContent.clickFuntions(pageContent.paymentButton);
    }
}
