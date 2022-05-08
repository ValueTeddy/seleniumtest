import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:/Program Files/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver(); //Starts chrome
        driver.manage().deleteAllCookies(); //Clear cookies

        driver.get("https://xkcd.com/"); // Nice comics
        sleep(5000);

        for (int i = 0; i < 5; i++) { //Clicks Random 5 times, with 5 seconds inbetween.
            driver.findElement(By.linkText("Random")).click();
            System.out.println("clicked Random");
            sleep(5000);
        }
    }
}
