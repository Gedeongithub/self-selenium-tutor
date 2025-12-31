package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CommandPayload;

public class CopypastePage {
    WebDriver driver;
    public CopypastePage(WebDriver driver){this.driver = driver;}

    public void copyPaste(){
        WebElement textTocopy = driver.findElement(By.id("withText"));
        WebElement elementTopasteTo = driver.findElement(By.id("emptyTextArea"));

        Keys ctrlCMD = Platform.getCurrent().is(Platform.WINDOWS) ? Keys.CONTROL: Keys.COMMAND;
        Actions action = new Actions(driver);
        action.click(textTocopy)
                .keyDown(ctrlCMD)
                .sendKeys("a")
                .sendKeys("c")
                .keyUp(ctrlCMD)
                .perform();

        action.click(elementTopasteTo)
                .keyDown(ctrlCMD)
                .sendKeys("v")
                .keyUp(ctrlCMD)
                .perform();

    }
}
