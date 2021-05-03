package pages.adminarea;

import org.openqa.selenium.By;
import org.testng.Assert;

import static pages.adminarea.Browser.driver;

public class SuccessfulFunction {



    public static void proverjavame_dali_vouchera_e_uspeshno_sazdaden(String actualString) {
String actualsString = driver.findElement(By.cssSelector(".alert-success")).getText();

            Assert.assertEquals(actualsString, actualString);
        }

    public static void proverjavame_dali_vouchera_e_uspeshno_sazdaden() {
    }

   /* public static boolean isDisplayed() {
        // SuccessfulFunction.locator = locator;
        // return !Browser.driver.findElement((By.cssSelector(".alert-success"))).isEmpty();

        String actualString = driver.findElement(By.cssSelector(".alert-success")).getText();
        if (isDisplayed()) {
            assertTrue(actualString.contains("Success"));
        }*/
    }





