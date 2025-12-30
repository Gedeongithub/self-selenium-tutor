package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DoubleClickPage {
    WebDriver driver;
    public DoubleClickPage(WebDriver driver){this.driver = driver;}

    public void doubleClick(){
       var result = driver.findElement(By.id("click-status"));
        var element = driver.findElement(By.id("clickable"));
        new Actions(driver).doubleClick(element).perform();
        var wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOf(result));
        System.out.println(result.getText());
    }
}
