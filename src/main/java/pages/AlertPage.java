package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class AlertPage {
    WebDriver driver;
    public AlertPage(WebDriver d){
        driver = d;
    }

    public void clickAlert(){
        driver.findElement(By.xpath("//a[normalize-space(text())='prompt happen']")).click();
        var wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert =driver.switchTo().alert();
        alert.sendKeys("Hello");
        takeScreenshot();
        alert.accept();



    }
    private void takeScreenshot(){
       File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileHandler.copy(screenshot,new File("resources/screenshots/hello.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    }

