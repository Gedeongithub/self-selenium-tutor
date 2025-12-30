package tabs;

import base.BaseTest;
import org.testng.annotations.Test;

public class TestSwitchTabs extends BaseTest {

    @Test
    public void testSwitchTab(){
        var home = homePage.StartingPage();
        home.openNewTab();
    }
}
