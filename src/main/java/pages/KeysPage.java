package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class KeysPage {
    WebDriver driver;
    public KeysPage(WebDriver driver){this.driver = driver;}

    public void shortCut(){
        var body = driver.findElement(By.tagName("body"));
        Keys ctrlCMD = Platform.getCurrent().is(Platform.WINDOWS)? Keys.CONTROL:Keys.COMMAND;
        Keys shift = Keys.SHIFT;
        Keys altOption = Platform.getCurrent().is(Platform.WINDOWS)? Keys.ALT:Keys.OPTION;

        Actions action = new Actions(driver);
        action.click(body)
                .keyDown(ctrlCMD)
                .keyDown(shift)
                .keyDown(altOption)
                .sendKeys("1")
                .keyUp(ctrlCMD)
                .keyUp(shift)
                .keyUp(altOption)
                .perform();

    }
}
