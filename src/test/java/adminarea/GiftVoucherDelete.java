package adminarea;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static adminarea.Browser.driver;
import static org.openqa.selenium.By.cssSelector;
import static org.openqa.selenium.By.xpath;

public class GiftVoucherDelete {

    public static void giftVoucherDelete() {

        boolean present;
        try {
            driver.findElement((xpath("(//*[.='Voucher']/..)[1]//input")));
            present = true;
        } catch (NoSuchElementException e) {
            present = false;
        }

        if (present) {
            WebElement giftVouchers5 = driver.findElement(xpath("(//*[.='Voucher']/..)[1]//input"));
            WebDriverWait wait = new WebDriverWait(driver, 15);
            wait.until(ExpectedConditions.elementToBeClickable(xpath("(//*[.='Voucher']/..)[1]//input")));
            giftVouchers5.click();

            WebElement giftVoucherDelete = driver.findElement(cssSelector(".fa-trash-o"));
            wait.until(ExpectedConditions.elementToBeClickable(cssSelector(".fa-trash-o")));
            giftVoucherDelete.click();

            try {
                Alert alert = driver.switchTo().alert();
                alert.accept();
                wait.until(ExpectedConditions.visibilityOf((WebElement) cssSelector(".alert-success")));
            } catch (NoAlertPresentException e) {
                e.printStackTrace();
            }
            WebElement newGiftVoucher1 = driver.findElement(cssSelector(".container-fluid .btn-primary>.fa-plus"));
          //  WebDriverWait wait = new WebDriverWait(driver, 15);
            wait.until(ExpectedConditions.elementToBeClickable(cssSelector(".container-fluid .btn-primary>.fa-plus")));
            newGiftVoucher1.click();

        } else {
            WebElement newGiftVoucher = driver.findElement(cssSelector(".fa-plus"));
            WebDriverWait wait = new WebDriverWait(driver, 15);
            wait.until(ExpectedConditions.elementToBeClickable(cssSelector(".fa-plus")));
            newGiftVoucher.click();

            //".container-fluid .btn-primary>.fa-plus"
        }
    }
}

