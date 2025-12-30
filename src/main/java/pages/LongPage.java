package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class LongPage {
    WebDriver driver;
    public LongPage(WebDriver driver){this.driver=driver;}

    public void scrollToPageBottom() throws InterruptedException {
        long height = (long) ((JavascriptExecutor) driver)
                .executeScript("return document.body.scrollHeight");

        int step = 300;
        for (int y = 0; y < height; y += step) {
            new Actions(driver).scrollByAmount(0, step).perform();
            Thread.sleep(200);
        }
    }

    }

