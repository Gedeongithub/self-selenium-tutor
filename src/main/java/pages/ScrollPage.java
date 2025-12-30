package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollPage {
    WebDriver driver;
    public ScrollPage(WebDriver driver){this.driver = driver;}

    public void scroll(){
        var element = driver.findElement(By.id("bottom"));
        new Actions(driver).scrollToElement(element).perform();
        try {
            Thread.sleep(2000);
            element.click();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
