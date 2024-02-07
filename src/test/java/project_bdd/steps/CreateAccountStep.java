package project_bdd.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import project_bdd.pages.CreateAccountPage;
import project_bdd.pages.HomePage;
import project_bdd.pages.LoginPage;
import project_bdd.utility.SeleniumUtilities;

import java.util.Map;


public class CreateAccountStep extends SeleniumUtilities {
   private static String mainEmail;

    @Then("validate title of create primary account is {string}")
    public void validateFormTitle(String title){
        String actualFormTitle = getElementText(CreateAccountPage.CREATE_ACCOUNT_TITLE);
        Assert.assertEquals(actualFormTitle,title);
    }


    @Then("fill out create primary account holder form from Data table")
    public void fillOutForm(DataTable dataTable){
        Map<String, String> data = dataTable.asMap();
        mainEmail = getRandomEmail();

        sendTextToElement(CreateAccountPage.EMAIL, mainEmail);
        sendTextToElement(CreateAccountPage.FIRST_NAME,data.get("firstName"));
        optionSelection(CreateAccountPage.GENDER,data.get("gender"));
        sendTextToElement(CreateAccountPage.EMPLOYMENT_STATUS,data.get("employmentStatus"));
        optionSelection(CreateAccountPage.TITLE,data.get("title"));
        sendTextToElement(CreateAccountPage.LAST_NAME,data.get("lastName"));
        optionSelection(CreateAccountPage.MARITAL_STATUS,data.get("maritalStatus"));
        sendTextToElement(CreateAccountPage.DATE_OF_BIRTH,data.get("dateOfBirth"));

    }
    @Then("Validate user is on {string}")
    public void validateUserIsOn(String title) {
        waitForVisibility(CreateAccountPage.SIGN_UP_TITLE);
        Assert.assertEquals(title,getElementText(CreateAccountPage.SIGN_UP_TITLE));

    }
    @Then("fill out create primary account holder form from Data table with existing email")
    public void fillOutForm_ExistingEmail(DataTable dataTable){
        Map<String, String> data = dataTable.asMap();

        sendTextToElement(CreateAccountPage.EMAIL, data.get("email"));
        sendTextToElement(CreateAccountPage.FIRST_NAME,data.get("firstName"));
        optionSelection(CreateAccountPage.GENDER,data.get("gender"));
        sendTextToElement(CreateAccountPage.EMPLOYMENT_STATUS,data.get("employmentStatus"));
        optionSelection(CreateAccountPage.TITLE,data.get("title"));
        sendTextToElement(CreateAccountPage.LAST_NAME,data.get("lastName"));
        optionSelection(CreateAccountPage.MARITAL_STATUS,data.get("maritalStatus"));
        sendTextToElement(CreateAccountPage.DATE_OF_BIRTH,data.get("dateOfBirth"));

    }
    @When("click on create account button")
    public void clickOnCreateAcc(){
        clickOnElement(CreateAccountPage.CREATE_ACCOUNT_BTN);
    }
//should ask from salwa
    @Then("sign up account page and email address shows as expected {string}")
    public void validateEmailInSignUpAccount(String email){
       String actualEmail = getElementText(LoginPage.LOGIN_EMAIL);
       Assert.assertEquals(actualEmail,email);

    }
    @Then("Display email must be same as entry")
    public void displayEmailAsExpected()  {
        for (WebElement element: getDriver().findElements(CreateAccountPage.EMAIL_OF_CREATE_ACCOUNT_AS_EXPECTED)){
            getElementText(element);
            if (element.getText().equals(mainEmail)){
                Assert.assertTrue(element.isDisplayed());
            }
            System.out.println(element.getText());
        }

    }

  /*  @Then("validate error message")
    public void validateExistingEmail(){
       String errorMessage = getElementText(CreateAccountPage.ERROR_MESSAGE);
       Assert.assertEquals(errorMessage,"ERROR\n" +
               "Account with email yalda.bahar2@gmail.com is exist");
    }
    */

    @Then("Error message should pup up {string}")
    public void errorMessageShouldPupUp(String existEmail) {
        String existEmailError = getElementText(CreateAccountPage.EXIST_EMAIL_ERROR);
        String actualError = existEmailError.replaceAll("ERROR\n","");
        Assert.assertEquals(actualError,existEmail);
    }



}
