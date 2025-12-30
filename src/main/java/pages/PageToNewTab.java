package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageToNewTab {
    WebDriver driver;
    public PageToNewTab(WebDriver driver){this.driver = driver;}

    public void openNewtab(){
        driver.findElement(By.id("open-window-with-onload-alert")).click();
        var firstTab = driver.getWindowHandle();
        for(String tab: driver.getWindowHandles()){
            if(!tab.equals(firstTab)){
                driver.switchTo().window(tab);
                break;
            }
        }
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();


        }
    }

