package project_bdd.steps;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import project_bdd.pages.PlansPage;

import java.text.SimpleDateFormat;
import java.util.*;
import project_bdd.utility.SeleniumUtilities;

public class PlansStep extends SeleniumUtilities {
    @When("click on plans button")
    public void clickOnPlansBtn(){
        clickOnElement(PlansPage.PLANS_BTN);
    }

    @Then("validate {int} rows of data is present")
    public void validateRows(int rows) {
        int tableRows = countRow(PlansPage.ROWS);
        Assert.assertEquals("Available data rows ", rows,tableRows);

    }
    @Then("validate create date")
    public void validateCreateDate(){
     String actualCreateDate =  getElementText(PlansPage.CREATE_DATE);
        Assert.assertEquals(actualCreateDate,createDate());
    }
    @Then("validate expire date")
    public void validateExpireDate(){
        String actualExpireDate =  getElementText(PlansPage.EXPIRE_DATE);
        Assert.assertEquals(expireDate(),actualExpireDate);
    }
}
