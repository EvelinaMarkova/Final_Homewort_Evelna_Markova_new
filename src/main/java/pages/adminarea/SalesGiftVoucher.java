package pages.adminarea;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static pages.adminarea.Browser.driver;
import static org.openqa.selenium.By.cssSelector;

public class SalesGiftVoucher {

    public static void goToGiftVouchers(){
        WebElement sales = driver.findElement(cssSelector("#menu-sale>a"));
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(cssSelector("#menu-sale>a")));
        sales.click();

        WebElement giftVouchers2 = driver.findElement(cssSelector("#collapse4>li:nth-of-type(4)"));
        wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(cssSelector("#collapse4>li:nth-of-type(4)")));
        giftVouchers2.click();

        WebElement giftVouchers3 = driver.findElement(cssSelector(" #collapse4-3 >li:nth-of-type(1)"));
        wait = new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.elementToBeClickable(cssSelector(" #collapse4-3 >li:nth-of-type(1)")));
        giftVouchers3.click();

        WebElement giftVouchers4 = driver.findElement(cssSelector(" #collapse4-3 >li:nth-of-type(1)"));
        wait = new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.elementToBeClickable(cssSelector(" #collapse4-3 >li:nth-of-type(1)")));
        giftVouchers4.click();



    }
}

