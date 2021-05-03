package pages.adminarea;

import org.openqa.selenium.By;
import org.testng.Assert;

public class AdminLogin {

    public static void navigate() {
        Browser.driver.get("http://shop.pragmatic.bg/admin");
    }


    public static void login() {
        Browser.driver.findElement(By.id("input-username")).sendKeys("admin3");
        Browser.driver.findElement(By.id("input-password")).sendKeys("parola123!");
        Browser.driver.findElement(By.cssSelector(".btn-primary")).click();
    }

        public static void verifyValidationMessage() {
            String actualValidationMessage = Browser.driver.findElement(By.cssSelector(".alert-success")).getText();
            Assert.assertTrue(actualValidationMessage.contains("Success"));

                  }


}
