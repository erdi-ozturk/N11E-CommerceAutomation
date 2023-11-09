package StepDefinitions;

import Pages.DialogContent;
import Pages.PageContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.support.PageFactory;

public class AddItemCart {
    PageContent pageContent=new PageContent();
    @And("Click Go To Cart Alert \\(Pop up)")
    public void clickGoToCartAlertPopUp() {
        pageContent.myJsClick(pageContent.addCartButtonOnItem);
        pageContent.waitUntilVisible(pageContent.goCartAlert);
        pageContent.clickFuntions(pageContent.goCartAlert);
    }

    @And("Verify That Chosen Item")
    public void verifyThatChosenItem() {
        pageContent.verifyContainsTextFunction(pageContent.itemOnCart,"Lenovo");
    }
}
