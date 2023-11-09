package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;


public class NavigateToSite {
    DialogContent dialogContent=new DialogContent();

    @Given("Navigate to N HomePage")
    public void navigate_to_n_home_page() {
        GWD.getDriver().get("https://www.n11.com/");
        dialogContent.myJsClick(dialogContent.denyBtn);
    }

}
