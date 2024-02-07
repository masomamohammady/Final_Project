package project_bdd.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.sl.In;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import project_bdd.pages.AccountPage;
import project_bdd.utility.SeleniumUtilities;



public class AccountStep extends SeleniumUtilities {
    @When("click on accounts button")
    public void clickOnAccountBtn(){
        clickOnElement(AccountPage.ACCOUNT_PAGE);
    }
    @Then("verify {int} rows page is default")
    public void validateRowsAccountPage(int rows){
     int actualRows = countRow(AccountPage.ROWS);
     Assert.assertEquals("number of expected rows ",rows,actualRows);


    }

    @Then("validate table records per {string} according to selected show per page")
    public void numberOf_Row_Per_page(String numberOfRow){
        Selection(AccountPage.SELECT_PAGE,numberOfRow);
        waitTime(1000);
        countRow(AccountPage.ROWS);









    }

}
