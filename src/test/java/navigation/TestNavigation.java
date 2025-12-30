package navigation;

import base.BaseTest;
import org.testng.annotations.Test;

public class TestNavigation extends BaseTest {

    @Test
    public void testNavigation(){
        var navigationPage = homePage.open();
        navigationPage.fillInfo("Gedeon");
    }

    @Test
    public void switchNewTab(){
        var tab = homePage.open();

    }
}
