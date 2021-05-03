package pages.adminarea;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Browser {

    public static WebDriver driver;

    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\e.markov\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public static void quit() {

        driver.quit();
    }
}