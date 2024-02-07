package project_bdd.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import project_bdd.pages.HomePage;
import project_bdd.pages.UserProfilePage;
import project_bdd.utility.SeleniumUtilities;

public class UserProfileStep extends SeleniumUtilities {

    @When("click on profile button")
    public void clickOnProfile() {
        clickOnElement(UserProfilePage.PROFILE_BTN);


    }

    @Then("validate information in profile side drawer")
    public void validateInfoInProfileSideDrawer(){
       String status = getElementText(UserProfilePage.STATUS);
        Assert.assertEquals(status,"Active");

        String userType = getElementText(UserProfilePage.USER_TYPE);
        Assert.assertEquals(userType,"CSR");

        String fullName = getElementText(UserProfilePage.FULL_NAME);
        Assert.assertEquals(fullName,"Supervisor");

        String username = getElementText(UserProfilePage.USERNAME);
        Assert.assertEquals(username,"supervisor");

        String authorities = getElementText(UserProfilePage.AUTHORITIES);
        Assert.assertEquals(authorities,"admin");

    }

    @Then("click on log out button and navigate to homepage")
    public void clickOnLogoutBtn(){
        clickOnElement(UserProfilePage.LOGOUT_BTN);
        waitTime(1000);
        String actualTitle = getElementText(HomePage.HOME_PAGE_TITLE);
        Assert.assertEquals("TEK Insurance App",actualTitle);

    }
}
