package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;

public class FramePage {
    WebDriver driver;
    public FramePage(WebDriver driver){this.driver = driver;}

    public void openOtherFrame(){
        setCookies();
        driver.switchTo().frame("source");
        driver.switchTo().frame("source");
        driver.findElement(By.xpath("//a[normalize-space(text())='I go to a target']")).click();
    }

    private void setCookies(){
        Cookie cookies = new Cookie.Builder("institution","TheGym")
                .domain("www.selenium.dev")
                .build();
        driver.manage().addCookie(cookies);

        Cookie cookie2 = new Cookie("trainer","Gedeon");
        driver.manage().addCookie(cookie2);
        Cookie student = driver.manage().getCookieNamed("trainer");
        System.out.println("Cookies' Domain: "+student.getDomain());
        System.out.println("Cookies' Number: "+driver.manage().getCookies().size());

    }



}
