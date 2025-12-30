package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class FormPage {
    private WebDriver driver;


    public FormPage(WebDriver driver){
        this.driver = driver;
    }

    //Fill form
    public void fillForm(){
        WebElement a =driver.findElement(By.id("email"));
        a.click();
        a.sendKeys("Gedeon");
        WebElement b =driver.findElement(By.id("age"));
        b.click();

        b.sendKeys("1000");
    }

    public void checkIt(){
        WebElement c = driver.findElement(By.id("checky"));
        boolean isSelected = c.isSelected();
        if(!isSelected){
            c.click();
        }
    }
    public void dropDown(){
        Select element = new Select(driver.findElement(By.name("selectomatic")));
//        element.selectByVisibleText("Four");
//        element.deselectByVisibleText("Four");
        WebElement selectedOption = element.getFirstSelectedOption();
        List<WebElement> options = element.getAllSelectedOptions();
        for(WebElement option: options){
            System.out.println("Loop: "+option.getText());
        }

        System.out.println("Chosen: "+selectedOption.getText());
    }

    public void chooseFile(){
        String filePath = "C:\\Users\\Gedeon\\Desktop\\self-selenium-tutor\\resources\\chromedriver.exe";
        driver.findElement(By.id("upload")).sendKeys(filePath);
    }
    public void findElementByRelation(){
        driver.findElement(with(By.name("submit")).below(By.id("submit"))).click();
    }

}
