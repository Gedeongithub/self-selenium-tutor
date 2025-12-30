package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebFormPage {
    private WebDriver driver;
    public WebFormPage(WebDriver driver){
        this.driver = driver;
    }
    private By textInput = By.id("my-text-id");
    private By passwordInput = By.name("my-password");
    private By textArea = By.name("my-textarea");
    private By selection = By.cssSelector(".form-select");

   

    public void fillOut(){
        driver.findElement(textInput).sendKeys("Gedeon");
        driver.findElement(passwordInput).sendKeys("12345");
        driver.findElement(textArea).sendKeys("In this world, everything is aligned in a way we can't even imagine");
        Select select = new Select(driver.findElement(selection));
        select.selectByVisibleText("Three");
    }

    public void checkBoxRadio(){
        By checked = By.id("my-check-1");
        By notchecked = By.id("my-check-2");
        By radio2 = By.id("my-radio-2");
        
        WebElement selected = driver.findElement(checked);
        if(selected.isSelected()){
            selected.click();
            driver.findElement(notchecked).click();
        }
        
        driver.findElement(radio2).click();
    }

    public void normalize(){
        driver.findElement(By.xpath("//a[normalize-space(text())='Return to index']")).click();
    }
}
