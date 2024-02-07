package project_bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import project_bdd.pages.HomePage;
import project_bdd.pages.LoginPage;
import project_bdd.utility.SeleniumUtilities;

public class LoginStep extends SeleniumUtilities {



    @Given("enter username as {string}")
    public void enter_username_as(String username) {
        sendTextToElement(LoginPage.USER_NAME,username);

    }
    @Given("enter password as {string}")
    public void enter_password_as(String password) {
        sendTextToElement(LoginPage.PASSWORD,password);

    }
    @Then("click sign in button")
    public void click_sign_in_button()  {
        clickOnElement(LoginPage.SIGN_IN_BTN);
        waitTime(2000);

    }


    @Then("user navigate to {string}")
    public void user_navigate_to(String text) {
        String actualText = getElementText(LoginPage.CSP);
        Assert.assertEquals(text, actualText);
        }


    @Then("display error message with invalid password")
    public void loginError(){
        String errorMessage = getElementText(LoginPage.LOGIN_ERROR);
        Assert.assertEquals(errorMessage,"ERROR\n" +
                "Password not matched");
        }

    @Then("display error message with invalid username")
    public void loginErrors(){
        String errorMessage = getElementText(LoginPage.LOGIN_ERROR);
        Assert.assertEquals(errorMessage,"ERROR\n" +
                "User tek_sajad not found");
        System.out.println(errorMessage);
    }



}
