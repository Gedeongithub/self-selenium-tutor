package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    private WebDriver driver;
    private WebDriverWait wait;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public WebFormPage clickWebFormPageLink(){
        driver.findElement(By.xpath("/html/body/ul/li[229]/a")).click();
        return new WebFormPage(driver);
    }

    public FormPage clickFormLink(){

//        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/ul/li[85]/a"))).click();

        driver.findElement(By.xpath("/html/body/ul/li[85]/a")).click();
//        clickLink("/html/body/ul/li[85]/a");
        return new FormPage(driver);
    }

    //Method to click any given link
    private void clickLink(String locator) {

        By by;

        // ID selector (e.g. "#loginBtn")
        if (locator.startsWith("#")) {
            by = By.id(locator.substring(1));
        }

        // CSS class selector (e.g. ".btn-primary")
        else if (locator.startsWith(".")) {
            by = By.cssSelector(locator);
        }

        // CSS full selector (div > span, input[name='q'], etc.)
        else if (locator.contains(">") || locator.contains("[") || locator.contains("=")) {
            by = By.cssSelector(locator);
        }

        // Fallback → treat as link text
        else {
            by = By.linkText(locator);
        }

        driver.findElement(by).click();
    }

    public DynamicPage clickDynamicLink(){
        driver.findElement(By.xpath("//a[normalize-space(text())='dynamicallyModifiedPage.html']")).click();
        return new DynamicPage(driver);
    }

    public void getTitle(){
        String title = driver.getTitle();
        String url = driver.getCurrentUrl();
        System.out.println("Title: "+title);
        System.out.println("url: "+url);
    }

    public NavigationPage open(){
        driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
        return new NavigationPage(driver);
    }
    public StartingTabPage StartingPage(){
        driver.get("https://www.selenium.dev/selenium/web/xhtmlTest.html#");
        return new StartingTabPage(driver);
    }
    public AlertPage openAlert(){
        driver.get("https://www.selenium.dev/selenium/web/alerts.html#");
        return new AlertPage(driver);
    }

    public FramePage openFrame(){
        driver.findElement(By.xpath("//a[normalize-space(text())='click_frames.html']")).click();
        return new FramePage(driver);
    }

    public PageToNewTab openPageToNewTab(){
        driver.get("https://www.selenium.dev/selenium/web/alerts.html#");
        return new PageToNewTab(driver);
    }
    public HoverPage openHoverPage(){
        driver.get("https://www.selenium.dev/selenium/web/mouseOver.html");
        return new HoverPage(driver);
    }

    public DoubleClickPage openDoubleClickPage(){
        driver.get("https://www.selenium.dev/selenium/web/mouse_interaction");
        return new DoubleClickPage(driver);
    }
    public ScrollPage openScrollPage(){
        driver.get("https://www.selenium.dev/selenium/web/overflow/x_auto_y_scroll.html");
        return new ScrollPage(driver);
    }

    public LongPage openLongPage(){
        driver.get("https://www.selenium.dev/selenium/web/scrolling_tests/page_with_tall_frame.html");
        return new LongPage(driver);
    }

    public DraggingPage OpenDraggingPage(){
        driver.get("https://www.selenium.dev/selenium/web/draggableLists.html");
        return new DraggingPage(driver);
    }

    public CopypastePage openCopypastePage(){
        driver.get("https://www.selenium.dev/selenium/web/formPage.html");
        return new CopypastePage(driver);
    }

    public KeysPage openKeysPage(){
        driver.get("https://www.selenium.dev/selenium/web/keyboard_shortcut.html");
        return new KeysPage(driver);
    }

}
