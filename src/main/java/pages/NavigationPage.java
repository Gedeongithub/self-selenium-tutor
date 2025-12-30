package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class NavigationPage {

    private final WebDriver driver;

    public NavigationPage(WebDriver drive){
       this.driver = drive;
    }
    public void fillInfo(String info){
        driver.findElement(By.id("reveal")).click();
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(4))
                .pollingEvery(Duration.ofMillis(200))
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class);

        WebElement field = wait.until(d->{
            WebElement el = d.findElement(By.id("revealed"));
            return (el.isDisplayed() && el.isEnabled())? el:null;
        });
        if (field != null) {
            field.sendKeys(info);
        }
    }
}
