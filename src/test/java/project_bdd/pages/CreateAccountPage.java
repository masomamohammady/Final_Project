package project_bdd.pages;

import org.openqa.selenium.By;
import project_bdd.utility.SeleniumUtilities;

public class CreateAccountPage  {
    public static final By CREATE_ACCOUNT_TITLE = By.xpath("//h2[contains(text(),'Create Primary Account Holder')]");
    public static final By EMAIL = By.id("email");
    public static final By FIRST_NAME = By.id("firstName");
    public static final By GENDER = By.id("gender");
    public static final By EMPLOYMENT_STATUS = By.id("employmentStatus");
    public static final By TITLE = By.id("title");
    public static final By LAST_NAME = By.id("lastName");
    public static final By MARITAL_STATUS = By.id("maritalStatus");
    public static final By DATE_OF_BIRTH = By.id("dateOfBirth");
    public static final By CREATE_ACCOUNT_BTN = By.xpath("//button[@type='submit']");
    public static final By SIGN_UP_TITLE = By.xpath("//h2[text()='Sign up your account']");
    public static final By EMAIL_OF_CREATE_ACCOUNT_AS_EXPECTED = By.xpath("//div[contains(@class,chakra-stack)]//h2");
    public static final By EXIST_EMAIL_ERROR = By.xpath("//div[@class='chakra-alert banner-error css-1ykemat']");

    public static final By ERROR_MESSAGE = By.xpath("//div[contains(@role,'alert')]");
}
