package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StartingTabPage {
    private WebDriver driver;
    public StartingTabPage(WebDriver driver){
        this.driver = driver;
    }
    public String originalTab;

    public void gotToReturn(){
        System.out.println("Started page: "+driver.getTitle());
        WebDriver.Navigation navigation = driver.navigate();
        driver.findElement(By.xpath("//a[normalize-space(text())='Open new window']")).click();
        System.out.println("Navigated page: "+driver.getTitle());
        navigation.back();
        System.out.println("Back to page: "+driver.getTitle());
        navigation.forward();
        System.out.println("Forward to current page: "+driver.getTitle());
    }

    public void openNewTab(){
        driver.findElement(By.xpath("//a[normalize-space(text())='Open new window']")).click();
        var tabs = driver.getWindowHandles();
        originalTab = driver.getWindowHandle();
        System.out.println("Previous Window: "+driver.getTitle());
        for(String tab:tabs){
            if(!tab.equals(originalTab)){
                toNewOne(tab);
                driver.close();
                break;
            }
        }
        toOldOne();
    }
    private void toNewOne(String tab){
        driver.switchTo().window(tab);
        System.out.println("Current Window: "+driver.getTitle());
    }

    private void toOldOne(){
        driver.switchTo().window(originalTab);
        System.out.println("Parent window: "+driver.getTitle());
    }
}
