package project_bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import project_bdd.pages.HomePage;
import project_bdd.utility.SeleniumUtilities;

public class HomePageStep extends SeleniumUtilities {


    @Then("validate page title is {string}")
    public void validatePageTitle(String title){
       String actualTitle = getTitle(HomePage.TITLE);
        Assert.assertEquals(actualTitle,title);

    }
    @Then("validate create Primary Account is exist")
    public void isPrimaryAccountExist(){
       boolean button = isElementExist(HomePage.PRIMARY_ACCOUNT_BTN);
       Assert.assertTrue(button);


    }
    @When("click on create primary account button")
    public void click_On_CreateAccount(){
        clickOnElement(HomePage.PRIMARY_ACCOUNT_BTN);
    }

    @Given("click on login button")
    public void click_on_login_button() {
        clickOnElement(HomePage.LOGIN_BTN);
    }


}
