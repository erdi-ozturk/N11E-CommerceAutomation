package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HoverDropDownMenu {
    DialogContent dialogContent=new DialogContent();
    @Given("Hover Electronics On Menu")
    public void hoverElectronicsOnMenu() {
        dialogContent.hoverFunction(dialogContent.hoverElectronic);
    }

    @Then("Click Computer Link That Opened Menu")
    public void clickComputerLinkThatOpenedMenu() {
        dialogContent.clickFuntions(dialogContent.subMenuComputerLinkOfElectronics);
    }
}
