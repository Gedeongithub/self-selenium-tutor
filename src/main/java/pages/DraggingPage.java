package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DraggingPage {
    WebDriver driver;
    public DraggingPage(WebDriver driver){this.driver = driver;}

    public void dragItem(){
        WebElement leftElement = driver.findElement(By.id("leftitem-1"));
        WebElement rightElement = driver.findElement(By.id("rightitem-1"));
        new Actions(driver).dragAndDrop(leftElement,rightElement).perform();
        var rightItems = driver.findElements(By.cssSelector("#sortable2 li"));
        rightItems.forEach(e -> System.out.println(e.getText()));
    }
}
