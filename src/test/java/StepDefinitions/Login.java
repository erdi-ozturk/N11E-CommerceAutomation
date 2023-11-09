package StepDefinitions;

import Pages.DialogContent;
import Pages.PageContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
    DialogContent dialogContent=new DialogContent();
    PageContent pageContent=new PageContent();
    @When("Click Login Button")
    public void clickLoginButton() {
        dialogContent.clickFuntions(dialogContent.loginButtonHomePage);
    }

    @Then("Verify Login Form")
    public void verifyLoginForm() {
        dialogContent.verifyContainsTextFunction(dialogContent.verifyLoginForm,"Merhaba");
    }

    @And("Enter valid User Information")
    public void enterValidUserInformation() {
        dialogContent.clickFuntions(dialogContent.loginEmail);
        dialogContent.sendKeysFunctions(dialogContent.loginEmail,"*************@gmail.com");

        dialogContent.clickFuntions(dialogContent.loginPassword);
        dialogContent.sendKeysFunctions(dialogContent.loginPassword,"21[]221**********7");

        dialogContent.clickFuntions(dialogContent.loginButtonForm);
    }

    @And("Verify User Login")
    public void verifyUserLogin() {
        pageContent.myJsClick(pageContent.myProfile);
        pageContent.verifyContainsTextFunction(pageContent.verifyLogin,"Merhaba, Erdi");
    }
}
