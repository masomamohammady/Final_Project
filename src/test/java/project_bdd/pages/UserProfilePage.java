package project_bdd.pages;

import org.openqa.selenium.By;

public class UserProfilePage {
    public static final By PROFILE_BTN = By.xpath("//button[@type='button']");
    public static final By STATUS = By.xpath("/html/body/div[3]/div[3]/div/div/div/div/div/div[1]/p[2]/span/span");
    public static final By USER_TYPE = By.xpath("/html/body/div[3]/div[3]/div/div/div/div/div/div[2]/p[2]");
    public static final By FULL_NAME = By.xpath("/html/body/div[3]/div[3]/div/div/div/div/div/div[3]/p[2]");
    public static final By USERNAME = By.xpath("/html/body/div[3]/div[3]/div/div/div/div/div/div[4]/p[2]");
    public static final By AUTHORITIES = By.xpath("//ul[@role ='list']/li[1]");
    public static final By LOGOUT_BTN = By.xpath("//button[@class='chakra-button css-1x18d5s']");
}
