package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverPage {
    WebDriver driver;
    public HoverPage(WebDriver driver){this.driver = driver;}

    public void hoverOver(){
       var element= driver.findElement(By.id("redbox"));
        System.out.println("Color one: "+element.getCssValue("background-color"));
        new Actions(driver).moveToElement(element).perform();
        System.out.println("Color two: "+element.getCssValue("background-color"));


    }

}
