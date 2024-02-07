package project_bdd.pages;

import org.openqa.selenium.By;

public class HomePage {
     public static final By PRIMARY_ACCOUNT_BTN = By.linkText("Create Primary Account");
     public static final By TITLE = By.xpath("/html/head/title");
     public static final By LOGIN_BTN =By.xpath("//a[contains(text(),'Login')]");
     public static final By HOME_PAGE_TITLE = By.xpath("//h2[@class='chakra-heading css-1at26de']");
}
