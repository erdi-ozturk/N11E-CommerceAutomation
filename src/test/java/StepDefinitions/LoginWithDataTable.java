package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginWithDataTable {
    DialogContent dialogContent=new DialogContent();

    @And("Enter valid User Informations")
    public void enterValidUserInformations(DataTable dt) {
        List< List<String> > items=dt.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            WebElement element= dialogContent.getWebElement(items.get(i).get(0));
            dialogContent.sendKeysFunctions(element, items.get(i).get(1));
        }
        dialogContent.clickFuntions(dialogContent.loginButtonForm);
    }
}
