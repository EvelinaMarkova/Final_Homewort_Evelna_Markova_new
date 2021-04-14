package adminarea;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static adminarea.Browser.driver;

public class CreationNewVoucher {

    public static void setVoucherCode() {
        WebElement voucherCode = driver.findElement(By.id("input-code"));
        voucherCode.sendKeys("Voucher");


        WebElement fromName = driver.findElement(By.id("input-from-name"));
        fromName.sendKeys("Evelina");

        WebElement fromEmail = driver.findElement(By.id("input-from-email"));
        fromEmail.sendKeys("evy@abv.bg");

        WebElement toName = driver.findElement(By.id("input-to-name"));
        toName.sendKeys("Aleko");

        WebElement toEmail = driver.findElement(By.id("input-to-email"));
        toEmail.sendKeys("ubuntugp@gmail.com");

        WebElement amount = driver.findElement(By.id("input-amount"));
        amount.sendKeys("50");

        WebElement save = driver.findElement(By.cssSelector(".fa-save"));
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".fa-save")));
        save.click();

    }
}
