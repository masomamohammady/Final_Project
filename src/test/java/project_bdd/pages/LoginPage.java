package project_bdd.pages;

import org.openqa.selenium.By;

public class LoginPage {
    public static final By LOGIN_EMAIL =By.xpath("//*[@id='root']/div/div[2]/div/div/div/h2[3]");
    public static final By CSP = By.xpath("//h2[contains(text(),'Customer Service Portal')]");
    public static final By USER_NAME = By.name("username");
    public static final By PASSWORD = By.name("password");
    public static final By SIGN_IN_BTN = By.xpath("//button[@type ='submit']");

    public static final By LOGIN_ERROR = By.xpath("//div[@data-status ='error']");


}
