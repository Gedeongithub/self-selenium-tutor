package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicPage {
    private WebDriver driver;

    public DynamicPage(WebDriver driver){
        this.driver = driver;
    }


    public void waitForRemoval(){
        driver.findElement(By.id("buttonDelete")).click();
        WebElement elementToRemove = driver.findElement(By.id("element-to-remove"));
        var wait = new WebDriverWait(driver, Duration.ofSeconds(4));

        Boolean removed =wait.until(ExpectedConditions.invisibilityOf(elementToRemove));
        System.out.println(removed);
    }
}
