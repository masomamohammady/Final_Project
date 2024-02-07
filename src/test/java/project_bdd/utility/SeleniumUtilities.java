package project_bdd.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import project_bdd.base.BaseSetup;


import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

public class SeleniumUtilities extends BaseSetup {
    private WebDriverWait getWait() {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(20));
    }

    protected WebElement waitForVisibility(By locator) {
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public boolean isElementExist(By locator) {
        return getWait().until(ExpectedConditions.presenceOfElementLocated(locator)).isDisplayed();
    }

    public static void waitTime(int wait) {
        try {
            Thread.sleep(wait);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void clickOnElement(By locator) {
        getWait().until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    public String getElementText(By locator) {
        WebElement element = waitForVisibility(locator);
        return element.getText();
    }

    public int countRow(By locator) {
        List<WebElement> rows = getDriver().findElements(locator);
        return rows.size();

    }

    public WebElement waitUntilPresent(WebElement element) {
        return getWait().until(ExpectedConditions.visibilityOf(element));
    }

    public void getElementText(WebElement element) {
        waitUntilPresent(element).getText();
    }

    public String getRandomEmail() {
        String name = "yalda";
        String email = "@gmail.com";
        String num = "";
        for (int i = 0; i <= 4; i++) {
            num += (int) (Math.random() * 10);
        }
        return name + num + email;
    }

    public void optionSelection(By locator, String option) {
        WebElement optionElement = waitForVisibility(locator);
        Select select = new Select(optionElement);
        select.selectByVisibleText(option);


    }

    public void Selection(By locator, String value) {
        WebElement optionElement = waitForVisibility(locator);
        Select select = new Select(optionElement);
        select.selectByValue(value);
    }

    public void sendTextToElement(By locator, String text) {
        waitForVisibility(locator).sendKeys(text);
    }

    public String getTitle(By locator) {
        return getDriver().getTitle();
    }

   /* public boolean isElementDisplayed(By locator) {
        return waitForVisibility(locator).isDisplayed();
    }
*/

    public String createDate() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MMMMMM d, yyyy");
        sdf.setTimeZone(TimeZone.getTimeZone("EST"));
        return sdf.format(date);
    }
    public String expireDate(){
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR,1);
        Date tomorrow = calendar.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("MMMMMM d, yyyy");
        sdf.setTimeZone(TimeZone.getTimeZone("EST"));
        return sdf.format(tomorrow);
    }
}
