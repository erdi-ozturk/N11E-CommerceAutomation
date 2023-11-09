package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUp {
    DialogContent dialogContent=new DialogContent();
    @When("Click Sign Up Button")
    public void clickSignUpButton() {
        dialogContent.clickFuntions(dialogContent.singUp);
        dialogContent.clickFuntions(dialogContent.agreePrivacy);
    }

    @Then("User should see Sign Up Page")
    public void userShouldSeeSignUpPage() {
        dialogContent.verifyContainsTextFunction(dialogContent.verifySignUpPage,"Merhaba");
    }

    @And("Enter valid Credentials")
    public void enterValidCredentials() {
        dialogContent.clickFuntions(dialogContent.firstName);
        dialogContent.sendKeysFunctions(dialogContent.firstName,"Erdi");

        dialogContent.myJsClick(dialogContent.lastName);
        dialogContent.sendKeysFunctions(dialogContent.lastName,"Ozturk");

        dialogContent.clickFuntions(dialogContent.registrationEmail);
        dialogContent.sendKeysFunctions(dialogContent.registrationEmail,"adsadwawda@gmail.com");

        dialogContent.clickFuntions(dialogContent.countryCode);
        dialogContent.clickFuntions(dialogContent.countryCode);

        dialogContent.myJsClick(dialogContent.phoneNumber);
        dialogContent.javaScriptSendKeys(dialogContent.phoneNumber,"222222222");
        dialogContent.myJsClick(dialogContent.phoneNumber);

        dialogContent.clickFuntions(dialogContent.password);
        dialogContent.sendKeysFunctions(dialogContent.password,"Erdi1907");

        dialogContent.clickFuntions(dialogContent.selectGenderMan);

        dialogContent.myJsClick(dialogContent.acceptContract);

        dialogContent.myJsClick(dialogContent.sendPromotionalMailAndSms);
        //This test case stopped because there is reCaptcha in Sign Up Form,
        // All input field work as stable except Recaptcha,
        // it must be tested as manual
    }
}
