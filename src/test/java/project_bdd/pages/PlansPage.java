package project_bdd.pages;

import org.openqa.selenium.By;

public class PlansPage {
    public static final By PLANS_BTN = By.linkText("Plans");
    public static final By ROWS = By.xpath("//table[contains(@class,'chakra-table')]//tbody/tr");
    public static final By CREATE_DATE = By.xpath("//div/table/tbody/tr[1]/td[4]");
    public static final By EXPIRE_DATE =By.xpath("//div/table/tbody/tr[1]/td[5]");

}
