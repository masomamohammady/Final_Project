package project_bdd.pages;

import org.openqa.selenium.By;

public class AccountPage {
    public static final By ACCOUNT_PAGE = By.linkText("Accounts");
    public static final By ROWS = By.xpath("//table[contains(@class,'chakra-table')]//tbody/tr");
    public static final By SELECT_PAGE = By.xpath("//div/div/div[3]/select");
}
